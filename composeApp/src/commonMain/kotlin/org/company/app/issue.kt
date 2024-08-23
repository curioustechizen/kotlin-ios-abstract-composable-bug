package org.company.app

import androidx.compose.runtime.Composable

abstract class Base {
    @Composable
    abstract fun present(): String
}

//Uncomment the following 2 classes to see the bug

//abstract class Intermediate: Base() {
//    fun look() {
//        println("Look!")
//    }
//}
//
//class Concrete: Intermediate() {
//    @Composable
//    override fun present(): String {
//        return "Concrete"
//    }
//}

class NoIssue: Base() {
    @Composable
    override fun present(): String {
        return "NoIssue"
    }
    
    fun doSomething() {
        println("doSomething")
    }
}