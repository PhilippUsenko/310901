import Foundation

func removeEvenNumbers(from numbers: [Int]) -> [Int] {
    return numbers.filter { $0 % 2 != 0 }
}

func inputArray() -> [Int] {
    print("Введите количество элементов в массиве:")
    
        guard let sizeInput = readLine(), let size = Int(sizeInput), size > 0 else {
        print("Некорректный ввод размера массива.")
        return []
    }
    
    var numbers: [Int] = []
    
    for i in 1...size {
        print("Введите элемент \(i) :")
        if let numberInput = readLine(), let number = Int(numberInput) {
            numbers.append(number)
        } else {
            print("Некорректный ввод. Элемент должен быть целым числом.")
        }
    }
    
    return numbers
}

let numbers = inputArray()
let oddNumbers = removeEvenNumbers(from: numbers)
print("Массив после удаления четных чисел: \(oddNumbers)")
