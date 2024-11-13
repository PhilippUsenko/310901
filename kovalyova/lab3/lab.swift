import Foundation

class Cat {
    private var counter = 0
    private var numYes = 0
    private var numNo = 0
    
    init(name: String) {
    }
    
    func toAnswer() {
        if counter == 0 || counter % 2 == 0 {
            print("moore-moore")
            numberYes()
        } else if counter % 2 == 1 {
            print("meow-meow")
            numberNo()
        }
        Thread.sleep(forTimeInterval: 1.5)
        counter += 1
    }

    func numberYes() -> Int {
        numYes += 1
        return numYes
    }

    func numberNo() -> Int {
        numNo += 1
        return numNo
    }
}

// Основная функция
func main() {
    print("Введите имя котенка")
    let name = readLine() ?? ""
    let cat = Cat(name: name)

    while true {
        print("======================================================")
        print("1. Задать вопрос котенку и узнать ответ")
        print("2. Узнать общее количество ответов 'moore-moore'(да)")
        print("3. Узнать общее количество ответов 'meow-meow'(нет)")
        print("4. Выход")
        print("======================================================")
        print("Выберите пункт меню:")
        
        var choose = 0
        if let input = readLine(), let option = Int(input) {
            choose = option
        } else {
            print("Некорректный ввод")
        }
        
        switch choose {
        case 1:
            print("Введите вопрос:")
            let line = readLine() ?? ""
            print("\(line) ответ: ")
            cat.toAnswer()
        case 2:
            let nY = cat.numberYes()
            print("Общее количество ответов 'moore-moore'(да) \(nY - 1)")
            Thread.sleep(forTimeInterval: 1.5)
        case 3:
            let nN = cat.numberNo()
            print("Общее количество ответов 'meow-meow'(нет) \(nN - 1)")
            Thread.sleep(forTimeInterval: 1.5)
        case 4:
            return
        default:
            print("Некорректный выбор")
        }
    }
}

main()
