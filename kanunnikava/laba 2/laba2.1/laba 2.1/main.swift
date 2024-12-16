//1

import Foundation
// Функция для проверки, является ли число простым
func isPrime(_ number: Int) -> Bool
{
guard number > 1 // оператор guard для проверки, больше ли число number единицы
else
{
return false
}
// Проверяем делимость number на все числа от 2 до квадратного корня из number (включительно)
// Если number делится на любое из этих чисел, оно не является простым и возвращаем false
for i in 2..<Int(sqrt(Double(number))) + 1
{
if number % i == 0
{
return false
}
}
return true
}
// Функция для нахождения всех произведений двух простых чисел
func findProductsOfPrimes(upTo limit: Int) -> [Int]
{
var primes: [Int] = [] // Создаем пустой массив primes для хранения всех простых чисел до limit
var products: Set<Int> = [] // Создаем пустое множество products для хранения всех уникальных произведений простых чисел.
// Находим все простые числа до limit
for i in 2...limit
{
if isPrime(i)
{
primes.append(i) // добавляем число в массив
}
}
// Находим произведения простых чисел
for i in 0..<primes.count
{
for j in i..<primes.count
{
// j начинается с i, чтобы избежать дублирования
let product = primes[i] * primes[j]
if product <= limit { products.insert(product)
}
else
{
break
// Если произведение превысило limit, выходим из цикла
}
}
}
return Array(products).sorted()
}
// Пример использования
print("Введите число P:")
if let input = readLine(),
let P = Int(input)
{
let result = findProductsOfPrimes(upTo: P)
print("Числа, не превосходящие \(P), которые можно представить в виде произведения двух простых чисел:")
print(result)
}
else {
print("Некорректный ввод. Пожалуйста, введите целое число.")
}
