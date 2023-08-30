fun main() {
    val swardsMan = SwardsMan("Akome",12343,
            2345,15000, 46)
    swardsMan.weapon = Weapon ("Sole-Eater", 300)
    val magicUser = MagicWarrior ("Loki", 3345, 11003,
            14400, 46)
    val battle = Battle()
    swardsMan.show()
    println()
    magicUser.show()
    battle.fight(swardsMan,magicUser)
}