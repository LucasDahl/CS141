// This tests the StockObject ite,

public class StockObjectTest {

    public static void main(String[] args) {

//        StockObject x1 = new StockObject(10, 45, "AMD");
//        StockObject x2 = new StockObject(30, 60, "INT");
//
//        System.out.print(x1);
//        System.out.print(x2);

        StockObject[] myStocks = new StockObject[5];

        myStocks[0] = new StockObject("ABC", 5, 7.3);
        myStocks[1] = new StockObject("XYZ", 3, 7.9);
        myStocks[2] = new StockObject("DEFG", 10, 8.0);
        myStocks[3] = new StockObject("ZOO", 5, 7.3);
        myStocks[4] = new StockObject("ABC", 5, 8.5);

    }

}
