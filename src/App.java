import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        List<BankAgency> bankAgencies = new ArrayList<BankAgency>();
        List<BankAccount> bankAccounts = new ArrayList<BankAccount>();
        List<Integer> menuOptions = Arrays.asList(new Integer[] { 1, 2, 3, 4 });
        int choice;

        try {
            do {
                System.out.println("########## BANCO JAVANDER ##########");
                System.out.println("___________________________________________");
                System.out.println("Digite 1 para criar sua conta.");
                System.out.println("Digite 2 para consultar seu saldo. (em breve)");
                System.out.println("Digite 3 para fazer um depósito. (em breve)");
                System.out.println("Digite 4 para fazer um saque. (em breve)");
                System.out.println("Digite qualquer outra tecla para encerrar o programa.");

                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        CreateBankAccountHandler.execute(bankAccounts, bankAgencies, scanner);
                        break;
                    default:
                        break;
                }
            } while (menuOptions.contains(choice));

            System.out.println("Obrigado por usar o banco Javander");
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            scanner.close();
        }
    }
}
