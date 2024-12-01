func DelEven(_ arr: inout [Int]) -> [Int] {
    arr.removeAll { $0 % 2 == 0 && $0 != 0 }
    return arr
}

func DelBetweenZeros(_ arr: inout [Int]) -> [Int] {
    var startIndex: Int? = nil
    
    for (index, item) in arr.enumerated() {
        if item == 0 {
            if let start = startIndex {
                arr.removeSubrange((start + 1)..<index)
                startIndex = nil
            } else {
                startIndex = index
            }
        }
    }
    return arr
}


func DivideFraction(_ firstNum: Int, _ firstDen: Int, _ secondNum: Int, _ secondDen: Int) -> (resNum: Int, resDen: Int) {
    
    guard firstDen != 0 && secondDen != 0 else {
        fatalError("Denominator cannot be zero.")
    }
    
    var resNum = firstNum * secondDen
    var resDen = firstDen * secondNum
    
    
    let gcd = GCD(resNum, resDen)
    resNum /= gcd
    resDen /= gcd
    
    return (resNum, resDen)
}

func GCD(_ a: Int, _ b: Int) -> Int {
    return b == 0 ? a : GCD(b, a % b)
}
