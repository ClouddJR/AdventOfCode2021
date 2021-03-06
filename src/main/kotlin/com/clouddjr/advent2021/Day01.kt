package com.clouddjr.advent2021

class Day01(private val input: List<Int>) {

    fun solvePart1() = countIncreased(2)

    fun solvePart2() = countIncreased(4)

    private fun countIncreased(size: Int) = input.windowed(size).count { window -> window.last() > window.first() }
}