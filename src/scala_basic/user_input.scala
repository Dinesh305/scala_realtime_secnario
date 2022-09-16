package scala_basic

object user_input {
    def main(args: Array[String]): Unit = {

      var x = readLine("Enter number 1 ");
      var y = readLine("Enter number 2 ");
      var num1 = x.toInt;
      println(num1.getClass.getName)
      var num2 = y.toInt;


      var z = num1 + num2;

      println("the output value is " + z);
      println(z.getClass.getName);

    }

}
