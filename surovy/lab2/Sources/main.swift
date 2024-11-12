let task1: Task1 = Task1()

print("Введите n: ")
let n = Int(readLine()!)!
print("Введите k: ")
let k = Int(readLine()!)!
task1.replaceWithSumOfSquares(n, k: k)

let task2: Task2 = Task2()
let numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9]
task2.countOddNumbers(in: numbers)

let task3: Task3 = Task3()
task3.spaceCounter()
