object caseclasses {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  case class Money(val amount: Int = 1, val currency: String = "USD") {
    override def toString: String = ("Amount: "+ amount + ", Currency: " + currency)
    def +(other: Money): Money = Money(amount + other.amount)
  }

  val defaultAmount = Money()                     //> defaultAmount  : caseclasses.Money = Amount: 1, Currency: USD

  val fiveDollars = Money(5)                      //> fiveDollars  : caseclasses.Money = Amount: 5, Currency: USD

  val fiveDollars2 = Money(5, "USD")              //> fiveDollars2  : caseclasses.Money = Amount: 5, Currency: USD

  val euros = Money(currency = "EUR")             //> euros  : caseclasses.Money = Amount: 1, Currency: EUR

  val tenEuros = euros.copy(10)                   //> tenEuros  : caseclasses.Money = Amount: 10, Currency: EUR

  val tenDollars2 = tenEuros.copy(currency = "USD")
                                                  //> tenDollars2  : caseclasses.Money = Amount: 10, Currency: USD

  val moneyList = List(Money(), Money(50, "GBP"), Money(45, "EUR"))
                                                  //> moneyList  : List[caseclasses.Money] = List(Amount: 1, Currency: USD, Amount
                                                  //| : 50, Currency: GBP, Amount: 45, Currency: EUR)

  println("add 10 + 15: " + (Money(10) + Money(15)))
                                                  //> add 10 + 15: Amount: 25, Currency: USD
}