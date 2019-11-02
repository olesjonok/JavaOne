package lv.javaguru.demo.HomeWork.ColorDetector;

public class LightColorDetector {

    public String detect(int inputNumberOfLight) {
        if ((inputNumberOfLight >= 380) && (inputNumberOfLight <= 449)) {
            return "Violet";
        }
        if ((inputNumberOfLight >= 450) && (inputNumberOfLight <= 494)) {
            return "Blue";
        }
        if ((inputNumberOfLight >= 495) && (inputNumberOfLight <= 569)) {
            return "Green";
        }
        if ((inputNumberOfLight >= 570) && (inputNumberOfLight <= 589)) {
            return "Yellow";
        }
        if ((inputNumberOfLight >= 590) && (inputNumberOfLight <= 619)) {
            return "Orange";
        }
        if ((inputNumberOfLight >= 620) && (inputNumberOfLight <= 750)) {
            return "Red";
        }
        return "Invisible Light";
    }
}
