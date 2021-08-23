package day14abstractandinterface;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the type of account");
        String choice = input.next();

        Account account = null;
        switch (choice){
            case "saving":
                 account = new SavingAccount();
                break;
            case "checking":
                account = new CheckingAccount();
                break;
            default:
                System.out.println("not a valid input");
        }
        if (account!=null)
            account.openAccount();
    }
}
