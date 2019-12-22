package lv.javaguru.demo.HomeWork.PhaseAnalyser;

public class PhraseAnalyserTest {
    public static void main(String[] args) {
        PhraseAnalyser phraseAnalyser = new PhraseAnalyser();
        System.out.println("Make America great again. - " + phraseAnalyser.analyse("Make America great again."));
        System.out.println("Make it again. - " + phraseAnalyser.analyse("Make it again."));
        System.out.println("Trump make America great again. - " + phraseAnalyser.analyse("Trump make America great again."));
        System.out.println("Great again or big failure? - " + phraseAnalyser.analyse("Great again or big failure?"));

    }
}
