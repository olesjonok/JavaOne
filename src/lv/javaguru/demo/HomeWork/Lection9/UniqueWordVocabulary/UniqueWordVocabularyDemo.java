package lv.javaguru.demo.HomeWork.Lection9.UniqueWordVocabulary;

public class UniqueWordVocabularyDemo {
    public static void main(String[] args) {
        UniqueWordVocabulary newWord = new UniqueWordVocabulary();

        newWord.addWord("Apple");
        newWord.addWord("Mango");
        newWord.addWord("Pineapple");
        newWord.addWord("Watermelon");
        newWord.addWord("Pineapple");
        newWord.addWord(" ");
        newWord.addWord("");

        System.out.println(" ");
        newWord.getWordsCount();
        System.out.println(" ");
        newWord.printVocabulary();
    }
}
