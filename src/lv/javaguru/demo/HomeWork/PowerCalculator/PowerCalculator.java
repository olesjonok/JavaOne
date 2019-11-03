package lv.javaguru.demo.HomeWork.PowerCalculator;


public class PowerCalculator {

    public int pow(int number, int power) {
        int result = 1;

        if (number >= 0) {
            for (int a = 1; a <= power; a++) {
                result = result * number;
            }
            System.out.println(result);
        } else {
            System.out.println("number < 0, it's wrong number");
        }
        return result;
    }

}
