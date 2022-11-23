package com.brooks.servicetest

import android.app.job.JobParameters
import android.app.job.JobService
import android.util.Log

class MyIntentService : JobService() {
    override fun onDestroy() {
        super.onDestroy()
        Log.d("JobService", "onDestroy: executed")
    }

    override fun onStartJob(params: JobParameters?): Boolean {
        Log.d("JobService", "onStartJob: ${Thread.currentThread().name}")
        return true
    }

    override fun onStopJob(params: JobParameters?): Boolean {
        Log.d("JobService", "onStartJob: ${Thread.currentThread().name}")
        return true
    }
}