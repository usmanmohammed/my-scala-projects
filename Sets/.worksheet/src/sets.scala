object sets {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(57); 
  println("Welcome to the Scala worksheet");$skip(55); 
  val fruit = Set("mango", "orange", "apple", 1, 2, 3);System.out.println("""fruit  : scala.collection.immutable.Set[Any] = """ + $show(fruit ));$skip(17); val res$0 = 
  fruit("mango");System.out.println("""res0: Boolean = """ + $show(res$0));$skip(18); val res$1 = 
  fruit("potato");System.out.println("""res1: Boolean = """ + $show(res$1));$skip(49); 

  var s = Set(1, 2, 3, 4, 5, 4, 5, 3, 2, 2, 1);System.out.println("""s  : scala.collection.immutable.Set[Int] = """ + $show(s ));$skip(9); 
  s += 6;$skip(13); 
  println(s);$skip(72); 

  if (s.isEmpty)
    println("s is empty")
  else
    println(s.head);$skip(18); 
  println(s.tail);$skip(15); val res$2 = 

  fruit ++ s;System.out.println("""res2: scala.collection.immutable.Set[Any] = """ + $show(res$2));$skip(24); 
  val s1 = Set(1, 2, 3);System.out.println("""s1  : scala.collection.immutable.Set[Int] = """ + $show(s1 ));$skip(10); val res$3 = 
  s1.&(s);System.out.println("""res3: scala.collection.immutable.Set[Int] = """ + $show(res$3));$skip(44); 

  var g = Map(1 -> "Orange", 2 -> "Eggs");System.out.println("""g  : scala.collection.immutable.Map[Int,String] = """ + $show(g ));$skip(7); val res$4 = 
  g(1);System.out.println("""res4: String = """ + $show(res$4));$skip(28); 
  
  g = g + (6-> "Banana");$skip(12); 
	println(g);$skip(12); val res$5 = 
	
	g.get(5);System.out.println("""res5: Option[String] = """ + $show(res$5));$skip(30); val res$6 = 
	
	g.getOrElse(5, "No match");System.out.println("""res6: String = """ + $show(res$6))}
}
