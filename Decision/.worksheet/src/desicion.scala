object desicion {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(61); 
  println("Welcome to the Scala worksheet");$skip(23); 
  var hoursWorked = 40;System.out.println("""hoursWorked  : Int = """ + $show(hoursWorked ));$skip(22); 
  var hourlyRate = 10;System.out.println("""hourlyRate  : Int = """ + $show(hourlyRate ));$skip(132); 

  def earnings(h: Double): Double = {
    if (h <= 40)
      h * hourlyRate
    else
      hourlyRate * ((h - 40) * 1.5 + 40)
  };System.out.println("""earnings: (h: Double)Double""");$skip(39); 
  println("$" + earnings(hoursWorked));$skip(30); 
  println("$" + earnings(30));$skip(30); 
  println("$" + earnings(45));$skip(14); 

  var x = 2;System.out.println("""x  : Int = """ + $show(x ));$skip(107); 
  if (x < 0)
    println("negative")
  else if (x == 0)
    println("zero")
  else
    println("positive");$skip(40); 

  // Match example
  val day1 = "FRI";System.out.println("""day1  : String = """ + $show(day1 ));$skip(19); 
  val day2 = "SAT";System.out.println("""day2  : String = """ + $show(day2 ));$skip(19); 
  val day3 = "AAA";System.out.println("""day3  : String = """ + $show(day3 ));$skip(218); 

  val result = day3 match {
    case "MON" | "TUE" | "WED" | "THU" | "FRI" => "weekday"
    case "SAT" | "SUN"                         => "weekend"
    case _                                     => "invalid day"
  };System.out.println("""result  : String = """ + $show(result ))}
}
