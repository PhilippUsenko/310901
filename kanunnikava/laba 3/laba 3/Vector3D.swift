// Vector3D.swift
import Foundation
public class Vector3D {
    private var x: Double
    private var y: Double
    private var z: Double

    public init?(x: Double, y: Double, z: Double) { // ? означает, что конструктор может вернуть nil, если что-то пойдет не так
        guard Validator.validate(x: x, y: y, z: z) else { return nil } // проверка, что координаты x, y и z правильные.
        self.x = x // значение, переданное в конструктор как параметр x, будет сохранено в свойстве объекта x
        self.y = y
        self.z = z
    }

    public func toString() -> String { // преобразует объект класса в строку, которая содержит координаты вектора
        return "(\(x), \(y), \(z))"
    }

    public func add(_ vector: Vector3D) -> Vector3D { // сложение двух векторов
        return Vector3D(x: self.x + vector.x, y: self.y + vector.y, z: self.z + vector.z)!
    }

    public func subtract(_ vector: Vector3D) -> Vector3D { // вычитание двух векторов
        return Vector3D(x: self.x - vector.x, y: self.y - vector.y, z: self.z - vector.z)!
    }

    public func dotProduct(_ vector: Vector3D) -> Double { // вычисление скалярного произведения
        return self.x * vector.x + self.y * vector.y + self.z * vector.z
    }

    public func multiplyByScalar(_ scalar: Double) -> Vector3D { // умножения на скаляр
        return Vector3D(x: self.x * scalar, y: self.y * scalar, z: self.z * scalar)!
    }

    public func divideByScalar(_ scalar: Double) -> Vector3D { // деление на скаляр
        return Vector3D(x: self.x / scalar, y: self.y / scalar, z: self.z / scalar)!
    }

    public func crossProduct(_ vector: Vector3D) -> Vector3D { // векторное произведение
        return Vector3D(
            x: self.y * vector.z - self.z * vector.y,
            y: self.z * vector.x - self.x * vector.z,
            z: self.x * vector.y - self.y * vector.x
        )!
    }

    public func length() -> Double { // длина вектора
        return sqrt(self.x * self.x + self.y * self.y + self.z * self.z)
    }
}
