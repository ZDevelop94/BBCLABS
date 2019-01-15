/*
package domain

trait Measurement {

  type T

  def order[T](x: Seq[T]) : Unit = {
    val ordered = x.sorted[T]

    ordered.foreach( element => println(element))
  }

  def comparison[T](x: T, y : T) : Unit = {
    println(s"$x $y")
  }

  def convert(x: T): Measurement = {

  }
}

case class Centimetre(length :Int = 15) extends Measurement {
type T = Centimetre
}

case class Metre (length :Int = 15) extends Measurement {

  type T = Metre

}

case class Kilometre(length :Int = 15)  extends Measurement {
type T = Kilometre
}

object main {

  def main (args: Array[String] ): Unit = {

    val tape1 = Centimetre(14)

    val tape2 = Centimetre(14)

    val tape3 = Metre()

    tape1.comparison(tape1, tape3)
  }

}*/
