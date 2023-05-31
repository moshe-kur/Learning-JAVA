public class TwoConstructors {
    int number1;
    int number2;

    TwoConstructors(int number)
    {
        this.number1=number;
        System.out.println(this.number1);
    }
    TwoConstructors(int number1,int number2)
    {
        this.number1=number1;
        this.number2=number2;
        System.out.print("number1: ");
        System.out.println(this.number1);
        System.out.print("number2: ");
        System.out.println(this.number2);
    }
    static int mult(int number)
    {
        int mult = number*number;
        return mult;
    }
}
