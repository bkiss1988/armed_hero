import armedhero.{Hero, Weapon}

object Blacksmith {

  def armHero(hero: Hero, weaponName: String): Hero = {
    def getWeaponByName(weaponName: String): Weapon = {
       weaponName match {
        case "Sword" => Weapon("Sword", 7)
        case "Dagger" => Weapon("Dagger", 5)
        case "Staff" => Weapon("Staff", 8)
      }
    }
    hero.copy(weapon = getWeaponByName(weaponName))
  }



}
