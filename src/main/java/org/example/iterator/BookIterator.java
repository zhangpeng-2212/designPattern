package org.example.iterator;


import java.util.List;

/**
 * 书本迭代器
 */
public class BookIterator implements  IBookIterator{

    private List<Book> bookList;

    private int index;

    public BookIterator(List<Book> bookList) {
        index=0;
        this.bookList = bookList;
    }

    @Override
    public boolean hasNext() {
        return index>=bookList.size()?false:true;
    }

    @Override
    public Book next() {
        if(this.hasNext()){
            return  bookList.get(index++);
        }
        return null;
    }


}
