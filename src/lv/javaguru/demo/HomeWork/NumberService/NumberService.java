package lv.javaguru.demo.HomeWork.NumberService;

public class NumberService {

    public int rangeSum(int start, int finish) {
        int sum = 0;
        if (start <= finish) {
            for (int i = start; i <= finish; i++) {
                sum = sum + i;
            }
        } else {
            for (int i = start; i >= finish; i--) {
                sum = (sum + i);
            }
        }
        System.out.println(sum);

        return sum;
    }

    public int rangeEvenCount(int start, int finish) {
        int counter = 0;
        if (start <= finish) {
            for (int i = start; i <= finish; i++) {
                if (i % 2 == 0) {
                    counter++;
                }
            }
        } else {
            for (int i = start; i >= finish; i--) {
                if (i % 2 == 0) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
        return counter;
    }

}
