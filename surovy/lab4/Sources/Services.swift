// Класс валидации задачи, реализующий протокол ValidatorProtocol
class TaskValidator: ValidatorProtocol {
    func validateTitle(_ title: String) throws {
        if title.isEmpty || title.count < 3 {
            throw ValidationError.invalidTitle
        }
    }
}
