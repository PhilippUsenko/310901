package person

import housing.Apartment
import housing.Address

abstract class Person(protected val firstName: String, protected val lastName: String) {

    abstract fun settle(address: Address, apartment: Apartment): Address?

    abstract fun evict(address: Address, apartment: Apartment, roomNumber: Int): Boolean

    fun getFullName() = "$firstName $lastName"
}