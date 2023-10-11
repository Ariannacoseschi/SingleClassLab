import java.time.LocalDate;

public class BankAccount {
    public String firstName;
    public String lastName;
    public LocalDate dateOfBirth;
    public String accountNumber;
    public double balance;

    public BankAccount(String firstName, String lastName, String dateOfBirth, String accountNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getDate0fBirth() {
        return dateOfBirth;
    }

    public double getBalance() {
        return balance;
    }



}
