/*
 * Suppose that you are provided with a pre-written class BankAccount as shown below. (The
 * headings are shown, but not the method bodies, to save space.) Assume that the fields,
 * constructor, and methods shown are already implemented. You may refer to them or use them in
 * solving this problem if necessary.
 * 
 * Write a method named transactionFee that will be placed inside the BankAccount class to
 * become a part of each BankAccount object's behavior. The transactionFee method accepts a
 * fee amount (a real number) as a parameter, and applies that fee to the user's past transactions.
 * The fee is applied once for the first transaction, twice for the second transaction, three times for
 * the third, and so on. These fees are subtracted out from the user's overall balance. If the user's
 * balance is large enough to afford all of the fees with greater than $0.00 remaining, the method
 * returns true. If the balance cannot afford all of the fees or has no money left, the balance is left
 * as 0.0 and the method returns false.
 * 
 * For example, given the following BankAccount object:
 * The account at that point has a balance of $140.00. If the following call were made:
 * Then the account would be deducted $5 + $10 + $15 + $20 for the four transactions, leaving a
 * final balance of $90.00. The method would return true. If a second call were made,
 * Then the account would be deducted $10 + $20 + $30 + $40 for the four transactions, leaving a
 * final balance of $0.00. The method would return false.
 */

package SmallProblems8A__2_23;

// A BankAccount keeps track of a user's money balance and ID,
// and counts how many transactions (deposits/withdrawals) are made.
public class BankAccount {
    private String id;
    private double balance;
    private int transactions;
    
    // Constructs a BankAccount object with the given id, and
    // 0 balance and transactions.
    public BankAccount(String id)
    
    // returns the field values
    public double getBalance()
    public String getID()
    public String getTransactions()
    
    // Adds the amount to the balance if it is between 0-500.
    // Also counts as 1 transaction.
    public void deposit(double amount)
 
    // Subtracts the amount from the balance if the user has enough money.
    // Also counts as 1 transaction.
    public void withdraw(double amount)
    
    /*
     * The transactionFee method accepts a fee amount (a real number) as a parameter, and applies 
     * that fee to the user's past transactions. The fee is applied once for the first transaction, 
     * twice for the second transaction, three times for the third, and so on. These fees are 
     * subtracted out from the user's overall balance. If the user's balance is large enough to 
     * afford all of the fees with greater than $0.00 remaining, the method returns true. If the 
     * balance cannot afford all of the fees or has no money left, the balance is left as 0.0 and the 
     * method returns false.
     */
    public boolean transactionFee(double fee) {
        double totalFee = 0;
        for (int i = 1; i <= transactions; i++) {
            totalFee += fee * i;
        }

        if (balance - totalFee > 0.00) {
            balance -= totalFee; // Deduct the total fee from the balance
            return true;
        } else {
            balance = 0.0; // Set the balance to 0.0 if the fees cannot be fully covered
            return false;
        }
    }
}