//
//  ProductManager.swift
//  сяп4
//
//  Created by арина сильченко on 26.11.24.
//

import Foundation

class ProductManager {
    private var products: [ProductProtocol] = []
    
    func addProduct(_ product: ProductProtocol) {
        products.append(product)
    }
    
    func productsUnderPrice(_ maxPrice: Double) -> [ProductProtocol] {
        return products.filter { $0.price <= maxPrice }
    }
    
    func expiredProducts() -> [ProductProtocol] {
        return products.filter { $0.isExpired() }
    }
}
