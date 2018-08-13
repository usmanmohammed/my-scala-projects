object Tuples {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val tuple = (1, false, "scala")                 //> tuple  : (Int, Boolean, String) = (1,false,scala)
  val tuple2 = "computer" -> "dell"               //> tuple2  : (String, String) = (computer,dell)
  
  val second = tuple2._2                          //> second  : String = dell
  val t = "a" -> 25                               //> t  : (String, Int) = (a,25)
  
  def div10(n:Int):Tuple3[Int, Int, Int] = (n, n / 10, n % 10)
                                                  //> div10: (n: Int)(Int, Int, Int)
  val (value, tens, ones) = div10(85)             //> value  : Int = 85
                                                  //| tens  : Int = 8
                                                  //| ones  : Int = 5
  println("tens digit: " + tens)                  //> tens digit: 8
  println("ones digit: " + ones)                  //> ones digit: 5
}