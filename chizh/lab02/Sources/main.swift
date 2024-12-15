let first: task1 = task1(m: validate.getForTask1())

for element in first.result() {
    print("\(element.x), \(element.y), \(element.z)")
}


let second: task2 = task2(input: validate.getForTask2())

let answer = second.result()

print("Ответ: \(answer.real)\(answer.imaginary == 0 ? "" : (answer.imaginary > 0 ? "+\(answer.imaginary)i" : "\(answer.imaginary)i"))")
