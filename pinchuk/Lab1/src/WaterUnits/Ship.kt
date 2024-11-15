package WaterUnits

import Guns.MainGun

abstract class Ship (_name: String, _displacement: Double) {

    protected val name = _name
    protected val displacement=_displacement
     open fun swim() {
        println("Корабль $name плывёт")
        Thread.sleep(1000)
    }

     open fun shoot() {
        println("Корабль стреляет")
        MainGun(40.0,75.0).shoot()
    }
}