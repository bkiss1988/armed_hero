package armedhero

case class Hero(
                 id: String,
                 health: Int,
                 weapon: Weapon = Weapon("fist", 1),
                 strategy: Strategy = Strategy()) {
  require(health <= 30, "Health over 30")

  def onTurn(enemies: List[Hero]): Effect = {
    Effect(strategy.onTurn(enemies), weapon.damage)
  }
}
