//
//  main.swift
//  сяп2.0
//
//  Created by арина сильченко on 29.10.24.
//

import Foundation

let fraction1 = readIrreducibleFraction(fractionName: "первой дроби")
let fraction2 = readIrreducibleFraction(fractionName: "второй  дроби")
subtraction(n: fraction1.numerator, m: fraction1.denominator, q: fraction2.numerator, p: fraction2.denominator)
print()
print("Введите числа через пробел: ")
if let input = readLine() {
    let components = input.split(separator: " ")
    let sequence = components.compactMap {Int($0)}
    if sequence.count == components.count {
        var mutableSequence = sequence
        circleDisplacement(sequence: &mutableSequence)
        print ("Результат сдвига: ", mutableSequence)
    }
    else { print ("Нужно было ввести целые числа.") }
}

