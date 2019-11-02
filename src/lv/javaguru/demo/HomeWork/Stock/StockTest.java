package lv.javaguru.demo.HomeWork.Stock;

public class StockTest {
    public static void main(String[] args) {
        StockTest checkTests = new StockTest();
        checkTests.test0();
        checkTests.test1();
        checkTests.test2();
        checkTests.test3();
    }

    public void test0() {
        Stock stock = new Stock("GOOG", 10);
        stock.printInformation();
    }

    public void test1() {
        Stock stock = new Stock("GOOG", 10);
        stock.updatePrice(15);
        stock.printInformation();
    }

    public void test2() {
        Stock stock = new Stock("GOOG", 10);
        stock.updatePrice(15);
        stock.updatePrice(7);
        stock.printInformation();
    }

    public void test3() {
        Stock stock = new Stock("GOOG", 10);
        stock.updatePrice(15);
        stock.updatePrice(7);
        stock.updatePrice(14);
        stock.printInformation();
    }
}
