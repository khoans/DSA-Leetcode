package com.nskhoa.designpattern.BEHAVIORAL.iterator.example27;

public class MovieCollectionDemo {
    public static void main(String[] args) {
        MovieCollection movies = new MovieCollection();
        movies.addMovie(new Movie("Inception", "Christopher Nolan"));
        movies.addMovie(new Movie("The Matrix", "The Wachowskis"));

        MyIterator<Movie> it = movies.createIterator();
        while (it.hasNext()) {
            Movie m = it.next();
            System.out.println(m.getTitle() + " by " + m.getDirector());
        }
    }
}

