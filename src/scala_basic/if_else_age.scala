package scala_basic

object if_else_age {

  def main(args: Array[String]): Unit = {

    print("welcome if else program")

    val age = readLine("please enter your age :")
    val age1 =age.toInt
    val height = readLine("please enter your height :")
    val height1 =height.toInt

    if (age1 < 18 && height1 <5) {

      println("you are not eligible")
    } else {
      print("you are eligible")
    }

  }
}
