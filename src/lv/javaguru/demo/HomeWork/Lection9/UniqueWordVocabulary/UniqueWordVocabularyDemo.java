package lv.javaguru.demo.HomeWork.Lection9.UniqueWordVocabulary;

public class UniqueWordVocabularyDemo {
    public static void main(String[] args) {
        UniqueWordVocabulary newWord = new UniqueWordVocabulary();
        System.out.println(newWord);

        newWord.addWord("Apple");
        newWord.addWord("Mango");
        newWord.addWord("Pineapple");
        newWord.addWord("Watermelon");
        newWord.addWord("Pineapple");
        newWord.addWord(" ");
        newWord.addWord("");

        newWord.getWordsCount();
        newWord.printVocabulary();
    }
}
