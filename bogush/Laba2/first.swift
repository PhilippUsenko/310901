var isNormal = false
var number : Int = 0
repeat {
    print("Введите натуральное число n: ")
    if let input = readLine(), let helper = Int(input), helper >= 1 {
        number = helper
        isNormal = true
    } else {
        print("Ошибка: введите корректное натуральное число.")
    }
} while (!isNormal)

func canBeProductOfThreeNaturalNumbers(number n: Int) -> (answer: Bool, num: Int) {
    var k = 1
    repeat {
        if k * (k + 1) * (k + 2) == n {
            return (true, k)
        }
        k += 1
    } while k * (k + 1) * (k + 2) <= n
    return (false, -1)
}

let problem = canBeProductOfThreeNaturalNumbers(number: number)
if problem.answer == true {
    print("\(number) можно представить в виде произведения трех последовательных натуральных чисел: \(problem.num) * \(problem.num + 1) * \(problem.num + 2)")
} else {
    print("\(number) нельзя представить в виде произведения трех последовательных натуральных чисел.")
}