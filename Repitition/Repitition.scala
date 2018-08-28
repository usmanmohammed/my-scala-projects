var i = 5
while (i >= 0) {
    print(i + ",")
    // Decrement
    i -= 1
}
println

val fruit = List("Apples", "Bananas", "Cheries", "Pears", "Blueberries")
for (f <- fruit)
println(f)

// Filtering while traversing
for (f <- fruit if (f.startsWith("C")))
println("fruits starting with c: " + f)

// Nested for loop
for (i <- 1 to 5 ; j <- 1 to 5)
print(i * j + ",")
println

// For any even number between 1 to 10, square it.
for (n <- 1 to 10 ; if n % 2 == 0) yield n * n

// Sum each pair of numbers
val list = List((1, 2), (3, 4), (5, 6))
for ((a, b) <- list ) yield a + b

// Create a vector of ordered number pairs
for (x <- 0 to 4 ; y <- 0 until 3) yield (x, y)

import scala.io.StdIn.{readLine, readInt}
var choice = 0;
var result = ""

do {
    println("\n Choose one: \n1. Java\n2. Scala\n3. C++\n4. Exit")
    choice = readInt
    result = choice match {
        case 1 => "You chose java"
        case 2 => "You chose Scala"
        case 3 => "You chose c++"
        case 4 => "You chose exit"
        case _ => "Invalid choice, Try again!"
    }
    println(result)
}
while (choice != 1 && choice != 2 && choice != 3 && choice != 4)
