package org.example.iterator;

import java.util.List;

/**
 * 书本实体类
 */
public class Book {
    private String name;

    private String author;

    private int price;

    public Book(String name, String author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    /**
     * 返回书本的迭代器
     * @param books
     * @return
     */
    public IBookIterator iterator(List<Book> books){
        return new BookIterator(books);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
