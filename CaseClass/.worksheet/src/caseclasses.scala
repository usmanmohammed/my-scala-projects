object caseclasses {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(64); 
  println("Welcome to the Scala worksheet")

  case class Money(val amount: Int = 1, val currency: String = "USD") {
    override def toString: String = ("Amount: "+ amount + ", Currency: " + currency)
    def +(other: Money): Money = Money(amount + other.amount)
  };$skip(257); 

  val defaultAmount = Money();System.out.println("""defaultAmount  : caseclasses.Money = """ + $show(defaultAmount ));$skip(31); 

  val fiveDollars = Money(5);System.out.println("""fiveDollars  : caseclasses.Money = """ + $show(fiveDollars ));$skip(39); 

  val fiveDollars2 = Money(5, "USD");System.out.println("""fiveDollars2  : caseclasses.Money = """ + $show(fiveDollars2 ));$skip(40); 

  val euros = Money(currency = "EUR");System.out.println("""euros  : caseclasses.Money = """ + $show(euros ));$skip(34); 

  val tenEuros = euros.copy(10);System.out.println("""tenEuros  : caseclasses.Money = """ + $show(tenEuros ));$skip(54); 

  val tenDollars2 = tenEuros.copy(currency = "USD");System.out.println("""tenDollars2  : caseclasses.Money = """ + $show(tenDollars2 ));$skip(70); 

  val moneyList = List(Money(), Money(50, "GBP"), Money(45, "EUR"));System.out.println("""moneyList  : List[caseclasses.Money] = """ + $show(moneyList ));$skip(55); 

  println("add 10 + 15: " + (Money(10) + Money(15)))}
}
