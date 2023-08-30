class Battle {
    fun fight(war1: Player, war2: Player){
        while (true){
            if (startFighting(war1,war2) == "Game Over"){
                println("Player : ${war1.getName()} is victorious!!!")
                break
            }
            if (startFighting(war2, war1) == "Game Over"){
                println("Player : ${war2.getName()} is victorious!!!")
                break
            }
        }

    }
    private fun startFighting(war1: Player, war2: Player):String{
        val attack:Int = war1.attack()
        val defence:Int = war2.defence()
        val damage:Int = attack-defence
        if (damage>0){
            war2.setHealth(war2.getHealth() - damage)
            println("${war1.getName()} attack ${war2.getName()} " +
                    "inflicts damage of $damage " +
                    "health ${war2.getHealth()} remaining")
        } else println("${war2.getName()} blocks ${war1.getName()}'s attack")
        if(war2.getHealth()<=0){
            return "Game Over"
        }
        return "Fight Again"
    }
}