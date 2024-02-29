public class Account {

    private String firstName;
    private String lastName;
    private int acc_id;
    private double balance;
    private int passcode;


    public Account() {

    }

    public Account(String firstName, String lastName, int acc_id, double balance, int passcode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.acc_id = acc_id;
        this.balance = balance;
        this.passcode = passcode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAcc_id() {
        return acc_id;
    }

    public void setAcc_id(int acc_id) {
        this.acc_id = acc_id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getPasscode() {
        return passcode;
    }

    public void setPasscode(int passcode) {
        this.passcode = passcode;
    }
}
