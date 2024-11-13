func decimalDivision() {
    var num1: Double = 0.0
    var num2: Double = 0.0
    var time = true
    while (time)
    {
    print("Введите первое десятичное число для деления:")
    if let input1 = readLine(), let value1 = Double(input1) {
            num1 = value1
            time = false
    }
    else
    {
        print("Некорректный ввод\n")
    }
    }
    time = true
    while(time)
    {
    print("Введите второе десятичное число для деления:")
    if let input2 = readLine(), let value2 = Double(input2) {
            num2 = value2
            time = false
    }
    else
    {
        print("Некорректный ввод\n")
    }
    }
    let res = num1/num2
    print("Результат деления: \(res)")
}

func ordinaryDivision() {
    var time = true
    var ch1: Int = 0
    var z1: Int = 0
    var ch2: Int = 0
    var z2: Int = 0

    while time {
        print("Введите числитель первой дроби:")
        if let input1 = readLine(), let numerator1 = Int(input1) {
            ch1 = numerator1
            if ch1 == 0 {
                print("Результатом деления будет 0! Измените данные\n")
            } else {
                time = false
            }
        } else {
            print("Некорректный ввод. Пожалуйста, введите целое число.\n")
        }
    }
    time = true

    while time {
        print("Введите знаменатель первой дроби:")
        if let input2 = readLine(), let denominator1 = Int(input2) {
            z1 = denominator1
            if z1 == 0 {
                print("Нельзя делить на 0! Измените данные\n")
            } else {
                time = false
            }
        } else {
            print("Некорректный ввод. Пожалуйста, введите целое число.\n")
        }
    }
    time = true

    while time {
        print("Введите числитель второй дроби:")
        if let input3 = readLine(), let numerator2 = Int(input3) {
            ch2 = numerator2
            if ch2 == 0 {
                print("Нельзя делить на 0! Измените данные\n")
            } else {
                time = false
            }
        } else {
            print("Некорректный ввод. Пожалуйста, введите целое число.\n")
        }
    }
    time = true

    while time {
        print("Введите знаменатель второй дроби:")
        if let input4 = readLine(), let denominator2 = Int(input4) {
            z2 = denominator2
            if z2 == 0 {
                print("Нельзя делить на 0! Измените данные\n")
            } else {
                time = false
            }
        } else {
            print("Некорректный ввод. Пожалуйста, введите целое число.\n")
        }
    }

    let res = Double(ch1 * z2) / Double(ch2 * z1)
    print("Результат деления: \(res)")
}

var running = true
while running {
    print("\nМеню:\n")
    print("1. Деление десятичных дробей")
    print("2. Деление обыкновенных дробей")
    print("3. Выход из программы")

    if let input = readLine(), let choose = Int(input) {
        switch choose {
        case 1:
            decimalDivision()
        case 2:
            ordinaryDivision()
        case 3:
            running = false
        default:
            print("Некорректный ввод!")
        }
    } else {
        print("Некорректный ввод!")
    }
}

