package lv.javaguru.demo.HomeWork.SignComparator;


public class SignComparator {
    public int number;

    public String compare(int number) {

        this.number = number;

        if (this.number > 0) {
            System.out.println("Number is positive");
        } else if (this.number == 0) {
            System.out.println("Number is equal to zero");
        } else if (this.number < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is valid");
        }
        return null;
    }
}
