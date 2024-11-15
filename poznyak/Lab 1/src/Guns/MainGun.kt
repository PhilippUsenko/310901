package Guns

class MainGun(_caliber: Double, _barrelLength: Double) : Gun(_caliber, _barrelLength){

    override fun shoot(){
        println("Ведётся огонь из главной пушки!")
        Thread.sleep(3000)
    }

}