package org.codetome.kotlin.examples.lambdas

class KotlinFilterOperation {

    private val items = listOf<String>()

    /**
     * The syntax for a function reference is `(ParamType1, ...ParamTypeN) -> ReturnType`
     */
    fun filterBy(fn: (String) -> Boolean) = items.filter(fn)

    /**
     * Kotlin comes with handy extension methods like `isNotEmpty`
     * on JDK classes.
     */
    fun doFilter() {
        filterBy(String::isNotEmpty)
    }

    companion object {
        val reference = KotlinFilterOperation()::filterBy
    }
}