object Employee {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(61); 
  println("Welcome to the Scala worksheet")

  case class Employee(val id: Int = 10101, val firstName: String = "John", val lastName: String = "Doe") {
    override def toString: String = ("Employee id: " + id + "\nFull Name: " + firstName + " " + lastName +"\n")
  };$skip(381); 
  
  var employeeList = List(Employee(),
  Employee(10102, "Usman", "Mohammed"),
  Employee(10103, "Bala", "Buba"),
  Employee(10104, "Andrew", "Moffat"));System.out.println("""employeeList  : List[Employee.Employee] = """ + $show(employeeList ));$skip(36); 
  
  employeeList.foreach(println)}
}
