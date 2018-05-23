import armedhero.{Effect, Hero}

case class Duel(heroOne: Hero,
                heroTwo: Hero,
                rounds: Int,
                condition: (Hero, Hero) => Boolean = Duel.zeroHealthCondition) {

  def fight(): (Hero, Hero) = {
    def fightImpl(hero1: Hero, hero2: Hero, roundLeft: Int): (Hero, Hero) = {
      if (condition(hero1, hero1) || roundLeft == 0) {
        return (hero1, hero2)
      }

      val effectList: List[Effect] = List(hero1.onTurn(List(hero2)), hero2.onTurn(List(hero1)))

      fightImpl(hero1.copy(health = hero1.health - hero2.weapon.damage),
                hero2.copy(health = hero2.health - hero1.weapon.damage),
                roundLeft - 1)
    }

    fightImpl(heroOne, heroTwo, rounds)
  }

  def applyEffect(hero1: Hero, hero2: Hero, effect: Effect): (Hero, Hero) = {
    if (effect.target == hero1) {
      return (hero1.copy(health = hero1.health - effect.healthChange))
    } else {
      return (hero2.copy(health = hero2.health - effect.healthChange))
    }
  }

}

object Duel {
  def zeroHealthCondition(hero1: Hero, hero2: Hero) = {
    hero1.health <= 0 || hero2.health <= 0
  }
}
