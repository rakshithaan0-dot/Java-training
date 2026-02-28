package InnerClasses;

public class BankAccount {
    private double balance=10000;;
    class Transaction{
        void withdraw(double amount){
            if(amount<=balance) {
                balance -= amount;
                System.out.println("withdraw:" + amount);
            }else{
                System.out.println("Insufficient funds");
            }
        }
    }

    public static void main(String[] args) {
        BankAccount account=new BankAccount();
        BankAccount.Transaction tx=account.new Transaction();
        tx.withdraw(3000);
        tx.withdraw(2000);
        System.out.println("account.balance");
    }
}
/*
ℹ️points to remember
⭐transaction belongs to the specific account
⭐direct access to private variable balance
⭐clean encapsulation
 */
