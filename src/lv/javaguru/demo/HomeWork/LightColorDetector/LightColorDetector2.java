package lv.javaguru.demo.HomeWork.LightColorDetector;

public class LightColorDetector2 {

    public String detect(int wavelength) {

        if ((wavelength >= 380) && (wavelength <= 449)) {
            return "Violet";
        }
        if ((wavelength >= 450) && (wavelength <= 494)) {
            return "Blue";
        }
        if ((wavelength >= 495) && (wavelength <= 569)) {
            return "Green";
        }
        if ((wavelength >= 570) && (wavelength <= 589)) {
            return "Yellow";
        }
        if ((wavelength >= 590) && (wavelength <= 619)) {
            return "Orange";
        }
        if ((wavelength >= 620) && (wavelength <= 750)) {
            return "Red";
        }
        return "Invisible Light";
    }
}
