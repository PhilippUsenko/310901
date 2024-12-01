
import Foundation
let fraction = DivideFraction(2, 3, 2, 3)

print("Конечная дробь \(fraction.resNum)/\(fraction.resDen)")

var arr: [Int] = [1, 5, 0, 2, 5, 4, 7, 4, 0]
var deleven: (inout [Int]) -> [Int] = DelEven
print(deleven(&arr))

var delBetweenZeros: (inout [Int]) -> [Int] = DelBetweenZeros
print(delBetweenZeros(&arr))
