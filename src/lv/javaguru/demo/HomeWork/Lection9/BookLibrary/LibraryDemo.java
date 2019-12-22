package lv.javaguru.demo.HomeWork.Lection9.BookLibrary;

import java.util.LinkedList;
import java.util.List;

public class LibraryDemo {
    public static void main(String[] args) {
        Book book = new Book();
        Library library = new Library();
        List<Book> list = new LinkedList<Book>();
        list.add(library.bookOne);
        list.add(library.bookTwo);

        System.out.println(list);
//        library.findByName("War and Peace"); //Should return bookOne
//        library.findByAuthor("Leo Tolstoy"); //Should return bookOne, bookTwo
//
//        library.remove(library.bookTwo);
//        public void addBook () {
//            list.add(book);
//        }
    }
}

