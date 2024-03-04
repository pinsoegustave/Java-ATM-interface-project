import java.util.Scanner;


// Withdraw class to help a user when withdrawing funds
public class Withdraw {

    public Withdraw(Scanner scanner, Account acc) {
        System.out.println("Enter amount: ");
        double amount = scanner.nextDouble();
        if ( amount > acc.getBalance()) {
            System.out.println("Insufficient funds to withdraw");
        } else {
            acc.setBalance(acc.getBalance() - amount);
            System.out.println("Operation to withdraw done successfully!!");
        }
    }
}
