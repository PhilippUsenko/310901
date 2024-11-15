package AirUnits

class Plane {

    fun launch() {
        println("Самолёт взлетел!")
        Thread.sleep(3000)
    }

    fun land() {
        println("Самолёт сел!")
        Thread.sleep(3000)
    }

    private fun bombPr() {
        println("Производится бомбардировка!")
        Thread.sleep(3000)
    }

    fun bomb() {
        bombPr()
    }
}