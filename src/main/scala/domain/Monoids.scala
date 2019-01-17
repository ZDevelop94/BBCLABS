package domain

object Monoids extends App {

  println(optionAddMonoid.op(Some(1), Some(2)))
  println(optionAddMonoid.zero)

  println(functionAddMonoid.op(a => a / 2, b => b * 3))
}

trait Monoid[A] {
  def zero[A]
  def op (a: A, b: A) : A
}

object optionAddMonoid extends Monoid[Option[Int]] {

  def zero[Option] = Option.empty
  def op (a: Option[Int], b: Option[Int]) : Option[Int] = Some(a.get + a.get)
}

trait Monoid2[A] {
  def zero[A]
  def op (f: => A => A, f2: => A => A) : A
}

object functionAddMonoid extends Monoid2[Double] {

  def zero[Double] = 0.0

  def op (f: => Double => Double, f2: => Double => Double) : Double = {
    (f compose f2)(5)
  }
}
