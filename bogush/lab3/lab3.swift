class RealString {
    let str : String
    init(_ str: String) {
        self.str = str
    }

    func compareWith(_ s2: RealString) {
        if (self.str.count > s2.str.count) {
            print("\"\(str)\" больше \"\(s2.str)\".")
        } else if (self.str.count < s2.str.count) {
            print("\"\(str)\" меньше \"\(s2.str)\".")
        } else {
            print("\"\(str)\" равен \"\(s2.str)\".")
        }
    }

    func compareWithString(_ s2: String) {
        if (str.count > s2.count) {
            print("\"\(str)\" больше \"\(s2)\".")
        } else if (str.count < s2.count) {
            print("\"\(str)\" меньше \"\(s2)\".")
        } else {
            print("\"\(str)\" равен \"\(s2)\".")
        }
    }
}

var string1 : String = ""
var string2 : String = ""
var string3 : String = ""
repeat {
    print("Введите первую строку: ")
    if let input1 = readLine(), !input1.isEmpty {
        string1 = input1
        break
    } else {
        print("Некорректный ввод.")
    }
} while (true)

repeat {
    print("Введите вторую строку: ")
    if let input2 = readLine(), !input2.isEmpty {
        string2 = input2
        break
    } else {
        print("Некорректный ввод.")
    }
} while (true)

let s1 = RealString(string1)
let s2 = RealString(string2)

s1.compareWith(s2)

repeat {
    print("Введите третью строку: ")
    if let input3 = readLine(), !input3.isEmpty {
        string3 = input3
        break
    } else {
        print("Некорректный ввод.")
    }
} while (true)

s1.compareWithString(string3)