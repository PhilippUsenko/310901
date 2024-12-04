package Guns

abstract class Gun(_caliber: Double, _barrelLength: Double) {
        protected val caliber=_caliber
        protected val barrelLength=_barrelLength
     open fun shoot(){
        println("Выстрел!")
    }

}