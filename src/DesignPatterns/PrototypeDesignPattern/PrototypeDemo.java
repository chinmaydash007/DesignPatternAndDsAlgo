package DesignPatterns.PrototypeDesignPattern;

public class PrototypeDemo {
    public static void main(String[] args) {
        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItem(ItemType.MOVIE);
        movie.setTitle("Creational Pattern in Java");


        System.out.println(movie);
        System.out.println(movie.getRunTime());
        System.out.println(movie.getTitle());
        System.out.println(movie.getUrl());

        Movie anotherMovie = (Movie) registry.createItem(ItemType.MOVIE);
        anotherMovie.setTitle("Gang of Four");

        System.out.println(anotherMovie);
        System.out.println(anotherMovie.getRunTime());
        System.out.println(anotherMovie.getTitle());
        System.out.println(anotherMovie.getUrl());

    }
}
