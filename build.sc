import mill._, scalalib._

object app extends RootModule with ScalaModule { /* not ScalaLib */
  def scalaVersion = "3.3.0"
  def ivyDeps = Agg(
    ivy"org.typelevel::cats-core:2.10.0"
    // ...
  )
}
