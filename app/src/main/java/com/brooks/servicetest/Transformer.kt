package com.brooks.servicetest

interface Transformer<in T> {
    fun transform(name: String, age: Int): @UnsafeVariance T
}

fun main() {
    val trans = object: Transformer<Person> {
        override fun transform(name: String, age: Int): Person {
            return Teacher(name, age)
        }
    }
    handleTransformer(trans)
}


fun handleTransformer(trans: Transformer<Student>) {
//    val student = Student("Tom", 19)
    val result = trans.transform("Tom", 19)
}
