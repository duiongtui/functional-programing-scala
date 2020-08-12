package dutsasa.fp.challenge

object Challenge1 {
  /*
  1. Implement, as best as you can, the identity function in your favorite language
  (or the second favorite, if your favorite language happens to be Haskell).
   */
  def identityFunction[T](a: T): T = a

  /*
  2. Implement the composition function in your favorite language. It
  takes two functions as arguments and returns a function that is
  their composition.
  3. Write a program that tries to test that your composition function
  respects identity.
   */
  def addOne(i: Int): Int = i + 1

  def mulTwo(i: Int): Int = i * 2

  // calculate addOne after mulTwo
  def fun(i: Int): Int = addOne(mulTwo(i))

  // return f after g
  // def compositionFunction(f: Int => Int, g: Int => Int): Int => Int = {}

  /*
  4. Is the world-wide web a category in any sense? Are links morphisms?
  5. Is Facebook a category, with people as objects and friendships as
  morphisms?
  6. When is a directed graph a category?
   */

  def main(args: Array[String]): Unit = {
    println(fun(2))
    println("hellloooooo")
  }
}
