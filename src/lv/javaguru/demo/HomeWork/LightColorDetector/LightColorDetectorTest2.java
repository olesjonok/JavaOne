package lv.javaguru.demo.HomeWork.LightColorDetector;

public class LightColorDetectorTest2 {
    public static void main(String[] args) {
        LightColorDetector2 colorDetector = new LightColorDetector2();
        System.out.println("Light Color (379) = " + colorDetector.detect(379));
        System.out.println("Light Color (380) = " + colorDetector.detect(380));

        System.out.println("Light Color (449) = " + colorDetector.detect(449));
        System.out.println("Light Color (450) = " + colorDetector.detect(450));

        System.out.println("Light Color (494) = " + colorDetector.detect(494));
        System.out.println("Light Color (495) = " + colorDetector.detect(495));

        System.out.println("Light Color (569) = " + colorDetector.detect(569));
        System.out.println("Light Color (570) = " + colorDetector.detect(570));

        System.out.println("Light Color (589) = " + colorDetector.detect(589));
        System.out.println("Light Color (590) = " + colorDetector.detect(590));

        System.out.println("Light Color (619) = " + colorDetector.detect(619));
        System.out.println("Light Color (620) = " + colorDetector.detect(620));

        System.out.println("Light Color (750) = " + colorDetector.detect(750));
        System.out.println("Light Color (751) = " + colorDetector.detect(751));
    }
}
