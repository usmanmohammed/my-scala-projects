object computer {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(61); 
  println("Welcome to the Scala worksheet")
  
  class Computer(val make:String, val model:String, val ram:String) {
  	override def toString:String = "["+ make + ", " + model + ", " + ram + "]"
  };$skip(308); 
  
  var computers = List(new Computer("HP", "Pavilion", "24GB"),
   new Computer("Dell", "XPS 15", "32GB"),
    new Computer("ASUS", "G750JM", "16GB"));System.out.println("""computers  : List[computer.Computer] = """ + $show(computers ));$skip(36); 
    
    var first = computers.head;System.out.println("""first  : computer.Computer = """ + $show(first ));$skip(40); 
    
    var remaining = computers.tail;System.out.println("""remaining  : List[computer.Computer] = """ + $show(remaining ))}
}
