object challenge {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(62); 
  println("Welcome to the Scala worksheet");$skip(71); 

  var items = Map("Finding Nemo" -> "PG-13", "Harry Porter" -> "PG");System.out.println("""items  : scala.collection.immutable.Map[String,String] = """ + $show(items ));$skip(33); 
  println(items("Finding Nemo"));$skip(38); 

  for (item <- items) println(item);$skip(41); 

  items += ("Interstellar" -> "PG-18");$skip(38); 

  for (item <- items) println(item)}
}
