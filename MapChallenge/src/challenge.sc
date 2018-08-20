object challenge {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  var items = Map("Finding Nemo" -> "PG-13", "Harry Porter" -> "PG")
                                                  //> items  : scala.collection.immutable.Map[String,String] = Map(Finding Nemo ->
                                                  //|  PG-13, Harry Porter -> PG)
  println(items("Finding Nemo"))                  //> PG-13

  for (item <- items) println(item)               //> (Finding Nemo,PG-13)
                                                  //| (Harry Porter,PG)

  items += ("Interstellar" -> "PG-18")

  for (item <- items) println(item)               //> (Finding Nemo,PG-13)
                                                  //| (Harry Porter,PG)
                                                  //| (Interstellar,PG-18)
}