package day14abstractandinterface;

public class CheckingAccount implements Account{
    @Override
    public void openAccount() {
        System.out.println("Checking account is opened");
    }
}
