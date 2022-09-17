import java.util.Scanner

object user_scala {
  def main(args: Array[String]): Unit = {
    val input1 = readLine("enter the num")
    val input2 = readLine("enter the num")


    println(input1.getClass.getName)
    println(input2.getClass.getName)

    val output = input1 + input2
    println(output)

    val input3=input1.toInt
    val input4 =input2.toInt
    println(input3+input4)
  }
}