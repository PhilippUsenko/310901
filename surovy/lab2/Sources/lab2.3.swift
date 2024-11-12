class Task3{
    func spaceCounter(){
        print("Введите строку: ")
        var count = 0
        let response = readLine()!

        response.forEach { 
            if $0 == " " {
                count += 1
            }
        }

    print("В вашей строке пробелов: \(count)")
    }
}