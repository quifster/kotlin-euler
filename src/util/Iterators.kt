package util

/**
 * Function to generate the Fibonacci sequence.
 */
fun fibonacci() = generateSequence(Pair(0, 1), { Pair(it.second, it.first + it.second) }).map { it.first }