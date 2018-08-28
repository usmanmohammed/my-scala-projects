val scores = List(20, 93, 10, 49, 29, 33, 58, 96, 75, 56)
var total = 0
var itemsCount = 0
for (s <- scores) {
    if (s >= 93 && s <= 100)
    println(s + "-A")
    else if (s >= 86 && s <= 92)
    println(s + "-B")
    else if (s >= 77 && s <= 85)
    println(s + "-C")
    else if (s >= 69 && s <= 76)
    println(s + "-D")
    else
    println(s + "-F")

    total += s
    itemsCount += 1
}

println("Average: " + (total / itemsCount))
