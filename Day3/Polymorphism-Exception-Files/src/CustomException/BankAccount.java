package CustomException;

public class BankAccount {
    private String  accountNumber;
    private double balance;
    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }
    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);

    }

    public void withdraw(double amount) {
        try {

            if (this.balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawal successful. New balance: " + balance);
            } else {
                throw new InsufficientFundsException("Insufficient funds! Cannot withdraw more than the available balance!"+
                        "\nyou ask withdraw a: "+amount+
                        " \nyour balance is: "+this.balance);
            }
        }
        catch (InsufficientFundsException e){
            System.out.println(e.getMessage());

        }

    }

    public double getBalance() {
        return this.balance;
    }
    public String getAccountNumber() {
        return this.accountNumber;
    }
}
