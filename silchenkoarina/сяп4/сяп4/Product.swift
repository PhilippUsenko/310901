//
//  Product.swift
//  сяп4
//
//  Created by арина сильченко on 26.11.24.
//

import Foundation

class Product: ProductProtocol {
    var name: String
    var manufacturer: String
    var price: Double
    var expirationDate: Date
    var quantity: Int
    
    init?(name: String, manufacturer: String, price: Double, expirationDate: String, quantity: Int) {
        guard !name.isEmpty, !manufacturer.isEmpty, price > 0, quantity > 0 else {
            print("Ошибка: неверные данные.")
            return nil
        }
        let dateFormatter = DateFormatter()
        dateFormatter.dateFormat = "yyyy-MM-dd"
        guard let validDate = dateFormatter.date(from: expirationDate) else {
            print("Ошибка: неверный формат даты.")
            return nil
        }
        self.name = name
        self.manufacturer = manufacturer
        self.price = price
        self.expirationDate = validDate
        self.quantity = quantity
    }
    
    func isExpired() -> Bool {
        return expirationDate < Date()
    }
}
