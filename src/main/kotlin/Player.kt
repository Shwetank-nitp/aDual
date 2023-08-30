import kotlin.random.Random

open class Player(private val name: String,
                  private var attack: Int = 1,
                  private var defence: Int = 3,
                  private var health: Int = 0
) {
    fun getHealth():Int {return health}
    fun setHealth(health: Int){
        this.health = health
    }
    open fun attack():Int {
        return Random.nextInt(1,attack)
    }
    open fun defence():Int {
        return Random.nextInt(1,defence)
    }
    fun getName():String{return name}

    fun show(){
        println("""
            Name       : $name
            Max Attack : $attack
            MaxDefence : $defence
            Health     : $health
        """.trimIndent())
    }
}