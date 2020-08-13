package dutsasa.fp.challenge

import dutsasa.fp.utils.UnitSpec

class Challenge1 extends UnitSpec {

  /**
   *  1. Implement, as best as you can, the identity function in your favorite language
   *     (or the second favorite, if your favorite language happens to be Haskell).
   */
  def identityFunction[T](a: T): T = a

  it should "return parameter" in {
    identityFunction[Int](1) shouldBe 1
  }

  /**
   * 2. Implement the composition function in your favorite language. It
   * takes two functions as arguments and returns a function that is
   * their composition.
   */

  val addOne: Int => Int = (i: Int) => i + 1

  val mulTwo: Int => Int = (i: Int) => i * 2

  // calculate addOne after mulTwo
  def fun(i: Int): Int = addOne(mulTwo(i))

  // return f after g
  def compositionFunction(f: Int => Int, g: Int => Int): Int => Int =
    f compose g

  def funCompose: Int => Int = compositionFunction(addOne, mulTwo)

  it should "compose function with normal" in {
    fun(3) shouldBe funCompose(3)
    fun(10) shouldBe funCompose(10)
    fun(100) shouldBe funCompose(100)
  }

  /**
   * 3. Write a program that tries to test that your composition function
   * respects identity.
   */

  val addOneAndIdentity: Int => Int = addOne compose identityFunction[Int] _

  val identityAndMulTwo: Int => Int = identityFunction[Int] _ compose mulTwo

  it should "return same result" in {
    addOneAndIdentity(1) shouldBe addOne(1)
    addOneAndIdentity(100) shouldBe addOne(100)

    identityAndMulTwo(4) shouldBe mulTwo(4)
    identityAndMulTwo(99) shouldBe mulTwo(99)
  }

  /**
   * 4. Is the world-wide web a category in any sense? Are links morphisms?
   * Object?
   *      -
   *
   * Arrow?
   *      -
   */

  /**
   * 5. Is Facebook a category, with people as objects and friendships as
   * morphisms?
   *
   * 6. When is a directed graph a category?
   */
}
