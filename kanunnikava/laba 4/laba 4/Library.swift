//Library
////
//Library

import Foundation

public class Library {
    private var books: [Book] = [] // массив объектов, соответствующих протоколу Book

public init() {} // специальный метод, который позволяет создать объект класса без необходимости передавать какие-либо данные
// когда не нужно ничего заранее задавать или когда мы хотим, чтобы объект сам себя настроил
    
    public func addBook(_ book: Book) { // добавление в библиотеку
        books.append(book)
    }
    
    public func displayBookInformation() { // вывод информацию обо всех книгах в библиотеке.
        for book in books { // цикл, который проходит по всем объектам book в массиве books
            print(book.information())
        }
    }
    
    public func booksByAuthor(_ author: String) -> [Book] { // метод, который принимает строку author и возвращает массив книг этого автора
        return books.filter { $0.author == author } // возврат нового массива, содержащего только те книги, у которых автор совпадает с переданным значением author
    }
    
    public func booksByYear(_ year: Int) -> [Book] {
        return books.filter { $0.publicationYear == year } // возврат нового массива, содержащего только те книги, у которых год совпадает с переданным значением year
    }
}
/////

//Validator

import Foundation

public struct Validator1 {
    public static func validate1(title: String, author: String, publicationYear: Int) -> Bool { // метод, который принимает три параметра,
    //он возвращает логическое значение (Bool), указывающее, действительны ли введенные данные
        return !title.isEmpty && !author.isEmpty && publicationYear > 0 && publicationYear <= Calendar.current.component(.year, from: Date())
    }
}
