import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        List<BankAgency> bankAgencies = new ArrayList<BankAgency>();
        List<BankAccount> bankAccounts = new ArrayList<BankAccount>();

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
                    System.err.println("Por favor, digite o seu CPF! (apenas números)");
                    String documentId = scanner.next();

                    System.err.println("Por favor, digite o valor do seu depósito inicial!");
                    Double balance = scanner.nextDouble();

                    Customer customer = new Customer(documentId, firstName, lastname);

                    String agencyId = String.format("%" + 4 + "s", String.valueOf(bankAgencies.size() + 1)).replace(' ',
                            '0');
                    String accountNumber = String.format("%" + 4 + "s", String.valueOf(bankAccounts.size() + 1))
                            .replace(' ', '0');

                    BankAgency agency = new BankAgency(agencyId, "Rua x, 123 - São Paulo");
                    bankAgencies.add(agency);

                    BankAccount bankAccount = new BankAccount(customer, agency, accountNumber, balance);
                    bankAccounts.add(bankAccount);

                    bankAccount.greeting();

                    break;
                default:
                    System.out.println("Obrigado por usar o banco Javander");
                    break;
            }
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            scanner.close();
        }
    }
}
