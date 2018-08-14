object sets {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val fruit = Set("mango", "orange", "apple", 1, 2, 3)
                                                  //> fruit  : scala.collection.immutable.Set[Any] = Set(1, orange, 2, mango, 3, a
                                                  //| pple)
  fruit("mango")                                  //> res0: Boolean = true
  fruit("potato")                                 //> res1: Boolean = false

  var s = Set(1, 2, 3, 4, 5, 4, 5, 3, 2, 2, 1)    //> s  : scala.collection.immutable.Set[Int] = Set(5, 1, 2, 3, 4)
  s += 6
  println(s)                                      //> Set(5, 1, 6, 2, 3, 4)

  if (s.isEmpty)
    println("s is empty")
  else
    println(s.head)                               //> 5
  println(s.tail)                                 //> Set(1, 6, 2, 3, 4)

  fruit ++ s                                      //> res2: scala.collection.immutable.Set[Any] = Set(5, 1, 6, orange, 2, mango, 3
                                                  //| , apple, 4)
  val s1 = Set(1, 2, 3)                           //> s1  : scala.collection.immutable.Set[Int] = Set(1, 2, 3)
  s1.&(s)                                         //> res3: scala.collection.immutable.Set[Int] = Set(1, 2, 3)

  var g = Map(1 -> "Orange", 2 -> "Eggs")         //> g  : scala.collection.immutable.Map[Int,String] = Map(1 -> Orange, 2 -> Eggs
                                                  //| )
  g(1)                                            //> res4: String = Orange
  
  g = g + (6-> "Banana")
	println(g)                                //> Map(1 -> Orange, 2 -> Eggs, 6 -> Banana)
	
	g.get(5)                                  //> res5: Option[String] = None
	
	g.getOrElse(5, "No match")                //> res6: String = No match
}