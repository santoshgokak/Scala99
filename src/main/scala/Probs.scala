/**
 * sbt
 * (*) Find the last element of a list.
 * Example:
 * scala> last(List(1, 1, 2, 3, 5, 8))
 * res0: Int = 8
 *
 */

class
Probs {
  def last[A](a : List[A])    : A = a(a.length -1)
}
