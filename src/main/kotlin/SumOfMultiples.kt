object SumOfMultiples {

    fun sum(factors: Set<Int>, limit: Int): Int = factors.asSequence().minus(0)
                .map { (0 until limit).step(it) }.flatten().toSet().sum()

}
