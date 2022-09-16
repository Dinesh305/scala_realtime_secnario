package scala_basic

object type_casting {

  def main(args: Array[String]): Unit = {

    val s1 = "123";
    println(s1.getClass.getName);
    val s2 = s1.toInt;
    println(s2.getClass.getName);


    val i1 = 12;
    val i2 = 6.0F;


    println("i1 " +i1.getClass.getName);
    println("i2"+i2.getClass.getName);

    val i3 = i1.asInstanceOf[Float];
    val i4 = i2.asInstanceOf[Int];

    println(i3.getClass.getName);
    println(i4.getClass.getName);
  }

  }
