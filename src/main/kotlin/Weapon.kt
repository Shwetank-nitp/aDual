class Weapon(private var wepName:String ="noName",
             private var damage: Int = 0) {
    fun nameOfWeapon():String{
        return wepName
    }
    fun damageInflicted():Int{
        return damage
    }
}