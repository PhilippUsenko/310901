class Kitten {
    let name: String
    private var yesCount = 0
    private var noCount = 0
    private var isYesTurn = true
    
    init(name: String) {
        self.name = name
    }
    
   
    func toAnswer() -> String {
        if isYesTurn {
            yesCount += 1
            isYesTurn = false
            return "moore-moore"
        } else {
            noCount += 1
            isYesTurn = true
            return "meow-meow"
        }
    }
    

    func numberYes() -> Int {
        return yesCount
    }
    

    func numberNo() -> Int {
        return noCount
    }
}