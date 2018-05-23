import armedhero.Hero
import org.scalatest.{Matchers, WordSpec}

class HeroSpec extends WordSpec with Matchers {

  "Hero" should {

    "be created" in {
      Hero("Bob", 25) shouldEqual Hero("Bob", 25)
    }

    "can't be created over 30 health" in {
      assertThrows[IllegalArgumentException](
        Hero("Bob", 31)
      )
    }

  }

}
