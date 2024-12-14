//
//  chessboard.swift
//  сяп3.0
//
//  Created by арина сильченко on 17.11.24.
//

import Foundation

//Класс для работы с шахматной доской
class Chessboard {
    let size = 8
    var board: [[Character]] //двумерный массив символов
    
    init() {
        board = Array(repeating: Array(repeating: ".", count: size), count: size) //повторение одномерного массива из 8 точек 8 раз
    }
    
    func markQueen (at row: Int, col: Int) {
        for i in 0..<size {
            //Вертикаль и горизонталь
            board[row][i] = "*"
            board[i][col] = "*"
            
            //Диагонали
            if row + i < size && col + 1 < size {board[row+i][col+i] = "*"}
            if row - i >= 0 && col - i >= 0
            {board[row-i][col-i] = "*" }
            if row + i < size && col - i >= 0
            {board[row+i][col-i] = "*"}
            if row - i >= 0 && col + i < size
            {board[row-i][col+i] = "*"}
        }
        board[row][col] = "Q"
    }
    
    func display () {
        for row in board.reversed() {
            print(row.map {String($0) }.joined(separator: " "))
        }
    }
}
