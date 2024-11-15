package WaterUnits

import Guns.AntiAirGun
import Guns.MainGun

class Destroyer(_name: String, _displacement: Double) : Ship(_name, _displacement){

    private class Torpedo{

        fun explode() {
            println("Взрыв!")
        }
    }

    fun shootTorpedo() {
        println("Эсминец стреляет торпедой")
        Thread.sleep(3000)
        Torpedo().explode()
    }

    override fun shoot() {
        println("Эсминец стреляет")
        MainGun(40.0,75.0).shoot()
    }

    fun antiAirShoot() {
        AntiAirGun(15.0,32.5).shoot()
    }
}