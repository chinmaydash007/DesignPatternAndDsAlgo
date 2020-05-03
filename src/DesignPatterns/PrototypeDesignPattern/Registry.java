package DesignPatterns.PrototypeDesignPattern;

import java.util.*;

public class Registry {
    private Map<String, Item> items = new HashMap();

    public Registry() {
        loadItems();
    }

    public Item createItem(ItemType itemType) {
        Item item = null;

        try {
            item = (Item) (items.get(itemType.toString())).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return item;
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("Basic Movie");
        movie.setPrice(24.99);
        movie.setRunTime("2 hours");
        items.put(ItemType.MOVIE.toString(), movie);

        Book book = new Book();
        book.setNumberOfPages(335);
        book.setPrice(19.99);
        book.setTitle("Basic Book");
        items.put(ItemType.BOOK.toString(), book);

    }

}
