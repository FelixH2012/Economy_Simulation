package de.felix

import de.felix.date.Month
import de.felix.date.Year

fun main(args: Array<String>) {


    val year = Year(2021)

    println("Days in month: ${year.daysInMonth(Month.FEBRUARY)}")

}