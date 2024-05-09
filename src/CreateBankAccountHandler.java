import java.util.List;
import java.util.Scanner;

public class CreateBankAccountHandler {
    public static void execute(List<BankAccount> bankAccounts, List<BankAgency> bankAgencies, Scanner scanner) {
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
    }
}
