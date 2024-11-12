class Task2{
func countOddNumbers(in numbers: [Int]){
    var oddCount = 0
    for number in numbers {
        if number % 2 != 0 {
            oddCount += 1
        }
    }
    print("Кол-во нечётных: \(oddCount)")
    }
}
