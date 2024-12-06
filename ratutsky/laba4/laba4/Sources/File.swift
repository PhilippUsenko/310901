import Foundation

class File: Protocol {
    let name: String
    let size: Int
    let creationDate: Date
    let accessCount: Int

    init?(name: String, size: Int, creationDate: Date, accessCount: Int) {
        // Валидация данных
        guard !name.isEmpty, size > 0, accessCount >= 0 else {
            print("Ошибка: неверные данные")
            return nil
        }
        self.name = name
        self.size = size
        self.creationDate = creationDate
        self.accessCount = accessCount
    }
}
