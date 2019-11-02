package lv.javaguru.demo.HomeWork;

public class StockTest2 {
    public static void main(String[] args) {
        Stock2 stock2Information = new Stock2("GOOG", 10);
        stock2Information.printInformation();

        stock2Information.updatePrice(15);
        stock2Information.updatePrice(7);
        stock2Information.updatePrice(14);

        stock2Information.printInformation();
    }
}
