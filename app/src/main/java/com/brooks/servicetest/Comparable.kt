package com.brooks.servicetest

interface Comparable<in T> {
    operator fun compareTo(other: T):Int
}

