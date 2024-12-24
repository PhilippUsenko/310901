print("\n")

// Примеры использования
let user1 = Nikola(name: "Максим", age: 25)
print(user1.getInfo()) // Вывод: "Имя: Я не Максим, а Николай, Возраст: 25"

let user2 = Nikola(name: "Николай", age: 30)
print(user2.getInfo()) // Вывод: "Имя: Николай, Возраст: 30"

// Изменение значений
user1.name = ""
user1.age = 200
print(user1.getInfo()) // Вывод: "Имя: Николай, Возраст: 0"

// Корректное изменение значений
user2.name = "Анна"
user2.age = 35
print(user2.getInfo()) // Вывод: "Имя: Я не Анна, а Николай, Возраст: 35"



