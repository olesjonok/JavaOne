package lv.javaguru.demo.HomeWork.Lection9.UniqueWordVocabulary;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordVocabularyTest {
    public static void main(String[] args) {
        UniqueWordVocabulary uniqueWordVocabulary = new UniqueWordVocabulary();
        Set<String> words = uniqueWordVocabulary.words;
        Set<String> words2 = new HashSet<>();

        words2.add("Apple");
        words2.add("Mango");
        words2.add("Pineapple");
        words2.add("Watermelon");
        words2.add("Pineapple");

        System.out.println("Does set 1 contains set 2: "
                + words.containsAll(words2));
    }
}
