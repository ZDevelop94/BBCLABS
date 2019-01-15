package domain

trait Measurement2 {

  type T

  def order(x: Seq[T]) : Unit

  def comparison(x: T, y : T) : Unit

  def convert(x: T): Measurement2

}

case class Centimetre(length :Int = 15) extends Measurement2 {
  type T = Centimetre

  def order(x: Seq[Centimetre]) : Unit = {
    val ordered = x.map(f => f.length).sorted

    ordered.foreach( element => println(element))
  }

  def comparison(x: Centimetre, y : Centimetre) : Unit = {
    println(s"$x $y")
  }

  def convert(x: Centimetre): Metre = {
    val length = x.length / 100
    Metre(length)
  }
}

case class Metre (length :Int = 15) extends Measurement2 {
  type T = Metre
  def order(x: Seq[Metre]) : Unit = {
    val ordered = x.map(f => f.length).sorted

    ordered.foreach( element => println(element))
  }

  def comparison(x: Metre, y : Metre) : Unit = {
    println(s"$x $y")
  }

  def convert(x: Metre): Kilometre = {
    val length = x.length / 100
    Kilometre(length)
  }
}

case class Kilometre(length :Int = 15)  extends Measurement2 {

  type T = Kilometre

  def order(x: Seq[Kilometre]) : Unit = {
    val ordered = x.map(f => f.length).sorted

    ordered.foreach( element => println(element))
  }

  def comparison(x: Kilometre, y : Kilometre) : Unit = {
    println(s"$x $y")
  }

  def convert(x: Kilometre): Metre = {
    val length = x.length * 100
    Metre(length)
  }
}

object main {

  def main (args: Array[String] ): Unit = {

    val tape1 = Centimetre(14)

    val tape2 = Centimetre(14)

    val tape3 = Metre()

    tape1.comparison(tape1, tape2)
  }

}
