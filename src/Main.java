import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scanner;
    static int lastaccid = 0;
    private static ArrayList<Account> accounts;

    public static void main(String[] args) {

        accounts = new ArrayList<>();
        scanner = new Scanner(System.in);

            System.out.println("Welcome to bank management system");
            System.out.println("1. Create new account");
            System.out.println("2. Login");
            System.out.println("3. Exit");

            int i = scanner.nextInt();
            switch (i) {
                case 1: createNewAcc();
                break;
                case 2: login();
                break;
            }

    }

    private static void createNewAcc() {
        System.out.println("Enter firstname: ");
        String firstName = scanner.next();
        System.out.println("Enter lastname: ");
        String lastName = scanner.next();
        System.out.println("Enter balance: ");
        double balance = scanner.nextDouble();
        System.out.println("Enter your passcode: (digits only)");
        int passcode = scanner.nextInt();
        System.out.println("Confirm your passcode: ");
        int passcodec = scanner.nextInt();

        if (passcode != passcodec) {
            System.out.println("Passcode don't match\n");
            return;
        }

        int id = 1000000 + lastaccid;
        lastaccid = lastaccid + 1;
        Account acc = new Account(firstName, lastName, id, balance, passcode);
        accounts.add(acc);
        System.out.println("Your account id: " + id);
        showMenu(acc);
    }

    private static void login() {
        System.out.println(" Enter account id: ");
        int id = scanner.nextInt();
        System.out.println("Enter passcode: ");
        int passcode = scanner.nextInt();

        Account account = new Account();
        boolean exist = false;
        for ( Account acc : accounts ) {
            if (acc.getAcc_id() == id && acc.getPasscode() == passcode) {
                exist = true;
                account = acc;
            }
        }
        if (exist) {
            showMenu(account);
        } else {
            System.out.println("Account doesn't exist");
        }

    }

    private static void showMenu(Account acc) {
        int j = 0;
        do {
        System.out.println("Welcome "+ acc.getFirstName()+ " " +acc.getLastName() + "!\n");
        System.out.println("1. Deposit\n2. Withdraw\n3. Balance\n4. Exit");

        j = scanner.nextInt();
        switch (j) {
            case 1:
                new Deposit(scanner, acc);
                break;
            case 2:
                new Withdraw(scanner, acc);
                break;
            case 3:
                System.out.println("Your balance is: " + acc.getBalance());
                break;
            case 4:
                scanner.close();
        }
        } while (j != 4);
    }
}