package de.felix.date

class Year(private val year: Int) {
    val months = Array(Month.entries.size) { i -> Month.entries[i] }

    fun daysInMonth(month: Month): Int {
        return month.daysInMonth(year)
    }
}