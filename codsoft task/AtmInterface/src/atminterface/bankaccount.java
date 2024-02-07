package atminterface;

public class bankaccount {
	 private double balance;

	    public bankaccount(double balance) {
	        this.balance = balance;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void withdraw(double amount) {
	        balance -= amount;
	    }

	    public void deposit(double amount) {
	        balance += amount;
	    }
}
