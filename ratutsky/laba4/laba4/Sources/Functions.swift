import Foundation

class Functions {
    func sortFilesByName(files: [Protocol]) -> [Protocol] {
        return files.sorted { $0.name.lowercased() < $1.name.lowercased() }
    }

    func filterFilesBySize(files: [Protocol], minSize: Int) -> [Protocol] {
        return files.filter { $0.size > minSize }
    }

    func filterFilesByAccessCount(files: [Protocol], minAccessCount: Int) -> [Protocol] {
        return files.filter { $0.accessCount > minAccessCount }
    }
}