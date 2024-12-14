//
//  main.swift
//  сяп4
//
//  Created by арина сильченко on 26.11.24.
//

import Foundation

let productManager = ProductManager()

//Добавление товаров
if let product1 = Product(name: "Молоко", manufacturer: "Компания А", price: 50, expirationDate: "2024-12-20", quantity: 10) {
    productManager.addProduct(product1) // Добавляем экземпляр протокола ProductProtocol
}

if let product2 = Product(name: "Хлеб", manufacturer: "Компания Б", price: 30, expirationDate: "2024-11-25", quantity: 20) {
    productManager.addProduct(product2)
}

if let product3 = Product(name: "Йогурт", manufacturer: "Компания В", price: 70, expirationDate: "2024-10-15", quantity: 5) {
    productManager.addProduct(product3)
}

// Вывод списка товаров с ценой ниже заданной
let maxPrice = 40.0
print("Товары с ценой не выше \(maxPrice):")
for product in productManager.productsUnderPrice(maxPrice) {
    print("- \(product.name) от \(product.manufacturer), цена: \(product.price), количество: \(product.quantity)")
}

// Вывод списка просроченных товаров
print("\nПросроченные товары:")
for product in productManager.expiredProducts() {
    print("- \(product.name) от \(product.manufacturer), срок хранения истек \(product.expirationDate), количество: \(product.quantity)")
}

