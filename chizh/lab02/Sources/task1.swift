class task1 {
    var m: Int
    var list: [(x: Int, y: Int, z: Int)] = []

    init(m: Int) {
        self.m = m
    }

    public func result() -> [(x: Int, y: Int, z: Int)] {
        var tmp: (x: Int, y: Int, z: Int)
        for i in stride(from: 1, to: self.m - 1, by: 1) {
            tmp.x = i
            for j in stride(from: 1, to: self.m - i, by: 1) {
                tmp.y = j
                tmp.z = self.m - i - j
                list.append(tmp)
            }
        }
        return list
    }
}