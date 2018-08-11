object specialFunctions {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(69); 
  println("Welcome to the Scala worksheet");$skip(24); val res$0 = 
  ((x:Int) => x + 1)(5);System.out.println("""res0: Int = """ + $show(res$0));$skip(27); 
  val f = (x:Int) => x + 1;System.out.println("""f  : Int => Int = """ + $show(f ));$skip(7); val res$1 = 
  f(5);System.out.println("""res1: Int = """ + $show(res$1));$skip(13); val res$2 = 
  f.apply(3);System.out.println("""res2: Int = """ + $show(res$2));$skip(33); 
  val doubler = (x:Int) => x * 2;System.out.println("""doubler  : Int => Int = """ + $show(doubler ));$skip(13); val res$3 = 
  doubler(6);System.out.println("""res3: Int = """ + $show(res$3));$skip(65); 
  def someOperation(f:(Int, Int) => Int) {
  println(f(5,5))
  };System.out.println("""someOperation: (f: (Int, Int) => Int)Unit""");$skip(36); 
  val add = (x:Int, y:Int) => x + y;System.out.println("""add  : (Int, Int) => Int = """ + $show(add ));$skip(21); 
  someOperation(add);$skip(59); 
  
  def greeting() = (name:String) => {"Hello: " + name };System.out.println("""greeting: ()String => String""");$skip(21); 
  val g = greeting();System.out.println("""g  : String => String = """ + $show(g ));$skip(22); val res$4 = 
  g("Usman Mohammed");System.out.println("""res4: String = """ + $show(res$4));$skip(15); 
  
  val y = 5;System.out.println("""y  : Int = """ + $show(y ));$skip(36); 
  val multiplyer = (x:Int) => x * y;System.out.println("""multiplyer  : Int => Int = """ + $show(multiplyer ));$skip(16); val res$5 = 
  multiplyer(4);System.out.println("""res5: Int = """ + $show(res$5))}
}
