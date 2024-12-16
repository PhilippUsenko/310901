// Validator.swift
import Foundation
public struct Validator {
    public static func validate(x: Double, y: Double, z: Double) -> Bool {
    // метод возвращает логическое значение, которое является результатом логического И операций
    // проверяет, является ли значение конечным числом
        return x.isFinite && y.isFinite && z.isFinite
    }
}
