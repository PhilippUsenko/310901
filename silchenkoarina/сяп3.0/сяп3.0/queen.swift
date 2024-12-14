//
//  queen.swift
//  сяп3.0
//
//  Created by арина сильченко on 17.11.24.
//

import Foundation

//Класс для работы с координатами ферзя
class Queen {
    var row: Int
    var col: Int
    
    init?(position: String) {
        guard position.count == 2, //длина ввода
              let colChar = position.first,
              let rowNum = Int(String(position.last!)),
              "a"..."h" ~= colChar, //colChar находится в диапазоне
              1...8 ~= rowNum else {
            print("Неверный ввод!")
            return nil
        }
        
        self.row =  rowNum - 1
        self.col = Int(colChar.asciiValue! - Character("a").asciiValue!)
    }
}
