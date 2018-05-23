package armedhero

case class Strategy() {

  def onTurn(enemies: List[Hero]): Hero = {
    enemies.minBy(h => h.health)
  }

}
