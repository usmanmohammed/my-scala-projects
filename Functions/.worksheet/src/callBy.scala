object CallBy {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(83); 
  def something() = {
  println("Inside calling something")
  5
  };System.out.println("""something: ()Int""");$skip(111); 
  
  def callByValue(x:Int) = {
  println("call by value: ")
  println("x1 = " + x)
  println("x2 = " + x)
  };System.out.println("""callByValue: (x: Int)Unit""");$skip(27); 
  callByValue(something());$skip(113); 
  
  def callByName(x: => Int) = {
  println("call by name: ")
  println("x1 = " + x)
  println("x2 = " + x)
  };System.out.println("""callByName: (x: => Int)Unit""");$skip(26); 
  callByName(something())}
}
