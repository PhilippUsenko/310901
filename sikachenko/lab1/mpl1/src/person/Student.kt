package person

import housing.Address
import housing.Apartment

class Student(firstName: String, lastName: String) : Person(firstName, lastName) {

    override fun settle(address: Address, apartment: Apartment): Address? {
        return apartment.acceptResident(this, address)
    }

    override fun evict(address: Address, apartment: Apartment, roomNumber: Int): Boolean {
        return apartment.releaseResident(this, address, roomNumber)
    }

    fun study() {
        val range = 1..3
        for ( i in range) {
            println("${getFullName()} учится...")
            Thread.sleep(500)
        }
        println("${getFullName()} завершил изучение.")
    }
}