//
//  main.swift
//  сяп3.0
//
//  Created by арина сильченко on 17.11.24.
//

import Foundation

print("Введите координату ферзя (например, с4):")
if let input = readLine(), let queen = Queen(position: input) {
    let chessboard = Chessboard()
    chessboard.markQueen(at: queen.row, col: queen.col)
    chessboard.display()
} else {
    print("Программа завершена из-за некорректного ввода.")
}

