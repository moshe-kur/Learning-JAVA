package Bank;

public class BankAccount {
    private String name;
    private int accountNumber;
    private float balance;
    public BankAccount(String Name, int AccountNumber, float Balance) {
        this.name = Name;
        this.accountNumber = AccountNumber;
        this.balance = Balance;
    }
    public void addMoney(float amount) {
        this.balance += amount;
    }

    public void minusMoney(float amount) {
        this.balance -= amount;
    }

    public float getBalance() {
        return this.balance;
    }
}
