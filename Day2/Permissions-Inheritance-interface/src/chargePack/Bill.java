package chargePack;

public class Bill implements IDebit{
    public Bill(float Balance)
    {
        this.balance=Balance;
    }
    public Bill(){ }
    private float balance;
    @Override
    public void charge(float charge) {
        if (charge<=this.balance){
            this.balance-=charge;
        }
        else {
            System.out.println("You cannot charge more than the current balance");
        }
    }
    public void getBalance() {
        System.out.println(this.balance);
    }
    public void AddBalance(float adding) {
        this.balance+=adding;
    }
    public void MinusBalance(float adding) {
        this.balance-=adding;
    }

}
