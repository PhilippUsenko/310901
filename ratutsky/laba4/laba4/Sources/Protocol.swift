import Foundation

protocol Protocol {
    var name: String { get }
    var size: Int { get }
    var creationDate: Date { get }
    var accessCount: Int { get }
}