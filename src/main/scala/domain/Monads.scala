package domain

object Monads  extends App {

  val id1 = new Id(3)
  val id2 = new Id(2)
  println(id1.flatMap(i => id2.map (j => i + j)))
}

trait Monad[T] { //correct answer was M[_] could change to this but this was my thinking
  def map(j: T => T ): T
  def flatMap(i: T => T): T
}

class Id[T](value: T) extends Monad[T] {

  def map(j: T => T ): T = j(value)
  def flatMap(i: T => T): T = {
    i(value)
  }

}
