//Model
////
//Book
// протокола Book
public protocol Book {
    var title: String { get set }
    var author: String { get set }
    var publicationYear: Int { get set }
    
    func information() -> String // метод должен предоставлять информацию о книге
    //классы или структуры, соответствующие протоколу, должны реализовать этот метод
}
////

//LibraryBook
// Класс, реализующий протокол
class LibraryBook: Book {
    var title: String
    var author: String
    var publicationYear: Int
    
    init?(title: String, author: String, publicationYear: Int) { // инициализатор класса, который принимает три параметра
    //инициализатор является опциональным (?), что означает, что он может вернуть nil, если инициализация не удалась
        guard Validator1.validate1(title: title, author: author, publicationYear: publicationYear) else {
        // проверка, что все параметры инициализатора действительны
            return nil
        }
        self.title = title
        self.author = author
        self.publicationYear = publicationYear
    }
    
    func information() -> String { // объявление метода, который возвращает строку
        return "Название: \(title), Автор: \(author), Год публикации: \(publicationYear)"
    }
}
