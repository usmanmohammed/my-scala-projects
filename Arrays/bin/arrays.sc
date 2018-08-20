object arrays {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  var movies:Array[String] = new Array[String] (5)
  movies(0) = "This is a test"
  
  
  def print(strArray:Array[String]):Unit = (strArray.foreach(println))
  print(movies)
  
  var mult = new Array[AnyVal] (3)
  mult(0) = 1
  mult(1) = 2
  mult(2) = 3
  
  mult.foreach(println)
}