import Foundation

protocol Math {
    associatedtype ValueType: Numeric
    var value: ValueType { get }

    func sum(_ val: ValueType) -> ValueType
    func min(_ val: ValueType) -> ValueType
    func mult(_ val: ValueType) -> ValueType
    func div(_ val: ValueType) -> Double
    func power(_ val: ValueType) -> Double
}
class Number<T: Numeric>: Math {
    var value: T
    init (_ value: T){
        self.value = value

    }
    
    func sum(_ val: T) -> T{
        return value + val
    }
    func min(_ val: T) -> T{
        return value - val
    }
    func mult(_ val: T) -> T{
        return value * val
    }
    func div(_ val: T) -> Double {
       
        if let divisor = val as? Double, divisor != 0 {
            return Double(truncating: value as! NSNumber) / divisor
        } else if let divisor = val as? Int, divisor != 0 {
            return Double(truncating: value as! NSNumber) / Double(divisor)
        } else {
            fatalError("Ошибка: деление на ноль")
        }
    }
    
    func power(_ val: T) -> Double {
        
        return pow(Double(truncating: value as! NSNumber), Double(truncating: val as! NSNumber))
    }
}
