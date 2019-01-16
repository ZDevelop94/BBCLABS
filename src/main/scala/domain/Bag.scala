/*
package domain

import scala.collection.{Seq, mutable}
import scala.collection.generic.{CanBuildFrom, SeqFactory}
import mutable.Builder
import scala.collection.immutable

case class Bag[A](occurrence: Map[A, Int] = Map()) extends SeqFactory[Seq] {
  Seq
  /** $genericCanBuildFromInfo */
  implicit def canBuildFrom[A]: CanBuildFrom[Coll, A, Seq[A]] = ReusableCBF.asInstanceOf[GenericCanBuildFrom[A]]

  def newBuilder[A]: Builder[A, Seq[A]] = immutable.Seq.newBuilder[A]

  def add[B >: A](elem: B) = {
    this.asInstanceOf[Seq[A]] :+ elem
    this.asInstanceOf[Seq[A]].map{ x =>
      if(occurrence.contains(x)) occurrence.updated(x, occurrence(x)+ 1)
      else occurrence + (x -> 1)
    }
  }
}

object main{
  def main (args: Array[String] ): Unit = {
    val rr = Bag()(4, 5, 5, 6)
    rr
  }
}*/
