package domain

object TypeClassing extends App {

  val tester: orderClass[Int] = new orderClass[Int] {
    val element = 5
  }

  val tester2: orderClass[Int] = new orderClass[Int] {
    val element = 8
  }

  tester < tester2
  tester > tester2

  trait orderClass [T] {

    val element: Int
    def < (comparable: orderClass[Int]) = {
      if(this.element < comparable.element) println(true) else println(false)
    }

    def > (comparable: orderClass[Int]) = {
      if(this.element > comparable.element) println(true) else println(false)
    }
  }

}
