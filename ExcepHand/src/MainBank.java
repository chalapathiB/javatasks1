public class MainBank
{
    public static void main(String[] args)
    {
        BankAccount b=new BankAccount(123456789,"Chalapathi","Savings",40000);
        b.deposit(2000);
        b.withdraw(700);
        b.getBalance();
    }
}