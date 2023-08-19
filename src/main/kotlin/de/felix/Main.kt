package de.felix

import de.felix.date.IncrementDate
import de.felix.date.Month
import de.felix.date.Year

fun main(args: Array<String>) {


    val date = IncrementDate(4)

    for (i in 0..<100) {
        println(date.getDate())
        date.increment()
    }

    date.setSpeed(2)

    for (i in 0..<100) {
        println(date.getDate())
        date.increment()
    }
}