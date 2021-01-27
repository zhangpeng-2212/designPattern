package org.example.iterator;


import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        Book book1 = new Book("java书籍", "tom", 50);
        Book book2 = new Book("C#书籍", "jack", 60);
        Book book3 = new Book("python书籍", "mic", 70);

        List<Book> bookList = new ArrayList<>(3);
        bookList.add(book3);
        bookList.add(book2);
        bookList.add(book1);

        //使用迭代器进行迭代
        IBookIterator iterator = book1.iterator(bookList);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}
