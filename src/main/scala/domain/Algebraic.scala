/*
package domain

object Algebraic extends App {


  sealed trait Sum[T] {
    def tomorrow(rr: T)

    def nextBusinessDay(rr: T)
  }

  final case class Weekdays[T](monday: String = "monday",
                               tuesday: String = "tuesday",
                               wednesday: String = "wednesday",
                               thursday: String = "thursday",
                               friday: String = "friday",
                               saturday: String = "saturday",
                               sunday: String = "sunday") extends Sum[T] {

    def tomorrow(rr: T) = {
      rr match {
        case "monday" => "tuesday"
        case "tuesday" => "wednesday"
        case "wednesday" => "thursday"
        case "friday" => "saturday"
        case "sunday" => "monday"
      }
    }

    def nextBusinessDay(rr: T) = {
      rr match {
        case x if x == "friday" || x == "saturday" || x == "sunday" => "monday"
        case y => tomorrow(y)
      }
    }
  }

  sealed trait Box[+A]

  final case class Empty[A]() extends Box[A]
  final case class Full[A](value: A) extends Box[A]

  sealed trait MyList[A] {
    def fold[B](end: B)(f: (A, B) => B): B = {
      this match {
        case End() => end
        case Cons(hd, tl) => f(hd, tl.fold(end, f))
      }
    }

    def contains(el: A) : Boolean = {
    fold[Boolean](false)((a, b) => if (a.equals(el)) true else false)
    }
  }

  case class End[A]() extends MyList[A]
  case class Cons[A](hd: A, tl: MyList[A]) extends MyList[A]

  val testing = Weekdays[String]()
  println("Monday's next business day" + testing.nextBusinessDay(testing.monday))
  println("Friday's next business day" + testing.nextBusinessDay(testing.friday))

  val testing2 = Cons("Hello", Cons("world", End()))
}*/
