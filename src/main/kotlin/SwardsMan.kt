import kotlin.random.Random

class SwardsMan(name: String,
                attack: Int = 1,
                defence: Int = 3,
                health: Int = 0,
                private val chance: Int = 0)
    : Player(name,attack,defence,health){
    var weapon = Weapon()

    override fun attack():Int{
        val odds : Int = Random.nextInt(0,100)
        if (odds<chance)
        {
            println("${getName()} uses his ${weapon.nameOfWeapon()}")
            return super.attack()+weapon.damageInflicted()
        }
        return super.attack()
    }
}
class MagicWarrior(name: String,
                   attack: Int = 1,
                   defence: Int = 3,
                   health: Int = 0,
                   private val chance: Int = 0)
    :Player(name,attack,defence,health)
{
    override fun defence(): Int {
        val odds: Int = Random.nextInt(0,100)
        if (odds<chance){
            println("${getName()} uses his magic to teleport")
            return Int.MAX_VALUE
        }
        return super.defence()
    }
}