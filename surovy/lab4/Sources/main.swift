import Foundation

// Список задач, работающий с экземплярами протокола TaskProtocol
class TaskManager {
    var tasks: [TaskProtocol] = []
    
    // Метод для добавления задачи
    func addTask(title: String) {
        do {
            let newTask = try Task(title: title)
            tasks.append(newTask)
            print("Задача добавлена: \(newTask.getInfo())")
        } catch ValidationError.invalidTitle {
            print("Ошибка: заголовок задачи должен содержать не менее 3 символов.")
        } catch {
            print("Неизвестная ошибка.")
        }
    }
    
    // Метод для вывода информации о задачах
    func showTasks() {
        for task in tasks {
            print(task.getInfo())
        }
    }
    
    // Метод для изменения статуса задачи
    func toggleTaskStatus(at index: Int) {
        guard index >= 0 && index < tasks.count else {
            print("Ошибка: некорректный индекс задачи.")
            return
        }
        tasks[index].toggleStatus()
    }
}

// Пример использования
let taskManager = TaskManager()

// Добавление задач
taskManager.addTask(title: "Подготовить презентацию")
taskManager.addTask(title: "Сделать ДЗ")
taskManager.addTask(title: "") // Неверный ввод

// Вывод всех задач
taskManager.showTasks()

// Изменение статуса первой задачи
taskManager.toggleTaskStatus(at: 0)

// Вывод всех задач после изменения статуса
taskManager.showTasks()
