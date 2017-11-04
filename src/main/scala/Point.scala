trait TraitA {
  val x: Int
  def printWithX(): Unit = println("A" + x)
}


trait TraitB {
  val x: Int
  def printWithX(): Unit = println("B" + x)
}

trait TraitC {
  val x: Int
  def printWithX(): Unit = println("C" + x)
}

case class Point(x: Int, y: Int, private val z: Int) extends TraitA with TraitB with TraitC {
  override def printWithX(): Unit = {
    super[TraitA].printWithX()
  }
}

object Point {
  val point: Point = Point(1, 2, 3)
  val total: Int = point.x + point.y + point.z

  def printWithZ(): Int = {
    point.printWithX()
    println(total)
    total
  }
}
