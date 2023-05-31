public class factory {

    factory(char newSymbol,int newNumber)
    {
        this.symbol=newSymbol;
        this.number=newNumber;
    }
     char symbol;
    int number;
    public static factory make(char newSymbol,int newNumber)
    {
        return new factory( newSymbol, newNumber);
    }
}
