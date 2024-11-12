// Ошибки валидации
enum ValidationError: Error {
    case invalidTitle
}

// Класс задачи, реализующий протокол TaskProtocol
class Task: TaskProtocol {
    var title: String
    var isCompleted: Bool = false
    
    init(title: String) throws {
        // Валидация заголовка
        let validator = TaskValidator()
        try validator.validateTitle(title)
        self.title = title
    }
    
    // Метод для получения информации о задаче
    func getInfo() -> String {
        return "Задача: \(title), выполнено: \(isCompleted ? "да" : "нет")"
    }
    
    // Метод для изменения статуса задачи
    func toggleStatus() {
        isCompleted.toggle()
    }
}
