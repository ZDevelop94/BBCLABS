package domain

object Implicits extends App {

  case class Date (day: Int, month: Int, year: Int)


  implicit def converter (badDate: String) : Date = {
    val split: Seq[Int] = badDate.split("/").toSeq.map(x => x.toInt) match {
      case x => x
      case x :Exception => Seq(1, 1, 1)
    }

    split match {
      case x if x.head >= 31 &&  x(1) <= 12 && x.last >= 2020 => Date(split.head, split(1), split.last)
      case _ => Date(0, 0 ,0)
    }
  }

  def displayDate(date: Date): Unit = println(s"${date.day}/${date.month}/${date.year}")

  displayDate("16/01/2019")
}
