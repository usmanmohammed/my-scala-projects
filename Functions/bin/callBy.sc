object CallBy {
  def something() = {
  println("Inside calling something")
  5
  }                                               //> something: ()Int
  
  def callByValue(x:Int) = {
  println("call by value: ")
  println("x1 = " + x)
  println("x2 = " + x)
  }                                               //> callByValue: (x: Int)Unit
  callByValue(something())                        //> Inside calling something
                                                  //| call by value: 
                                                  //| x1 = 5
                                                  //| x2 = 5
  
  def callByName(x: => Int) = {
  println("call by name: ")
  println("x1 = " + x)
  println("x2 = " + x)
  }                                               //> callByName: (x: => Int)Unit
  callByName(something())                         //> call by name: 
                                                  //| Inside calling something
                                                  //| x1 = 5
                                                  //| Inside calling something
                                                  //| x2 = 5
}