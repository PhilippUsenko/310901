class Validate {
    public static func getInput() -> (name: String, age: Int) {
        var name: String?
        var s: String?
        var age: Int?
        while (true) {
            print("Введите ваше имя: ")
            name = readLine()
            if (name == nil) {
                print("Ошибка ввода!")
                continue
            }
            break
        }
        while (true) {
            print("Введите ваш возраст: ")
            s = readLine()
            if (name == nil || Int.init(s!) == nil) {
                print("Ошибка ввода!")
                continue
            }
            age = Int.init(s!)
            break
        }
        return (name: name!, age: age!)
    }
}