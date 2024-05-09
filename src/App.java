import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("########## BANCO JAVANDER ##########");
            System.out.println("___________________________________________");
            System.out.println("Digite 1 para criar sua conta.");
            System.out.println("Digite 2 para consultar seu saldo. (em breve)");
            System.out.println("Digite 3 para fazer um depósito. (em breve)");
            System.out.println("Digite 4 para fazer um saque. (em breve)");
            System.out.println("Digite qualquer outra tecla para encerrar o programa.");

            String choice = scanner.next();

            switch (choice) {
                case "1":
                    System.out.println("### CRIAÇÃO DE CONTA BANCÁRIA ###");

                    System.err.println("Por favor, digite o seu nome!");
                    String firstName = scanner.next();

                    System.err.println("Por favor, digite o seu sobrenome!");
                    String lastname = scanner.next();

                    System.err.println("Por favor, digite o número da Agência!");
                    String agencyId = scanner.next();

                    System.err.println("Por favor, digite o número da conta!");
                    String accountNumber = scanner.next();

                    System.err.println("Por favor, digite o saldo!");
                    Double balance = scanner.nextDouble();

                    Customer customer = new Customer("12345678909", firstName, lastname);
                    BankAgency agency = new BankAgency(agencyId, "Javander", "Rua x, 123 - São Paulo");
                    BankAccount bankAccount = new BankAccount(customer, agency, accountNumber, balance);
                    bankAccount.greeting();

                    break;
                default:
                    System.out.println("Obrigado por usar o banco Javander");
                    break;
            }

        } catch (Exception e) {
            System.err.println("Something went wrong...");
        } finally {
            scanner.close();
        }
    }
}
