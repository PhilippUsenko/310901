import Foundation

let sumInts: (Int, Int) -> Int = { (a: Int, b: Int) in
    return a + b
}

let sumComplex: (Double, Double, Double, Double) -> String = { (a1: Double, i1: Double, a2: Double, i2: Double) in
    return String(a1 + a2) + " + " + String(i1 + i2) + "i"
}

while (true) {
    print("Выберите действие: ")
    print("1. Сумма целых чисел.")
    print("2. Сумма комплексных чисел.")
    print("3. Выход.")
    var number : Int = 0
    if let input = readLine(), let helper = Int(input), helper >= 1, helper <= 3 {
        number = helper
    } else {
        print("Ошибка: введите корректное число.")
        continue
    }

    if number == 1 {
        var first : Int = 0
        var second : Int = 0
        while (true) {
            print("Введите первое целое число: ")
            if let input = readLine(), let helper = Int(input) {
                first = helper
                break
            } else {
                print("Ошибка: введите корректное целое число.")
            }
        }
        while (true) {
            print("Введите второе целое число: ")
            if let input = readLine(), let helper = Int(input) {
                second = helper
                break
            } else {
                print("Ошибка: введите корректное целое число.")
            }
        }
        print("Сумма \(first) + \(second) равна \(sumInts(first, second))")
        Thread.sleep(forTimeInterval: 5.0)
        continue
    }

    if number == 2 {
        var real1 : Double = 0
        var real2 : Double = 0
        var imagin1 : Double = 0
        var imagin2 : Double = 0
        while (true) {
            print("Введите первое действительное число: ")
            if let input = readLine(), let helper = Double(input) {
                real1 = helper
                break
            } else {
                print("Ошибка: введите корректное действительное число.")
            }
        }
        while (true) {
            print("Введите первое мнимое число: ")
            if let input = readLine(), let helper = Double(input) {
                imagin1 = helper
                break
            } else {
                print("Ошибка: введите корректное мнимое число.")
            }
        }
        while (true) {
            print("Введите второе действительное число: ")
            if let input = readLine(), let helper = Double(input) {
                real2 = helper
                break
            } else {
                print("Ошибка: введите корректное действительное число.")
            }
        }
        while (true) {
            print("Введите второе мнимое число: ")
            if let input = readLine(), let helper = Double(input) {
                imagin2 = helper
                break
            } else {
                print("Ошибка: введите корректное мнимое число.")
            }
        }
        print("Сумма \(real1) + \(imagin1)i и \(real2) + \(imagin2)i равна \(sumComplex(real1, imagin1, real2, imagin2))")
        Thread.sleep(forTimeInterval: 10.0)
        continue
    }

    if number == 3 {
        break
    }

    else {
        print("Некорректный ввод.")
        continue
    }
}