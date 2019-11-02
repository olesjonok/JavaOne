package lv.javaguru.demo.HomeWork.Tv;

public class TvTest {
    public static void main(String[] args) {
        Tv tv = new Tv("n", 5, 6);
        System.out.println(tv);
        tv.increaseChannel();
        int a = tv.getChannel();
        System.out.println(tv);
    }

}

