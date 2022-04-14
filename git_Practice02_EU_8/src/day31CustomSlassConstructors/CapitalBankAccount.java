package day31CustomSlassConstructors;

public class CapitalBankAccount {


    public static void main(String[] args) {

        BankAccounts account1 = new BankAccounts();
        account1.setInfo("Ayhan Kaya", 123456789);

        System.out.println(account1);

        account1.deposit(1000);
        account1.chechkBalance();

        account1.withDraw(900);
        account1.chechkBalance();

        account1.deposit(900);
        account1.chechkBalance();

        System.out.println("----------------");

        BankAccounts account2 = new BankAccounts();
        account2.setInfo("Ali Atıl",852369741);









    }
}
