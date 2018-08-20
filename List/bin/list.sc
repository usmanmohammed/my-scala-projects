object list {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val empty:List[Nothing] = List()                //> empty  : List[Nothing] = List()
 	val a = List(3.0, "Test")                 //> a  : List[Any] = List(3.0, Test)
 	var x1 = List(1, 2, 3, 4, 5, 6)           //> x1  : List[Int] = List(1, 2, 3, 4, 5, 6)
 	var x2 = 1::2::3::4::5::6::Nil            //> x2  : List[Int] = List(1, 2, 3, 4, 5, 6)
 	var x3 = List.range(20, 30)               //> x3  : List[Int] = List(20, 21, 22, 23, 24, 25, 26, 27, 28, 29)
 	var x4 = List.range(1, 20, 2)             //> x4  : List[Int] = List(1, 3, 5, 7, 9, 11, 13, 15, 17, 19)
 	
 	var x5 = x3:::x4                          //> x5  : List[Int] = List(20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 1, 3, 5, 7, 9
                                                  //| , 11, 13, 15, 17, 19)
 	var x6 = List.concat(x3, x4)              //> x6  : List[Int] = List(20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 1, 3, 5, 7, 9
                                                  //| , 11, 13, 15, 17, 19)
	var sum = 0                               //> sum  : Int = 0
	x6.foreach(sum += _)
	println(sum)                              //> 345
             
  for(v <- x6)println(v)                          //> 20
                                                  //| 21
                                                  //| 22
                                                  //| 23
                                                  //| 24
                                                  //| 25
                                                  //| 26
                                                  //| 27
                                                  //| 28
                                                  //| 29
                                                  //| 1
                                                  //| 3
                                                  //| 5
                                                  //| 7
                                                  //| 9
                                                  //| 11
                                                  //| 13
                                                  //| 15
                                                  //| 17
                                                  //| 19
  
  println(x1.map(_ * 30))                         //> List(30, 60, 90, 120, 150, 180)
}