fun main(args: Array<String>) {
    println((0..999)
            .asSequence()
            .filter { it % 3 == 0 || it % 5 == 0 }
            .sum())
}