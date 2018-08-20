object arrays {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(59); 
  println("Welcome to the Scala worksheet");$skip(54); 
  
  var movies:Array[String] = new Array[String] (5);System.out.println("""movies  : Array[String] = """ + $show(movies ));$skip(31); 
  movies(0) = "This is a test";$skip(77); 
  
  
  def print(strArray:Array[String]):Unit = (strArray.foreach(println));System.out.println("""print: (strArray: Array[String])Unit""");$skip(16); 
  print(movies);$skip(38); 
  
  var mult = new Array[AnyVal] (3);System.out.println("""mult  : Array[AnyVal] = """ + $show(mult ));$skip(14); 
  mult(0) = 1;$skip(14); 
  mult(1) = 2;$skip(14); 
  mult(2) = 3;$skip(27); 
  
  mult.foreach(println)}
}
