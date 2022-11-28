package com.brooks.servicetest

class SimpleData<out T>(val data: T?) {
//    private var data: T? = null
//
//    fun set(t: T?){
//        data = t
//    }

    fun get(): T? {
        return data
    }
}

fun main() {
    val student = Student("Tom", 19)
    val data = SimpleData<Student>(student)
    HandleSimpleData(data) // 实际上这行代码会报错，这里假设它能编译通过
    val studentData = data.get()
}

fun HandleSimpleData(data: SimpleData<Person>)
{
    val teacher = Teacher("Jack", 35)
}


public interface List<out E> : Collection<E> {
    override val size: Int
    override fun isEmpty(): Boolean
    override fun contains(element: @UnsafeVariance E): Boolean
    override fun iterator(): Iterator<E>
    public operator fun get(index: Int): E
}
