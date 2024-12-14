//
//  main.swift
//  сяп2.0
//
//  Created by арина сильченко on 29.10.24.
//

import Foundation


func NOD(_ a: Int, _ b: Int) -> Int {
    var a = a
    var b = b
    while b != 0 {
        let temp = b
        b = a % b
        a = temp
    }
    return a
}

func subtraction (n: Int, m: Int, q: Int, p: Int) {
    let numerator: Int
    let denominator: Int
    if m == p {
        numerator = n - q
        denominator = m
    }
    else {
        numerator = n * p - q * m
        denominator = m * p
    }
    
    let divisor = NOD (abs(numerator), denominator)
    let simplifiedNumerator = numerator / divisor
    let simplifiedDenominator = denominator / divisor
    if simplifiedNumerator == simplifiedDenominator {
        print("\(n)/\(m) - \(q)/\(p) = 1")
    }
    else {
        print("\(n)/\(m) - \(q)/\(p) = \(simplifiedNumerator)/\(simplifiedDenominator)")
    }
}

func readInt(prompt: String) -> Int {
    while true {
        print(prompt)
        if let input = readLine(), let number = Int(input) {
            return number
        } else {
            print("Введите корректное целое число.")
        }
    }
}

func readIrreducibleFraction (fractionName: String) -> (numerator: Int, denominator: Int) {
    while true {
        let numerator = readInt(prompt: "Введите числитель \(fractionName): ")
        var denominator: Int
        
        repeat {
            denominator = readInt(prompt: "Введите знаменатель \(fractionName): ")
            if denominator == 0 {
                print("Знаменатель не может быть равен 0!")
            }
        } while denominator == 0
        if NOD(abs(numerator), abs(denominator)) == 1 && abs(numerator)<abs(denominator) {
            return (numerator, denominator)
        } else {
            print ("Ошибка: Дробь \(numerator) / \(denominator) сократима. Введите обыкновенную несократимую дробь.")
        }
    }
}
