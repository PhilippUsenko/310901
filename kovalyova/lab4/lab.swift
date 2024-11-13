import Foundation

protocol Task {
    var name: String { get set }
    var isComplete: Bool { get set }
    func changeStatus(_ obj: Bool) -> Bool
}

struct TaskList: Task {
    var name: String
    var isComplete: Bool
    
    func changeStatus(_ obj: Bool) -> Bool {
        return !obj
    }
}

func main() {
    var tasks: [TaskList] = [
        TaskList(name: "Написать конспект по философии", isComplete: false),
        TaskList(name: "Выполнить лабораторную работу по СЯП", isComplete: false),
        TaskList(name: "Подготовить презентацию по КПО", isComplete: false)
    ]
    
    while true {
        print("\n========================")
        print(" Выберите из списка:")
        print("0. Выход")
        print("1. Просмотреть все задачи")
        print("2. Изменить статус задачи")
        print("3. Добавить задачу")
        print("4. Удалить задачу")
        print("========================")
        
        guard let choice = readLine(), let intChoice = Int(choice) else {
            print("Некорректный ввод")
            continue
        }
        
        switch intChoice {
        case 0:
            return
        case 1:
            print("Список задач:")
            for task in tasks {
                print("-------------------------------------------------")
                print("Задача: \(task.name)")
                print("Статус: \(task.isComplete ? "Выполнено" : "Не выполнено")")
            }
        case 2:
            print("Введите название задачи, статус которой нужно изменить")
            let choice2 = readLine() ?? ""
            var ifExist = false
            
            for i in tasks.indices {
                if tasks[i].name == choice2 {
                    tasks[i].isComplete = tasks[i].changeStatus(tasks[i].isComplete)
                    ifExist = true
                }
            }
            if ifExist {
                print("Статус задач с таким названием был успешно изменен")
            } else {
                print("Задачи с таким названием нет в списке")
            }
        case 3:
            print("Введите название задачи")
            let newTaskName = readLine() ?? ""
            print("Введите статус задачи: (true/false)")
            let newTaskStatus = readLine()?.lowercased() == "true"
            let newTask = TaskList(name: newTaskName, isComplete: newTaskStatus)
            tasks.append(newTask)
        case 4:
            print("Введите название задачи, которую нужно удалить")
            let choice2 = readLine() ?? ""
            var ifExist = false
            
            tasks.removeAll { task in
                if task.name == choice2 {
                    ifExist = true
                    return true
                }
                return false
            }
            if ifExist {
                print("Задачи с таким названием были успешно удалены")
            } else {
                print("Задачи с таким названием нет в списке")
            }
        default:
            print("Некорректный ввод")
        }
    }
}

main()
