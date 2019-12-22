package lv.javaguru.demo.HomeWork.Lection9.UniqueWordVocabulary;

public class UniqueWordVocabularyDemo {
    public static void main(String[] args) {
        UniqueWordVocabulary1 newWord = new UniqueWordVocabulary1();

        newWord.addWord("Apple");
        newWord.addWord("Mango");
        newWord.addWord("Pineapple");
        newWord.addWord("Watermelon");
        newWord.addWord("Pineapple");
        newWord.addWord(" ");
        newWord.addWord("");

        System.out.println(" ");
        System.out.println("HashSet contains " + newWord.getWordsCount() + " elements");
        System.out.println(" ");
        newWord.printVocabulary();
    }
}
