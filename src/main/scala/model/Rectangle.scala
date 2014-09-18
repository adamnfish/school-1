package model

sealed trait Shape
case class Rectangle(topLeft: (Int, Int), width: Int, height: Int) extends Shape {
  lazy val isSquare: Boolean = ???
}
case class Circle(center: (Int, Int), radius: Int) extends Shape
