package scala_basic

object arithemetic_oper {

  def main(args: Array[String]): Unit = {
    var a: Int = 2;
    var b: Int = 4;
    var c: Int = 6;

    var step1: Int = (a + b);//2+4=>6
    var step2: Int = step1 / c; // 6/6=>1

    var ans: Int = ((step2) * a); //1*2

    println(s"the output is => $ans")


  }

}
