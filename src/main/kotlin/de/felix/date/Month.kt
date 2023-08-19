package de.felix.date

enum class Month(val month: String, val index : Int, private val days: Int, private val leapYearDays: Int) {
    JANUARY("January", 1, 31, 31),
    FEBRUARY("February", 2, 28, 29),
    MARCH("March", 3, 31, 31),
    APRIL("April", 4, 30, 30),
    MAY("May", 5, 31, 31),
    JUNE("June", 6, 30, 30),
    JULY("July", 7, 31, 31),
    AUGUST("August", 8, 31, 31),
    SEPTEMBER("September", 9, 30, 30),
    OCTOBER("October", 10, 31, 31),
    NOVEMBER("November", 11, 30, 30),
    DECEMBER("December", 12, 31, 31);

    fun daysInMonth(year: Int): Int {
        return if (this == FEBRUARY && isLeapYear(year)) leapYearDays else days
    }

    private fun isLeapYear(year: Int): Boolean {
        return when {
            year % 400 == 0 -> true
            year % 100 == 0 -> false
            year % 4 == 0 -> true
            else -> false
        }
    }
}