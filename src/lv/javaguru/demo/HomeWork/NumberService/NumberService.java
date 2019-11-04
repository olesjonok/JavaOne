package lv.javaguru.demo.HomeWork.NumberService;

public class NumberService {
    private int counter = 0;
    private int sum = 0;

    public NumberService() {
        this.counter = counter;
        this.sum = sum;
    }

    public int rangeSum(int start, int finish) {
        sum = 0;
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
        counter = 0;
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


    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

}
