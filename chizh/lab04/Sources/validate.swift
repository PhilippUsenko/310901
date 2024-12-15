import Foundation

class validate {
    public static func getNumber() -> Double {
        var x: Double?
        var s: String?

        func isComplex(s: String) -> Bool {
            let complexRegex = "^([-+]?[0-9]*\\.?[0-9]+)([-+][0-9]*\\.?[0-9]+)i$"

            let regex = try! NSRegularExpression(pattern: complexRegex, options: .caseInsensitive)
    
            let range = NSRange(location: 0, length: s.utf16.count)
            return regex.firstMatch(in: s, options: [], range: range) != nil
        }

        while true {
            print("Введите число: ")
            s = readLine()
            if (s == nil){
                print("Ошибка ввода!")
                continue
            } else {
                if (isComplex(s: s!)) {
                    return Double.nan
                }
                if (Double.init(s!) != nil) {
                    return Double.init(s!)!
                } else {
                    print("Ошибка ввода!")
                    continue
                }
            }
        }
    }
}