package com.github.windymelt.millexercise

import cats._
import cats.implicits._

object Main extends App {
  val m1: Map[Int, List[String]] = Map(
    42 -> List("foo", "bar"),
    43 -> List("buzz")
  )
  val m2: Map[Int, List[String]] = Map(
    42 -> List("hoge"),
    44 -> List("fuga")
  )

  val m3 = m1 |+| m2

  println(m3)
}
