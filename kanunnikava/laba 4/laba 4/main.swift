//main
import Foundation


let library = Library() // создание экземпляра класса Library и сохранение его в константе library

@MainActor
func promptForBook() -> Book? { // ввод названия книги, автора и года издания
    print("Введите название книги:")
    guard let title = readLine(), !title.isEmpty else {
    // считывается ввод пользователя и проверяется, что введенная строка не пуста
        print("Название книги не может быть пустым.")
        return nil     //Если строка пуста, выводится сообщение об ошибке и возвращается nil
    }
    
    print("Введите автора книги:")
    guard let author = readLine(), !author.isEmpty else {
     // считываеся ввод пользователя и проверяется, что введенная строка не пуста
        print("Имя автора книги не может быть пустым.")
        return nil
    }
    
    print("Укажите год публикации:")
    guard let yearString = readLine(), let year = Int(yearString), year > 0 else {
    // считывается ввод пользователя, преобразуем в число и проверяем, что год публикации больше 0
        print("Неверный год публикации.")
        return nil
    }
    
    return LibraryBook(title: title, author: author, publicationYear: year) // возврат нового объекта LibraryBook, созданный с введенными данными
}

@MainActor
func addBooksToLibrary(_ library: Library) { // добавление книги
    while true { // бесконечный цикл для многократного добавления книг
        if let book = promptForBook() {
            library.addBook(book) // добавление книги в библиотеку
        }
        
        print("Вы хотите написать еще одну книгу? (1: да, 2: нет)")
        if let response = readLine(), response.lowercased() != "1" { // // считывает ввод пользователя, если ответ не "1", выходим из цикла
            break
        }
    }
}

@MainActor
func searchBooks(library: Library) { // поиск книг по параметрам
    while true {
        print("Выберите вариант поиска:")
        print("1. Поиск книг по автору")
        print("2. Поиск книг по году издания")
        print("3. Выход в главное меню")
        
        guard let choice = readLine(), let option = Int(choice), (option >= 1 && option <= 3) else {
        // считывает ввод пользователя и проверяем, что введенное значение корректно
            print("Неверный выбор.")
            continue
        }
        
        if option == 1 {
            print("Введите имя автора:")
            if let author = readLine(), !author.isEmpty { // проверка, что введенная строка не пуста
                let books = library.booksByAuthor(author) // поиск необходимых книг
                print("Книги автора \(author):")
                for book in books { // цикл, который проходит по всем книгам в массиве books
                    print(book.information())
                }
            } else {
                print("Имя автора не может быть пустым.")
            }
        } else if option == 2 {
            print("Укажите год публикации:")
            if let yearString = readLine(), let year = Int(yearString) { // проверка, что ввод не является nil и присваивание его переменной yearString
                let books = library.booksByYear(year) // возврат массива книг, опубликованных в данном году, и присваивает его переменной books
                print("Книги, опубликованные в \(year):")
                for book in books { // цикл, который проходит по всем книгам в массиве books
                    print(book.information())
                }
            } else {
                print("Неверный год публикации.")
            }
        } else if option == 3 { // выход
            break
        }

        print("\nХотите выполнить другой поиск или выйти в главное меню? (1: Поиск, 2: Выход)")
        // запрос на повторный поиск или выход
        if let response = readLine(), response == "2" {
            break // выход из цикла при вводе "2"
        }
    }
}

@MainActor
func viewAllBooks(library: Library) { // вывод всех книг
    print("\nИнформация обо всех книгах в библиотеке:")
    library.displayBookInformation()
}
