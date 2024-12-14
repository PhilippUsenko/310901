//
//  ProductProtocol.swift
//  сяп4
//
//  Created by арина сильченко on 26.11.24.
//

import Foundation

protocol ProductProtocol {
    var name: String { get }
    var manufacturer: String { get }
    var price: Double { get }
    var expirationDate: Date { get }
    var quantity: Int { get }
    
    func isExpired() -> Bool
}
