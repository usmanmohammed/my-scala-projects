object list {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(57); 
  println("Welcome to the Scala worksheet");$skip(35); 
  val empty:List[Nothing] = List();System.out.println("""empty  : List[Nothing] = """ + $show(empty ));$skip(28); 
 	val a = List(3.0, "Test");System.out.println("""a  : List[Any] = """ + $show(a ));$skip(34); 
 	var x1 = List(1, 2, 3, 4, 5, 6);System.out.println("""x1  : List[Int] = """ + $show(x1 ));$skip(33); 
 	var x2 = 1::2::3::4::5::6::Nil;System.out.println("""x2  : List[Int] = """ + $show(x2 ));$skip(30); 
 	var x3 = List.range(20, 30);System.out.println("""x3  : List[Int] = """ + $show(x3 ));$skip(32); 
 	var x4 = List.range(1, 20, 2);System.out.println("""x4  : List[Int] = """ + $show(x4 ));$skip(22); 
 	
 	var x5 = x3:::x4;System.out.println("""x5  : List[Int] = """ + $show(x5 ));$skip(31); 
 	var x6 = List.concat(x3, x4);System.out.println("""x6  : List[Int] = """ + $show(x6 ));$skip(13); 
	var sum = 0;System.out.println("""sum  : Int = """ + $show(sum ));$skip(22); 
	x6.foreach(sum += _);$skip(14); 
	println(sum);$skip(39); 
             
  for(v <- x6)println(v);$skip(29); 
  
  println(x1.map(_ * 30))}
}
