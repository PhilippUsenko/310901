func countNums() -> Int {
    var count = 0
    
    for number in 1000...9999 {
        let digits = String(number).map { $0 }
        
        let digitCounts = Dictionary(grouping: digits, by: { $0 }).mapValues { $0.count }
        
        if digitCounts.values.contains(3) {
            count += 1
        }
    }
    
    return count
}

let numsCount = countNums()
print("amount of nums containing 3 identical digits \(numsCount)")