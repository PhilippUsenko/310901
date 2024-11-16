package housing
import person.Person

class Apartment {

    private val residents = mutableMapOf<Address, Array<Person?>>()
    private val rooms: Array<Boolean> = arrayOf(false, false, false)

    // Принять жильца
    fun acceptResident(person: Person, address: Address): Address? {
        val currentResidents = residents.getOrPut(address) { arrayOfNulls(3) }
        val roomNumber = allocateRoom(currentResidents, person)
        if (roomNumber != -1 ) {
            print("${person.getFullName()} был заселен в №$roomNumber комнату.")
            returnAddress(address)
            return address
        } else {
            println("Нет свободных комнат по адресу ${address.getFullAddress()}.")
            return null
        }
    }

    // Отпустить жильца
    fun releaseResident(person: Person, address: Address, roomNumber: Int): Boolean {
        val currentResidents = residents[address]
        if (currentResidents != null && roomNumber in 1..3 && currentResidents[roomNumber - 1] == person) {
            freeRoom(currentResidents, roomNumber - 1)
            println("Жилец ${person.getFullName()} был отпущен из №$roomNumber комнаты по адресу ${address.getFullAddress()}.")
            return true
        }
        println("Такого жильца нет.")
        return false
    }

    // Выделить комнату
    private fun allocateRoom(currentResidents: Array<Person?>, person: Person): Int {
        for (i in currentResidents.indices) {
            if (currentResidents[i] == null) {
                currentResidents[i] = person
                println("Выделена №${i+1} комната.")
                rooms[i]=true;
                return i + 1
            }
        }
        return -1
    }

    // Освободить комнату
    private fun freeRoom(currentResidents: Array<Person?>, roomIndex: Int) {
        currentResidents[roomIndex] = null
        rooms[roomIndex] = false;
        getConfirmation(roomIndex);
    }

    // вернуть адрес
    fun returnAddress(address: Address) {
        println("по адресу ${address.getFullAddress()}");
    }

    // Вернуть подтверждение
    fun getConfirmation(roomIndex: Int){
        if (!rooms[roomIndex]){
            println("Освобождена №${roomIndex+1} комната.")
        }
    }
}