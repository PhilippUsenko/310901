import Foundation

class ArrayManager
{
    var count: Int
    var elements: [Int]

    // Конструктор без параметров
    init()
    {
        self.count = 0
        self.elements = []
    }

    // Конструктор с параметрами
    init(count: Int, elements: [Int])
    {
        self.count = count
        self.elements = elements
    }

    // Конструктор копирования
    init(copyFrom other: ArrayManager)
    {
        self.count = other.count
        self.elements = other.elements
    }

    // Метод для ввода данных
    func inputElements() //валидауия для проверки корректности введеных данных
    {
        print("Введите количество элементов:")
        if let input = readLine(), let count = Int(input), count > 0
        {
            self.count = count
            self.elements = []
            for i in 1...count
            {
                print("Введите элемент \(i):")
                if let elementInput = readLine(), let element = Int(elementInput)
                {
                    self.elements.append(element)
                }
                else
                {
                    print("Ошибка: введено некорректное значение.")
                    return
                }
            }
        }
        else
        {
            print("Ошибка: введено некорректное значение.")
        }
    }

    // Метод для вывода данных
    func outputElements()
    { print("Элементы массива: \(elements)") }

    // Метод для поиска максимального элемента
    func findMax() -> Int?
    { return elements.max() }

    // Метод для поиска минимального элемента
    func findMin() -> Int?
    { return elements.min()}

    // Метод для сортировки массива
    func sortElements()
    { elements.sort()}

    // Метод для поиска суммы элементов
    func sumElements() -> Int
    { return elements.reduce(0, +) }

    // Метод для умножения элементов массива на число
    func multiplyElements()
    {
        print("Введите число для умножения элементов массива:")
        if let input = readLine(), let number = Int(input)
        {
            elements = elements.map { $0 * number }
        }
        else
        {
            print("Ошибка: введено некорректное значение.")
        }
    }
}
