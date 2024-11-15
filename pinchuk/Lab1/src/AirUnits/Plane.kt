package AirUnits

import WaterUnits.AircraftСarrier

class Plane {

    fun launch() {
        println("Самолёт взлетел!")
        Thread.sleep(3000)
    }

    fun land() {
        println("Самолёт начал посадку!")
        Thread.sleep(3000)
    }

    private fun bomb() {
        println("Производится бомбардировка!")
        Thread.sleep(3000)
    }
    public fun bomb_public(){
        bomb()

    }

}