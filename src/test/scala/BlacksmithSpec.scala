import armedhero.{Hero, Weapon}
import org.scalatest.{Matchers, WordSpec}

class BlacksmithSpec extends WordSpec with Matchers {

  "Blacksmith" should {

    "add a sword to a hero" in {
      val hero = Hero("Bob", 20)

      Blacksmith.armHero(hero, "Sword") shouldBe Hero("Bob", 20, Weapon("Sword", 7))
    }

    "add a dagger to a hero" in {
      val hero = Hero("Bob", 20)

      Blacksmith.armHero(hero, "Dagger") shouldBe Hero("Bob", 20, Weapon("Dagger", 5))
    }

    "add a staff to a hero" in {
      val hero = Hero("Bob", 20)

      Blacksmith.armHero(hero, "Staff") shouldBe Hero("Bob", 20, Weapon("Staff", 8))
    }



  }

}
