import Foundation

func getJapaneseYearName(year: Int) -> String {
    // Определение животного
    let animalArray: [(name: String, gender: String)] = [
        ("Обезьяна", "Ж"), ("Петух", "М"), ("Собака", "Ж"), ("Свинья", "Ж"),
        ("Крыса", "Ж"), ("Бык", "М"), ("Тигр", "М"), ("Кролик", "М"),
        ("Дракон", "М"), ("Змея", "Ж"), ("Лошадь", "Ж"), ("Овца", "Ж")
    ]
    let animalNum = year % 12  // остаток от деления номера года на 12 (4 год нашей эры - год Крысы (4 элемент в массиве животных); цикл продолжается 12 лет)
    let animal = animalArray[animalNum]

    // Определение цвета
    let colorArray: [(male: String, female: String)] = [
        ("Белый Металлический", "Белая Металлическая"),
        ("Черный Водяной", "Черная Водяная"),
        ("Синий Деревянный", "Синяя Деревянная"),
        ("Красный Огненный", "Красная Огненная"),
        ("Желтый Земляной", "Желтая Земляная")
    ]
    let colorNum = (year % 10) / 2
    let color = animal.gender == "Ж" ? colorArray[colorNum].female : colorArray[colorNum].male

    return "\(color) \(animal.name)"
}

func getZodiacSign(month: String) -> String {
    // Определение знака зодиака
    let zodiacArray: [(month: String, sign: String)] = [
        ("апрель", "Овен"), ("май", "Телец"), ("июнь", "Близнецы"), ("июль", "Рак"),
        ("август", "Лев"), ("сентябрь", "Дева"), ("октябрь", "Весы"), ("ноябрь", "Скорпион"),
        ("декабрь", "Стрелец"), ("январь", "Козерог"), ("февраль", "Водолей"), ("март", "Рыбы")
    ]
    let lowerMonth = month.lowercased() // Приведение к нижнему регистру

    for zodiac in zodiacArray {
        if zodiac.month == lowerMonth {
            return zodiac.sign
        }
    }
    return "Неизвестный месяц"
}

// Основная программа
print("Введите год: ", terminator: "")
if let yearInput = readLine(), let year = Int(yearInput) {
    print("Символ \(year) года по восточному календарю - \(getJapaneseYearName(year: year))\n")
}
else {
    print("Некорректный ввод!")
}


print("Введите месяц: ", terminator: "")
if let month = readLine() {
    print("Знак Зодиака - \(getZodiacSign(month: month))")
}
else {
    print("Некорректный ввод!")
}