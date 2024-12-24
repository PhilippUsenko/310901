class Nikola {
    private var internalName: String = "Николай"
    private var internalAge: Int = 0
    
    var name: String {
        get {
            return internalName
        }
        set(newName) {
            if newName.isEmpty {
                print("Ошибка: имя не может быть пустым. Установлено имя по умолчанию 'Николай'.\n")
                internalName = "Николай"
            } else if newName == "Николай" {
                internalName = newName
            } else {
                internalName = "Я не \(newName), а Николай"
            }
        }
    }
    
    var age: Int {
        get {
            return internalAge
        }
        set(newAge) {
            if newAge < 0 || newAge > 100 {
                print("Ошибка: возраст должен быть в диапазоне от 0 до 100. Установлен возраст по умолчанию 0.\n")
                internalAge = 0
            } else {
                internalAge = newAge
            }
        }
    }
    
    init(name: String, age: Int) {
        self.name = name
        self.age = age
    }
    
    func getInfo() -> String {
        return "Имя: \(name), Возраст: \(age)\n"
    }
}