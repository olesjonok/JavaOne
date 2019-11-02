package lv.javaguru.demo.HomeWork;

public class LightColorDetectorTest2 {
    public static void main(String[] args) {
        LightColorDetector2 colorDetector = new LightColorDetector2();
        System.out.println("Light Color (360) = " + colorDetector.detect(360));
        System.out.println("Light Color (400) = " + colorDetector.detect(400));
        System.out.println("Light Color (460) = " + colorDetector.detect(460));
        System.out.println("Light Color (500) = " + colorDetector.detect(500));
        System.out.println("Light Color (580) = " + colorDetector.detect(580));
        System.out.println("Light Color (600) = " + colorDetector.detect(600));
        System.out.println("Light Color (630) = " + colorDetector.detect(630));
        System.out.println("Light Color (770) = " + colorDetector.detect(770));
    }
}
