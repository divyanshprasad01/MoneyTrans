package in.badpanda.moneytrans;

public class Customers {
    String name;
    long currBalance;
    String accountNumber;

    public Customers(String name, long currBalance, String accountNumber) {
        this.name = name;
        this.currBalance = currBalance;
        this.accountNumber = "Account No.: "+accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

      public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCurrBalance() {
        return currBalance;
    }

    public void setCurrBalance(long currBalance) {
        this.currBalance = currBalance;
    }
}
