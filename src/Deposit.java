import java.util.Scanner;


// Deposit class helps a user to deposit funds to his/her account
public class Deposit {
    public Deposit(Scanner scanner, Account acc) {
        System.out.println("Enter amount: ");
        double amount = scanner.nextDouble();
        acc.setBalance(acc.getBalance() + amount);
        System.out.println("Operation done successfully!!");
    }
}
