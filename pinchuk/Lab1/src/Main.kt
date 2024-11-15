import AirUnits.Plane
import WaterUnits.AircraftСarrier
import WaterUnits.Destroyer

fun main() {

    val aircraftСarrier = AircraftСarrier("Auram", 150.0)
    aircraftСarrier.swim()
    aircraftСarrier.launchPlane()
    Plane().bomb_public()
    Plane().land()
    aircraftСarrier.landPlane()
    val destroyer = Destroyer("Stinger", 75.5)
    destroyer.shootTorpedo()
    destroyer.shoot()
    destroyer.antiAirShoot()
}