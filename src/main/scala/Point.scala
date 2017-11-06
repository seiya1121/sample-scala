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

case class Point(x: Int, y: Int, private val z: Int) extends TraitA with TraitB with TraitC

object Point {
  def apply(x: Int, y: Int): Point = {
    new Point(x, y, 1)
  }

  def printWithZ(): Int = {
    val p: Point = Point(5, 3)
    val total = p.x + p.y + p.z
    println(total)
    total
  }
}
