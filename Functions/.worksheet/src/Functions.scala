object Functions {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(37); 
val x = println(2);System.out.println("""x  : Unit = """ + $show(x ));$skip(40); 
def printHello(i:String) = "Hello " + i;System.out.println("""printHello: (i: String)String""");$skip(20); val res$0 = 
printHello("Usman");System.out.println("""res0: String = """ + $show(res$0));$skip(30); 
def Hello() = "Hello World!!";System.out.println("""Hello: ()String""");$skip(8); val res$1 = 
Hello();System.out.println("""res1: String = """ + $show(res$1));$skip(34); 
def add(x:Int, y:Int):Int = x + y;System.out.println("""add: (x: Int, y: Int)Int""");$skip(10); val res$2 = 
add(8, 7);System.out.println("""res2: Int = """ + $show(res$2))}
}
