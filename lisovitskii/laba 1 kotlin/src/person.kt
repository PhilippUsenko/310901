package com.example.medical
abstract class Person(protected val name: String, protected val age: Int) {
    abstract fun getInfo(): String
}