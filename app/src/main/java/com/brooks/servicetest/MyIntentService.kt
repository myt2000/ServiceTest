package com.brooks.servicetest

import android.app.job.JobParameters
import android.app.job.JobService
import android.content.Intent
import android.util.Log
import kotlin.concurrent.thread

class MyIntentService : JobService() {
    override fun onDestroy() {
        super.onDestroy()
        Log.d("JobService", "onDestroy: executed")
    }

    override fun onStartJob(params: JobParameters?): Boolean {
        Log.d("JobService", "onStartJob: ${Thread.currentThread().name}, ${Thread.currentThread().id}")
        thread {
            Log.d("JobService", "onStartJob: ${Thread.currentThread().name}, ${Thread.currentThread().id}")
        }
        return true
    }

    override fun onStopJob(params: JobParameters?): Boolean {
        Log.d("JobService", "onStopJob: ${Thread.currentThread().name}, ${Thread.currentThread().id}")
        return true
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d("JobService", "onStartCommand: ${Thread.currentThread().name}, ${Thread.currentThread().id}")
        thread {
            Log.d("JobService", "onStartCommand: ${Thread.currentThread().name}, ${Thread.currentThread().id}")
            stopSelf()
        }
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onCreate() {
        super.onCreate()
        Log.d("JobService", "onCreate: ${Thread.currentThread().name}, ${Thread.currentThread().id}")
    }

}