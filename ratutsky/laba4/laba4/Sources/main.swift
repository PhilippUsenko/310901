import Foundation

let functions = Functions()

// Пример списка файлов
let files: [Protocol] = [
    File(name: "Document1.txt", size: 120, creationDate: Date(), accessCount: 5)!,
    File(name: "Document2.txt", size: 300, creationDate: Date(), accessCount: 10)!,
    File(name: "Document3.txt", size: 200, creationDate: Date(), accessCount: 2)!
]

// Сортировка по имени
let sortedFiles: [any Protocol] = functions.sortFilesByName(files: files)
print("Сортировка по имени:")
sortedFiles.forEach { print($0.name) }

// Фильтрация по размеру
let largeFiles: [any Protocol] = functions.filterFilesBySize(files: files, minSize: 150)
print("\nФайлы больше 150KB:")
largeFiles.forEach { print($0.name) }

// Фильтрация по числу обращений
let popularFiles: [any Protocol] = functions.filterFilesByAccessCount(files: files, minAccessCount: 5)
print("\nПопулярные файлы:")
popularFiles.forEach { print($0.name) }