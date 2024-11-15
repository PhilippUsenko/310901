package WaterUnits

import AirUnits.Plane
import Guns.AntiAirGun

class AircraftСarrier(_name: String, _displacement: Double) : Ship(_name, _displacement) {

    fun launchPlane() {
        println("Самолёт начал взлёт!")
        Thread.sleep(3000)
        Plane().launch()
    }

    fun landPlane() {
        println("Самолёт начал посадку!")
        Thread.sleep(3000)
        Plane().land()
    }

    fun antiAirShoot() {
        AntiAirGun(15.0,32.5).shoot()
    }
}