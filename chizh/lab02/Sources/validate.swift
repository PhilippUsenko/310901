class validate {
    public static func getForTask1() -> Int {
        var x: Int
        var s: String?
        while true {
            print("Введите число больше 2: ")
            s = readLine()
            if (s == nil || Int.init(s!) == nil) {
                print("Ошибка ввода!")
                continue
            }
            x = Int.init(s!)!
            if (x <= 2) {
                print("Число должно быть больше 2!")
                continue
            }
            return x
        }
    }

    enum type: CaseIterable {
        case real, complex
    }

    public static func getForTask2() -> (real1: Int, imaginary1: Int, real2: Int, imaginary2: Int) {
        let real: Bool = getCase() == type.real
        var real1: Int = get(text: "Введите первое действительное число: ")
        var imaginary1: Int = real ? 0 : get(text: "Введите первое мнимое число: ")
        var real2: Int = get(text: "Введите второе действительное число: ")
        var imaginary2: Int = real ? 0 : get(text: "Введите второе мнимое число: ")
        return (real1, imaginary1, real2, imaginary2)
    }

    private static func getCase() -> type {
        var choose: Int = 0
        while true {
            choose = get(text: "Выбери тип чисел (1 - действительные/2 - комплексные):")
            if (choose < 1 || choose > 2) {
                print("Ошибка ввода!")
                continue
            }
            break
        }
        return type.allCases[choose - 1]
    }

    private static func get(text: String) -> Int {
        var s: String?
        while true {
            print(text)
            s = readLine()
            if (s == nil || Int.init(s!) == nil) {
                print("Ошибка ввода!")
                continue
            }
            return Int.init(s!)!
        }
    }
}