import housing.Address
import housing.Apartment
import person.Student
import person.Worker

fun main() {
    val apartments = mutableMapOf<Address, Apartment>()
    val students = mutableListOf<Student>()
    val workers = mutableListOf<Worker>()

    while (true) {
        println("1. Заселиться");
        println("2. Выселиться");
        println("3. Учиться");
        println("4. Работать");
        println("5. Отобразить студентов");
        println("6. Отобразить работников");
        println("7. Выйти");
        var choice:Number;
        try{
            choice= readln().toInt()
        }catch(e:Exception){
            println("Неверный ввод")
            continue
        }
        when (choice) {
            1 -> {
                println("Введите имя:")
                val firstName = readln()
                println("Введите фамилию:")
                val lastName = readln()
                println("Кто вселяется? 1 - Студент, 2 - Работник:")
                val type = readln().toInt()
                println("Введите улицу:")
                val street = readln()
                println("Введите дом:")
                val house = readln().toInt()
                println("Введите квартиру:")
                val apartmentNum = readln().toInt()

                val address = Address(street, house, apartmentNum)
                val apartment = apartments.getOrPut(address) { Apartment() }

                when (type) {
                    1 -> {
                        val student = Student(firstName, lastName)
                        student.settle(address, apartment)
                        students.add(student)
                    }

                    2 -> {
                        val worker = Worker(firstName, lastName)
                        worker.settle(address, apartment)
                        workers.add(worker)
                    }
                }
            }

            2 -> {
                println("Введите улицу:")
                val street = readln()
                println("Введите дом:")
                val house = readln().toInt()
                println("Введите квартиру:")
                val apartmentNum = readln().toInt()
                println("Введите номер комнаты:")
                val roomNumber = readln().toInt()

                val address = Address(street, house, apartmentNum)
                val apartment = apartments[address]

                if (apartment == null) {
                    println("Такого адреса не существует.")
                    continue
                }

                println("Введите имя:")
                val firstName = readln()
                println("Введите фамилию:")
                val lastName = readln()

                val person = (students + workers).find { it.getFullName() == "$firstName $lastName" }

                if (person != null) {
                    if (person.evict(address, apartment, roomNumber)) {
                        students.remove(person)
                        workers.remove(person)
                    }
                } else {
                    println("Жилец не найден.")
                }
            }

            3 -> {
                println("Введите имя:")
                val firstName = readln()
                println("Введите фамилию:")
                val lastName = readln()

                val student = students.find { it.getFullName() == "$firstName $lastName" }
                student?.study() ?: println("Студент с таким именем не найден.")
            }

            4 -> {
                println("Введите имя:")
                val firstName = readln()
                println("Введите фамилию:")
                val lastName = readln()

                val worker = workers.find { it.getFullName() == "$firstName $lastName" }
                worker?.work() ?: println("Работник с таким именем не найден.")
            }

            5 -> {
                if(students.isEmpty()){
                    println("Среди жителей нет ни одного студента.")
                } else {
                    println("Список студентов:")
                    students.forEach { println(it.getFullName()) }
                }
            }

            6 -> {
                if(workers.isEmpty()){
                    println("Среди жителей нет ни одного работника.")
                } else {
                    println("Список работников:")
                    workers.forEach { println(it.getFullName()) }
                }
            }

            7 -> return
        }
    }
}