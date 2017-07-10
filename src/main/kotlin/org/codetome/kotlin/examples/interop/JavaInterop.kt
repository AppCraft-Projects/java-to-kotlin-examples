package org.codetome.kotlin.examples.interop

class JavaInterop {

    fun helloJava() {
        KotlinInterop().helloJava()
    }

    fun helloKotlin() {
        println("Hello from Kotlin!")
    }

    companion object {

        @JvmStatic
        fun createInstance() = JavaInterop()
    }
}