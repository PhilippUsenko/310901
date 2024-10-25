import Foundation

class Vehicle: Car {
    var engine: Engine
    
    init(engine: Engine) {
        self.engine = engine
    }
    
    func startEngine() {
        engine.start()
    }
}
