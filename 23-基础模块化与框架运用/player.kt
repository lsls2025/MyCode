class player{
    var name : String
    var hp : Int
    var attack : Int
    var xp : Int

    constructor(name: String = "", hp: Int = 100, attack: Int = 20,xp: Int = 0) {
        this.name = name
        this.hp = hp
        this.attack = attack
        this.xp = xp
    }
}
