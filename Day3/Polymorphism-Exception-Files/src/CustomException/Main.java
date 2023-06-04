package CustomException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        BankAccount account = new BankAccount("123");
        System.out.println("Balance of: "+account.getAccountNumber()+" is :"+account.getBalance());
        account.deposit(120);
        System.out.println("Balance of: "+account.getAccountNumber()+" is :"+account.getBalance());
        account.deposit(15);
        System.out.println("Balance of: "+account.getAccountNumber()+" is :"+account.getBalance());
        //check exception
        account.withdraw(200);
        System.out.println("Balance of: "+account.getAccountNumber()+" is :"+account.getBalance());
        account.withdraw(100);
        System.out.println("Balance of: "+account.getAccountNumber()+" is :"+account.getBalance());
    }
}