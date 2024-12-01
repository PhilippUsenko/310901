
class Employee{
    struct Pos{
        var position: String
    }
    struct Name{
        var name: String
        func printName() {
            print(name)
        }
    }
    struct Exp{
        var experience: Int
    }
    
    var pos: Pos
    var exp: Exp
    var name: Name

    init(_ name: String,_ position: String,_ experience: Int){
        self.name = Name(name: name)
        self.pos = Pos(position: position)
        self.exp = Exp(experience: experience)
    }
    func printInfo(){
        if exp.experience == 11 {
            
            print("Имя: \(name.name), Должность: \(pos.position), Стаж: \(exp.experience) лет")
            return;
        }
        let val: Int = exp.experience % 10
        
        
        
        switch val {
            case 1:
                print("Имя: \(name.name), Должность: \(pos.position), Стаж: \(exp.experience) год")
            case 2...4:
                print("Имя: \(name.name), Должность: \(pos.position), Стаж: \(exp.experience) года")
            default:
                print("Имя: \(name.name), Должность: \(pos.position), Стаж: \(exp.experience) лет")
                                
        }
    }
}
