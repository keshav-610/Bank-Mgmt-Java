import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class bankAccount {
    String accountNumber;
    String accountName;

    public bankAccount(String accNumber, String accountName) {
        this.accountNumber = accNumber;
        this.accountName = accountName;
    }
    public String toString() {
        return "Account Number: " + accountNumber + ", Account Name: " + accountName;
    }

}
class bankController{
    ArrayList<bankAccount> accounts = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public String generateAccountNumber(){
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        sb.append(random.nextInt(9)+1);
        for (int i = 0; i < 15; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }

    public void getAccount(){
        String accNumber = generateAccountNumber();
        System.out.print("Enter your name:  ");
        String accName = sc.next();
        addAccount(accNumber,accName);
        System.out.println("Account Added Successfully");
        System.out.println("Account Number: "+accNumber);
        System.out.println("Account Name: "+accName);
    }

    public void addAccount(String accNumber,String accName){
        bankAccount account = new bankAccount(accNumber,accName);
        accounts.add(account);
    }
    public void displayAccounts(){
        for (bankAccount account:accounts){
            System.out.println(account);
        }
    }
}
