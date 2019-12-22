package lv.javaguru.demo.HomeWork.NumberService;

public class Demo {
    public static void main(String[] args) {

        NumberService numbers = new NumberService();
        numbers.rangeEvenCount(10, 1); //5
        numbers.rangeEvenCount(1, 6); //3
        numbers.rangeSum(3,1); //6
        numbers.rangeSum(1,6); //21
    }
}
