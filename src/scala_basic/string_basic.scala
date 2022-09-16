package scala_basic

object string_basic {

  def main(args: Array[String]): Unit = {

    val s1: String = "How are you?"
    val s2: String = "I'm fine"

    println(s1)
    println(s2)

    println(s1.length())
    println(s2.length())

    println(s1.concat(s2))
  }


}
