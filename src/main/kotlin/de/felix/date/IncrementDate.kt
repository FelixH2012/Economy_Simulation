package de.felix.date

class IncrementDate(private var speed: Int) {
    private var day = 1
    private var month = Month.JANUARY
    private var year = 2023

    fun increment() {
        for (i in 0..<speed) {
            day++
            if (day > month.daysInMonth(year)) {
                day = 1
                month = Month.entries.toTypedArray()[(month.ordinal + 1) % 12]
                if (month == Month.JANUARY) {
                    year++
                }
            }
        }
    }

    fun getDate(): String {
        return "${month.month} $day, $year"
    }

    fun setSpeed(newSpeed: Int) {
        speed = newSpeed
    }
}