public class App {
    public static void main(String[] args) throws Exception {
        try {
            Customer customer = new Customer("12345678909", "Yan", "Oliveira");
            BankAgency agency = new BankAgency("067-8", "Santander", "Rua x, 123 - São Paulo");
            BankAccount bankAccount = new BankAccount(customer, agency, "1021", 237.48);
            bankAccount.greeting();
        } catch (Exception e) {
            System.err.println("Something went wrong...");
        }
    }
}
