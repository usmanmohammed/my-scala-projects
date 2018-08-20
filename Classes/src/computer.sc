object computer {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  class Computer(val make:String, val model:String, val ram:String) {
  	override def toString:String = "["+ make + ", " + model + ", " + ram + "]"
  }
  
  var computers = List(new Computer("HP", "Pavilion", "24GB"),
   new Computer("Dell", "XPS 15", "32GB"),
    new Computer("ASUS", "G750JM", "16GB"))       //> computers  : List[computer.Computer] = List([HP, Pavilion, 24GB], [Dell, XPS
                                                  //|  15, 32GB], [ASUS, G750JM, 16GB])
    
    var first = computers.head                    //> first  : computer.Computer = [HP, Pavilion, 24GB]
    
    var remaining = computers.tail                //> remaining  : List[computer.Computer] = List([Dell, XPS 15, 32GB], [ASUS, G75
                                                  //| 0JM, 16GB])
}