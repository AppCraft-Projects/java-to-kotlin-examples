package org.codetome.kotlin.examples.extensions

/**
 * This method acts as a decorator for all `List`s.
 * Compared to the java alternative this one-liner is much simpler.
 */
fun <T> List<T>.present() = this.joinToString(", ")
