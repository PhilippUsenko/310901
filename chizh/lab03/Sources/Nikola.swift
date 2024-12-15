class Nikola {
    private var name: String;
    private var age: Int;
    init(name: String, age: Int) {
        self.name = "Николай";
        self.age = age;
        if (name != self.name) {
            print("Я не \(name), а \(self.name)")
        }
    }
}