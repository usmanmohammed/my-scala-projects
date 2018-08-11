object specialFunctions {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  ((x:Int) => x + 1)(5)                           //> res0: Int = 6
  val f = (x:Int) => x + 1                        //> f  : Int => Int = specialFunctions$$$Lambda$9/1277181601@27f674d
  f(5)                                            //> res1: Int = 6
  f.apply(3)                                      //> res2: Int = 4
  val doubler = (x:Int) => x * 2                  //> doubler  : Int => Int = specialFunctions$$$Lambda$10/488970385@48140564
  doubler(6)                                      //> res3: Int = 12
  def someOperation(f:(Int, Int) => Int) {
  println(f(5,5))
  }                                               //> someOperation: (f: (Int, Int) => Int)Unit
  val add = (x:Int, y:Int) => x + y               //> add  : (Int, Int) => Int = specialFunctions$$$Lambda$11/1134712904@3ac3fd8b
                                                  //| 
  someOperation(add)                              //> 10
  
  def greeting() = (name:String) => {"Hello: " + name }
                                                  //> greeting: ()String => String
  val g = greeting()                              //> g  : String => String = specialFunctions$$$Lambda$12/1435804085@6a5fc7f7
  g("Usman Mohammed")                             //> res4: String = Hello: Usman Mohammed
  
  val y = 5                                       //> y  : Int = 5
  val multiplyer = (x:Int) => x * y               //> multiplyer  : Int => Int = specialFunctions$$$Lambda$13/142666848@39ba5a14
  multiplyer(4)                                   //> res5: Int = 20
}