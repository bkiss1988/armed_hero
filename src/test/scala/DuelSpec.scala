import armedhero.Hero
import org.scalatest.{Matchers, WordSpec}

class DuelSpec extends WordSpec with Matchers {

  "Duel" should {

    "fist fight with two characters" in {
      val hero1 = Hero("Bob", 10)
      val hero2 = Hero("Rich", 10)

      Duel(hero1, hero2, 5).fight() shouldBe (hero1.copy(health = 5), hero2.copy(health = 5))
    }

    "sword fight with two characters" in {
      val hero1 = Blacksmith.armHero(Hero("Bob", 30), "Sword")
      val hero2 = Blacksmith.armHero(Hero("Rich", 30), "Sword")

      Duel(hero1, hero2, 2).fight() shouldBe (hero1.copy(health = 16), hero2.copy(health = 16))
    }

  }

}
