/**
 * This class represents a single purchase event of a stock and given amount.
 *
 * @author Lucas D. Dahl
 * @version 8/13/2020
 *
 */
public class StockObject {

    // **************************** Fields ****************************
    private int amountOfStock;
    private double transactionPrice;
    private String symbol;

    // ************************** Constructors *************************

    /**
     *This constructor sets up a single stock transaction. If the stock is less than zero, it will default to zero.
     *
     * @param amount is the amount of stock on the floor.
     * @param price is the current price of the object.
     * @param symbol The stock symbol for the object.
     *
     * @throws IllegalArgumentException if symbol is less than one character or null.
     */
    public StockObject(int amount, double price, String symbol) {

        // Set the symbol
        if(symbol == null) throw new IllegalArgumentException();
        if (symbol.length() < 1) throw new IllegalArgumentException();

        this.symbol = symbol;

        // Set the price
        if(price >= 0) {
            transactionPrice = price;
        } else {
            transactionPrice = 0;
        } // Probably would be an exception.

        // Set the stock
        if(amount > 0) {
            amountOfStock = amount;
        } else {
            amountOfStock = 0;
        } // Probably would be an exception.

    }

    /**.
     *This constructor sets up a single stock transaction. If the stock is less than zero, it will default to zero.
     *
     * @param amount is the amount of stock on the floor.
     * @param price is the current price of the object.
     * @param symbol The stock symbol for the object.
     *
     * @throws IllegalArgumentException if symbol is less than one character or null.
     */
    public StockObject(String symbol, int amount, double price) {
        this(amount, price, symbol);
    }

    // **************************** Methods ****************************

    @Override
    public String toString() {
        return "You have " + amountOfStock + " shares of " + symbol + " at a price of $" + transactionPrice + ".";
    }

    /**
     * This method checks the incoming symbol, to the symbol on the current stock to see if they
     * are tge same, if so the current amount is multiplied by the incoming price to determine
     * the currentvalue, but if the symbols are different the return 0 as a value.
     *
     * @param price The current price of said stock
     * @param checkSymbol the name of the stock to compare.
     * @return 0 or the overall price depending on if the stock matches
     */
    public double getCurrentValue(double price, String checkSymbol) {

        // Check the symbols to get the total price
        if(checkSymbol.equals(symbol)) {
            return  price * amountOfStock;
        } else {
            return 0;
        }

    }

    /**
     * This method checks the incoming symbol, to the symbol on the current stock to see if they
     * are tge same, if so the current amount is multiplied by the incoming price abd then
     * subtract from the amount of the stock to get the net change.
     *
     * @param price The current price of said stock
     * @param checkSymbol the name of the stock to compare.
     * @return 0 or the overall price depending on if the stock matches
     */
    public double getNetChange(double price, String checkSymbol) {

        // Check the symbols to get the net price
        if(checkSymbol.equals(symbol)) {
            return  price * amountOfStock - amountOfStock * transactionPrice;
        } else {
            return 0;
        }

    }

    /**
     *  Return the amount spent on this transaction.
     * @return the amount of stock * the transaction price.
     */
    public double getInvestment() {
        return amountOfStock * transactionPrice;
    }

}
