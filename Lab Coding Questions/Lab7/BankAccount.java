public class BankAccount {
	
	protected static final double PENALTY_PERCENTAGE = 10.0;
	protected static final double MIN_BALANCE = 1000.00; 
	protected double balance;
	
	public BankAccount(double balance) {
		this.balance = balance;
	}
	
	protected boolean checkBalance() {
		if(balance>=MIN_BALANCE) {
			return true;
		}
		else {
			deduct();
			return false;
		}
	}
	
	public double getBalance() {
		return Math.round(balance * 100.0) / 100.0;
	}
	
	protected void deduct() {
		balance = balance*(100-PENALTY_PERCENTAGE)/100;
	}
}
class SavingsAccount extends BankAccount{
	
	public SavingsAccount(double balance) {
		super(balance);
	}
}

class CurrentAccount extends BankAccount {
	
	protected static final double ADDITIONAL_PENALTY_PERCENTAGE = 5.0;
	
	public CurrentAccount(double balance) {
		super(balance);
	}

	protected void deduct() {
		super.deduct();
		balance = balance*(100-ADDITIONAL_PENALTY_PERCENTAGE)/100;
	}
}
