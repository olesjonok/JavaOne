package lv.javaguru.demo.HomeWork;

public class EncoderDemo {
    public static void main(String[] args) {
        Encoder encoder = new Encoder();
        char symbol = encoder.encode((short) 65);
        short number = encoder.decode('X');

        System.out.println(symbol);
        System.out.println(number);
    }
}
