package WaterUnits

import AirUnits.Plane
import Guns.AntiAirGun

class AircraftСarrier(_name: String, _displacement: Double) : Ship(_name, _displacement) {

    fun launchPlane() {
        println("Самолёт начал взлёт!")
        Thread.sleep(1000)
        Plane().launch()
    }

    fun landPlane() {
        println("Авианосец принял на палубу!")
        Thread.sleep(1000)
    }

    fun antiAirShoot() {
        AntiAirGun(15.0,32.5).shoot()
    }
}