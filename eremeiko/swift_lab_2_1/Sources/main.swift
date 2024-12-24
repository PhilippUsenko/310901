import Foundation

print("Введите натуральное число n: ", terminator: "")
if let input = readLine(), let n = Int(input) {
    if n <= 1 {
        print("Число \(n) не является ни простым, ни составным")
    } else {
        var isSimple = true

        for i in 2..<n {
            if n % i == 0 { // Если число делится на что-то, кроме 1 и самого себя
                isSimple = false
                break // Выходим из цикла, если найден делитель
            }
        }

        if isSimple {
            print("Число \(n) - простое")
        } else {
            print("Число \(n) - составное")
        }
    }
} else {
    print("Некорректный ввод!")
}

