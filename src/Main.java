import java.util.Scanner;

class BankInitiate {
    public void initiate() {
        bankController bc = new bankController();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("=============================================");
            System.out.println("\tWelcome to the State Bank of India");
            System.out.println("=============================================");
            System.out.println("Enter the option below:");
            System.out.println("1. Add Account");
            System.out.println("2. Display Accounts");
            System.out.println("3. Exit");
            System.out.print("Your choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                sc.next();
                continue;
            }

            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    bc.getAccount();
                    break;
                case 2:
                    bc.displayAccounts();
                    break;
                case 3:
                    System.out.println("Thank you for using SBI. Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        BankInitiate init = new BankInitiate();
        init.initiate();
    }
}
