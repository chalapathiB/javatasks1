public class BankAccount {
    Integer accNo;
    String cusName;
    String accType;
    float balance;
    public BankAccount(Integer AccNo, String cusName, String AccType, int intialBalance) {
        this.accNo = AccNo;
        this.cusName = cusName;
        this.accType = AccType;
        if (AccType.equalsIgnoreCase("savings")) {
            if (intialBalance > 1000) {
                this.balance = intialBalance;
            } else {
                throw new LowBalanceException();
            }
        } else if (AccType.equalsIgnoreCase("current")) {
            if (intialBalance > 5000) {
                this.balance = intialBalance;
            } else {
                throw new LowBalanceException();
            }
        }
    }
    public void deposit(float amt) {
        if (amt <= 0) {
            throw new NegativeAmountException();
        }
        balance = balance + amt;
        System.out.println(balance);
    }
    public void withdraw(float amt)
    {
        if (accType.equalsIgnoreCase("Savings"))
        {
            if(balance-amt<1000)
                throw new Insufficientfunds();
            else
            {
                balance=balance-amt;
                System.out.println("Collect Your cash " +amt);
                System.out.println("Remaining Balance:"+balance);
            }

        } else if (accType.equalsIgnoreCase("current"))
        {
            if (balance-amt<5000)
                throw new Insufficientfunds();
            else
            {
                balance=balance-amt;
                System.out.println("Collect Your cash " +amt);
                System.out.println("Remaining Balance:"+balance);
            }
        }
    }
    public float getBalance() {
        if (accType.equalsIgnoreCase("savings")) {
            if (balance < 1000) {
                throw new LowBalanceException();
            } else {
                return balance;
            }
        } else if (accType.equalsIgnoreCase("current")) {
            if (balance < 5000) {
                throw new LowBalanceException();
            } else {
                return balance;
            }
        }
        return 0;
    }
}
