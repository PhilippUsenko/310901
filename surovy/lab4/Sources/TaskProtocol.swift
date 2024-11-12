protocol TaskProtocol {
    var title: String { get set }
    var isCompleted: Bool { get set }
    
    func getInfo() -> String
    mutating func toggleStatus()
}

// Протокол для валидации
protocol ValidatorProtocol {
    func validateTitle(_ title: String) throws
}
