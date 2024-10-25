import Foundation

let arrayManager = ArrayManager()
arrayManager.inputElements()
arrayManager.outputElements()

if let maxElement = arrayManager.findMax()
{ print("Максимальный элемент: \(maxElement)") }

if let minElement = arrayManager.findMin()
{ print("Минимальный элемент: \(minElement)") }

print("Сумма элементов: \(arrayManager.sumElements())")

arrayManager.sortElements()
print("Отсортированные элементы: \(arrayManager.elements)")

arrayManager.multiplyElements()
print("Элементы после умножения: \(arrayManager.elements)")
