object Tuples {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(59); 
  println("Welcome to the Scala worksheet");$skip(34); 
  val tuple = (1, false, "scala");System.out.println("""tuple  : (Int, Boolean, String) = """ + $show(tuple ));$skip(36); 
  val tuple2 = "computer" -> "dell";System.out.println("""tuple2  : (String, String) = """ + $show(tuple2 ));$skip(28); 
  
  val second = tuple2._2;System.out.println("""second  : String = """ + $show(second ));$skip(20); 
  val t = "a" -> 25;System.out.println("""t  : (String, Int) = """ + $show(t ));$skip(66); 
  
  def div10(n:Int):Tuple3[Int, Int, Int] = (n, n / 10, n % 10);System.out.println("""div10: (n: Int)(Int, Int, Int)""");$skip(38); 
  val (value, tens, ones) = div10(85);System.out.println("""value  : Int = """ + $show(value ));System.out.println("""tens  : Int = """ + $show(tens ));System.out.println("""ones  : Int = """ + $show(ones ));$skip(33); 
  println("tens digit: " + tens);$skip(33); 
  println("ones digit: " + ones)}
}
