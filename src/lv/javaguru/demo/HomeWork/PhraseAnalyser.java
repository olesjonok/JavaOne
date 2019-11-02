package lv.javaguru.demo.HomeWork;

public class PhraseAnalyser {
    public String text;

    public String analyse(String text) {
        if ((text.startsWith("Make")) && (text.endsWith("great again."))) {
            return "It stands no chance";
        }
        if ((text.startsWith("Make")) || (text.endsWith("great again."))) {
            return "It could be worse";
        } else {
            return "It is fine, really";
        }
    }
}
