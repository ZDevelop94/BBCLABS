package domain

import scala.collection.{Seq, mutable}
import scala.collection.generic.{CanBuildFrom, SeqFactory}
import mutable.Builder
import scala.collection.immutable

case class Bag[A](occurrence: Int = 0) extends SeqFactory[Seq] {
  Seq

  /** $genericCanBuildFromInfo */
  implicit def canBuildFrom[A]: CanBuildFrom[Coll, A, Seq[A]] = ReusableCBF.asInstanceOf[GenericCanBuildFrom[A]]

  def newBuilder[A]: Builder[A, Seq[A]] = immutable.Seq.newBuilder[A]

  def add[A](sequence: Seq[_], elem: A) = {
    sequence :+ elem
    this occurrence = occurrence + 1
  }
}

case class Bag2[+A](occurrence: Int = 0) extends SeqFactory[Seq] {
  Seq
  /** $genericCanBuildFromInfo */
  implicit def canBuildFrom[A]: CanBuildFrom[Coll, A, Seq[A]] = ReusableCBF.asInstanceOf[GenericCanBuildFrom[A]]

  def newBuilder[A]: Builder[A, Seq[A]] = immutable.Seq.newBuilder[A]

  def add[A](sequence: Seq[_], elem: A) = {
    sequence :+ elem
    this occurrence = occurrence + 1
  }

}

object main{
  def main (args: Array[String] ): Unit = {
      val rr = Bag()(4, 5, 6)

      val rr2 = Bag2()(4, 5, 6)
  }
}