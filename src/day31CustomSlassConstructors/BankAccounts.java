package day31CustomSlassConstructors;

public class BankAccounts {

   public  String accountHolder;
   public  long accountNumber;
   public  double balance;

    public void setInfo(String accountHolder, long accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    public String toString() {
        return "BankAccounts{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }

    public void withDraw(double amount){
        if(amount>balance){
            System.out.println("Sufficient balance");
            return;
        }
        if(amount<=0){
            System.out.println("Withdrawşng amount can not be 0 or negatives");
            return;
        }
    }



    public  void chechkBalance(){
        System.out.println("Your balance is: "+balance);
    }

    public void deposit(double amount){
        if(amount<=0){
            System.out.println("Your amount is not zero or negatives");
            return;
        }
       balance-=amount;
    }
}
