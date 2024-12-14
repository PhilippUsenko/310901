//
//  2.2.swift
//  сяп2.0
//
//  Created by арина сильченко on 29.10.24.
//

import Foundation

func circleDisplacement (sequence: inout [Int]) {
    guard !sequence.isEmpty else {return}
        if sequence[0] % 2 == 0 && sequence[0] > 0 { //если первый элемент четный и > 0, то сдвигаем влево на его значение
            let steps = sequence[0] % sequence.count
            sequence = Array(sequence[steps...] + sequence[..<steps])
        }
    else if sequence[0] % 2 == 0 && sequence[0] < 0 { //если первый элемент четный и < 0, то сдвигаем вправо на его значение (abs)
        let steps = abs(sequence[0]) % sequence.count
        sequence = Array(sequence[(sequence.count-steps)...] + sequence[..<(sequence.count-steps)])
    }
    else if sequence[0] % 2 != 0 && sequence[sequence.count-1] > 0 { //если первый элемент нечетный и последний > 0, то сдвигаем вправо на его значение
        let steps = sequence[sequence.count-1] % sequence.count
        sequence = Array(sequence[(sequence.count-steps)...] + sequence[..<(sequence.count-steps)])
        }
    else if sequence[0] % 2 != 0 && sequence[sequence.count-1] < 0 { //если первый элемент нечетный и последний < 0, то сдвигаем влево на его значение (abs)
        let steps = abs(sequence[sequence.count-1]) % sequence.count
        sequence = Array(sequence[steps...] + sequence[..<steps])
    }
}
