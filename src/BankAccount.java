import java.util.Formatter;

public class BankAccount {
    private Customer customer;
    private BankAgency agency;
    private String accountNumber;
    private String password;
    private double balance;

    public BankAccount(Customer customer, BankAgency agency, String accountNumber, double balance) {
        this.customer = customer;
        this.agency = agency;
        this.accountNumber = accountNumber; // TODO - generate automatcally
        this.password = "1234"; // TODO - provide a way the customer choose and change it
        this.balance = balance;
    }

    public void greeting() {
        Formatter formatter = new Formatter();
        formatter.format(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo de R$ %.2f já está disponível para saque",
                this.customer.getFirstName(), this.agency.getAgencyId(), this.accountNumber, this.balance);
        System.out.println(formatter);
    }

    public String getCustomerName() {
        return this.customer.getFullName();
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("The amount must be greater than zero.");
        }
        this.balance += amount;
    }

    public void withdraw(double amount, String password) {
        if (!this.checkPassword(password)) {
            throw new IllegalArgumentException("Invalid password.");
        }
        if (amount <= 0) {
            throw new IllegalArgumentException("The amount must be greater than zero.");
        }
        if (amount > this.balance) {
            throw new IllegalArgumentException("The amount must be lower than balance.");
        }
        this.balance -= amount;
    }

    private boolean checkPassword(String password) {
        return password == this.password;
    }
}
