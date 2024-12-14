// Определение протокола UniqueNumberGenerator
protocol UniqueNumberGenerator {
    func generate() -> Int // Метод для генерации уникального числа
}

// Класс, который будет использовать несколько генераторов уникальных чисел
class UniqueNumberGeneratorClass {
    private var generators: [UniqueNumberGenerator] // Массив генераторов

    // Инициализатор принимает массив генераторов и сохраняет его в свойство
    init(generators: [UniqueNumberGenerator]) {
        self.generators = generators
    }

    // Метод для генерации заданного количества уникальных чисел
    func generateUniqueNumbers(count: Int) -> [Int] {
        var uniqueNumbers = Set<Int>() 
        while uniqueNumbers.count < count { 
            for generator in generators {
                uniqueNumbers.insert(generator.generate()) 
                if uniqueNumbers.count >= count { 
                    break // Прерываем цикл
                }
            }
        }
        return Array(uniqueNumbers) // Преобразуем множество в массив и возвращаем
    }
}

// Реализация генератора случайных чисел
class RandomNumberGenerator: UniqueNumberGenerator {
    func generate() -> Int {
        return Int.random(in: 1...1000000) // Генерация случайного числа в диапазоне 
    }
}

// Реализация генератора инкрементальных чисел
class IncrementalNumberGenerator: UniqueNumberGenerator {
    private var current = 0 // Начальное значение
    func generate() -> Int {
        current += 1 
        return current 
    }
}

// Создаем экземпляры различных генераторов
let randomGenerator = RandomNumberGenerator()
let incrementalGenerator = IncrementalNumberGenerator()

// Создаем экземпляр класса, который использует все генераторы
let generatorClass = UniqueNumberGeneratorClass(generators: [randomGenerator, incrementalGenerator])

// Генерируем первую последовательность уникальных чисел
let uniqueNumbers1 = generatorClass.generateUniqueNumbers(count: 10)
print("Первая последовательность: \(uniqueNumbers1)")

// Генерируем вторую последовательность уникальных чисел
let uniqueNumbers2 = generatorClass.generateUniqueNumbers(count: 10)
print("Вторая последовательность: \(uniqueNumbers2)")