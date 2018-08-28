object Employee {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  case class Employee(val id: Int = 10101, val firstName: String = "John", val lastName: String = "Doe") {
    override def toString: String = ("Employee id: " + id + "\nFull Name: " + firstName + " " + lastName +"\n")
  }
  
  var employeeList = List(Employee(),
  Employee(10102, "Usman", "Mohammed"),
  Employee(10103, "Bala", "Buba"),
  Employee(10104, "Andrew", "Moffat"))            //> employeeList  : List[Employee.Employee] = List(Employee id: 10101
                                                  //| Full Name: John Doe
                                                  //| , Employee id: 10102
                                                  //| Full Name: Usman Mohammed
                                                  //| , Employee id: 10103
                                                  //| Full Name: Bala Buba
                                                  //| , Employee id: 10104
                                                  //| Full Name: Andrew Moffat
                                                  //| )
  
  employeeList.foreach(println)                   //> Employee id: 10101
                                                  //| Full Name: John Doe
                                                  //| 
                                                  //| Employee id: 10102
                                                  //| Full Name: Usman Mohammed
                                                  //| 
                                                  //| Employee id: 10103
                                                  //| Full Name: Bala Buba
                                                  //| 
                                                  //| Employee id: 10104
                                                  //| Full Name: Andrew Moffat
                                                  //| 
}