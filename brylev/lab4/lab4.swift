/*Создать протокол Человек, (имя, фамилия, пол, год рождения).
Создать не менее 10 объектов данного протокола.
Вывести количество по мкжчин и женщин, количество человек на заданный год рождения*/

enum Gender
{
    case man
    case woman
}

protocol Human {
    var name: String { get }
    var surname: String { get }
    var gender: Gender { get }
    var yearOfBirth: Int { get }
}


class Person: Human
{
    let name: String
    let surname: String
    let gender: Gender
    let yearOfBirth: Int

    init(name: String, surname: String, gender: Gender, yearOfBirth: Int)
    {
        self.name = name
        self.surname = surname
        self.gender = gender
        self.yearOfBirth = yearOfBirth
    }
}

let humans: [Human] = [
    Person(name: "Иван", surname: "Иванов", gender: .man, yearOfBirth: 1990),
    Person(name: "Мария", surname: "Петрова", gender: .woman, yearOfBirth: 1985),
    Person(name: "Алексей", surname: "Сидоров", gender: .man, yearOfBirth: 1975),
    Person(name: "Елена", surname: "Кузнецова", gender: .woman, yearOfBirth: 1992),
    Person(name: "Дмитрий", surname: "Семенов", gender: .man, yearOfBirth: 1980),
    Person(name: "Светлана", surname: "Васильева", gender: .woman, yearOfBirth: 1995),
    Person(name: "Андрей", surname: "Дмитриев", gender: .man, yearOfBirth: 1988),
    Person(name: "Наталья", surname: "Коваленко", gender: .woman, yearOfBirth: 1991),
    Person(name: "Максим", surname: "Чистяков", gender: .man, yearOfBirth: 1982),
    Person(name: "Ольга", surname: "Луговая", gender: .woman, yearOfBirth: 1978)
]

func countByGender(humans: [Human]) -> (man: Int, woman: Int) {
    var manCount = 0
    var womanCount = 0
    
    for Human in humans {
        switch Human.gender {
        case .man:
            manCount += 1
        case .woman:
            womanCount += 1
        }
    }
    
    return (manCount, womanCount)
}

func countByAge(humans: [Human], year: Int) -> Int {
    return humans.filter { $0.yearOfBirth == year }.count
}

let gender = countByGender(humans: humans)
print("Количество мужчин: \(gender.man)")
print("Количество женщин: \(gender.woman)")

let count1990 = countByAge(humans: humans, year: 1990)
print("Количество людей, родившихся в 1990 году: \(count1990)")
