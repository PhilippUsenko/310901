package Guns

import kotlin.random.Random

class AntiAirGun(_caliber: Double, _barrelLength: Double) : Gun(_caliber, _barrelLength) {

     override fun shoot() {
        println("Ведётся огонь из зенитной пушки!")
        Thread.sleep(1000)
        if (Random.nextBoolean()) println("Попадание!") else println("Промах!")
    }

}