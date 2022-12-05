import java.io.PrintWriter
import java.util.StringTokenizer
import kotlin.math.pow
import kotlin.math.sqrt

//package com.franklinharper.codeforces.round555

tailrec fun removeZeroes(x: Int): Int =
    if (x % 10 == 0) removeZeroes(x / 10) else x

fun f(x: Int) = removeZeroes(x + 1)

//fun main() {
//    var n = readln().toInt()
//    val reached = mutableSetOf<Int>()
//    while (reached.add(n)) n = f(n)
//    println(reached.size)
//}

//private val INPUT = File("input.txt").inputStream()
//private val OUTPUT = File("output.txt").outputStream()
private val INPUT = System.`in`
private val OUTPUT = System.out

private val bufferedReader = INPUT.bufferedReader()
private val outputWriter = PrintWriter(OUTPUT, false)
private fun readLn() = bufferedReader.readLine()!!

private fun readList() = readLn().split(' ')
private var tokenizer = StringTokenizer("")
private fun read(): String {
    while (tokenizer.hasMoreTokens().not()) tokenizer = StringTokenizer(readLn(), " ")
    return tokenizer.nextToken()
}

private fun readInt() = read().toInt()
private fun readLong() = read().toLong()
private fun readDouble() = read().toDouble()

private fun readIntList() = readList().map { it.toInt() }
private fun readLongList() = readList().map { it.toLong() }
private fun readDoubleList() = readList().map { it.toDouble() }

private fun readIntArray(n: Int = 0) =
    if (n == 0) readList().run { IntArray(size) { get(it).toInt() } } else IntArray(n) { readInt() }

private fun readLongArray(n: Int = 0) =
    if (n == 0) readList().run { LongArray(size) { get(it).toLong() } } else LongArray(n) { readLong() }

private fun readDoubleArray(n: Int = 0) =
    if (n == 0) readList().run { DoubleArray(size) { get(it).toDouble() } } else DoubleArray(n) { readDouble() }


private fun Int.modPositive(other: Int): Int = if (this % other < 0) ((this % other) + other) else (this % other)


private class ReachableNumbers {
    fun solveTestCase(input: Int): Set<Int> {
        var n = input
        val reached = mutableSetOf<Int>()
        while (reached.add(n)) n = f(n)
//    println(reached.size)

        return reached
    }
}

fun main() {
    repeat(readInt()) { input ->
        //TODO: Read in each Test Case
        var n = input
        val reached = mutableSetOf<Int>()
        while (reached.add(n)) n = f(n)
        println(reached)

//        outputWriter.println(
//            ReachableNumbers()
//                .solveTestCase(input)
//        )
    }
    outputWriter.flush()
}