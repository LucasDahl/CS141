/**
 * This class will create a BankAccount object that holds a user ID, user Name, and user balance.
 * The balance if overdrawn will default to zero(no negative balances).
 *
 * @author Lucas D. Dahl
 * @version 8/14/20
 */
public class BankAccount {

    // **************************** Fields ****************************
    private int iD;
    private String name;
    private double balance;

    // ************************** Constructors *************************

    /**
     * This constructor sets all of the fields of teh BankAccount
     * object when being initialized.
     *
     * @param userID This sets the BankAccount ID
     * @param userBalance This is the BankAccounts starting balance
     * @param userName This is the name of BankAccount's owner
     */
    public BankAccount(int userID, double userBalance, String userName) {
        iD = userID;
        balance = userBalance;
        name = userName;
    }

    /**
     * This constructor will set the fields for the the BankAccount
     * object with out being set initially.
     */
    public BankAccount() {
        iD = 0;
        balance = 0;
        name = "Unknown";
    }

    // **************************** Methods ****************************

    @Override
    public String toString() {
        return name + "[" + iD + "]" + " = $" + balance;
    }

    /**
     * This method shows the user the name of the BankAccount.
     *
     * @return Returns the name of the BankAccount
     */
    public String getName() {
        return name;
    }

    /**
     * This method shows the user the ID of the BankAccount.
     *
     * @return Returns the ID of the BankAccount
     */
    public int getID() {
        return iD;
    }

    /**
     * This method shows the user the balance of the BankAccount.
     *
     * @return Returns the balance of the BankAccount
     */
    public double getBalance(){
        return balance;
    }

    /**
     * This method allows for the name field of the bank account to
     * be updated based on the parameter "name".
     *
     * @param name uses the provided name to change the name field.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method allows for the balance field of the bank account to
     * be updated based on the parameter "x".
     *
     * @param x takes in a double x to update the balance of the BankAccount.
     */
    public void changeBalance(double x) {

        balance += x;

        // Make sure the account does not go negative.
        if(balance < 0) {

            balance = 0;

        }

    }
}
