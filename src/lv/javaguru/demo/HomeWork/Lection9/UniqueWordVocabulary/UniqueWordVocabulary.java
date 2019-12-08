package lv.javaguru.demo.HomeWork.Lection9.UniqueWordVocabulary;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class UniqueWordVocabulary {
    Set<String> words = new HashSet<String>();
    String word;

    public void addWord(String word) {
        if (word == null || word.isEmpty() || word == " ") {
            System.out.println("Collection has empty value!!!!");
            words.remove(word);
        } else {
            this.word = word;
            words.add(word);
        }
    }

    public int getWordsCount() {
        System.out.println("HashSet contains " + words.size() + " elements");
        return words.size();
    }

    public void printVocabulary() {
        System.out.println("words: ");
        Iterator<String> i = words.iterator();                  // 1 variant
        while (i.hasNext())
            System.out.println(i.next());
//        words.forEach((e) -> { System.out.println(e); });    // 2 variant
//        for (String word : words) {                          // 3 variant
//            System.out.println(word);
//        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UniqueWordVocabulary that = (UniqueWordVocabulary) o;
        return Objects.equals(words, that.words);
    }

    @Override
    public int hashCode() {
        return Objects.hash(words);
    }

    @Override
    public String toString() {
        return "UniqueWordVocabulary{" +
                "words=" + words +
                '}';
    }
}
