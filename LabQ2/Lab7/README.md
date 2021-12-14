Give code for the classes BankAccount (public) ,  SavingsAccount (package) and CurrentAccount (package) representing bank accounts. The SavingsAccount and CurrentAccount are two child classes of BankAccount. All of them have a constructor taking one parameter of double type that sets the balance amount in the bank account. Methods: 
BankAccount:   protected boolean checkBalance() that checks and returns if the balance is greater than or equal 1000 Rs. If it isn’t it will call the method protected void deduct() that deducts 10% of the current balance as penalty.  public double getBalance() that returns the balance (Rounded to 2 decimal places).
 SavingsAccount follows the same deduction policy. 
CurrentAccount deducts an additional 5% from the already deducted balance if the balance before deductions was less than 1000.
Javadoc is given.
Example:
b1: SavingsAccount (balance = 999)
b2: CurrentAccount (balance = 999)

On calling checkBalance() on both methods.
b1.balance = 899.10
b2.balance = 854.15

Explanation:
b1: 999*0.9 = 899.10
b2: 999*0.9 = 899.1 -> 899.1*0.95 = 854.15