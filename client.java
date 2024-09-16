import java.util.Scanner;

public class client {
    public static void main(String[] args) {
        // taking input from user about what type of service he wants
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the type of service you want: ");
        // three options
        System.out.println("1. Regular");
        System.out.println("2. Premium");
        System.out.println("3. VIP");

        String serviceType = scanner.nextLine();
        Factory factory = null;
        // creating object of factory based on user input

        if (serviceType.equals("Regular")) {
            factory = new RegularService();
        } else if (serviceType.equals("Premium")) {
            factory = new PremiumService();
        } else if (serviceType.equals("VIP")) {
            factory = new VIPService();
        } else {
            System.out.println("Invalid service type");
            return;
        }

        // creating object of service based on factory object
        System.out.println("Do you want to take a loan or open an account?");
        String choice = scanner.nextLine();
        if (choice.equals("loan")) {
            Loan loan = factory.getLoan();
            System.out.println("Enter the amount of loan: ");
            double amount = scanner.nextDouble();
            loan.setAmountOfLoan(amount);
            System.out.println("Enter the duration of loan: ");
            int duration = scanner.nextInt();
            loan.setLoanDuration(duration);
        } else if (choice.equals("account")) {
            Account account = factory.getAccount();
            System.out.println("Enter the amount you want to deposit: ");
            double amount = scanner.nextDouble();
            account.deposit(amount);
            System.out.println("Enter the amount you want to withdraw: ");
            amount = scanner.nextDouble();
            account.withdraw(amount);
        } else {
            System.out.println("Invalid choice");
        }

    }
}
