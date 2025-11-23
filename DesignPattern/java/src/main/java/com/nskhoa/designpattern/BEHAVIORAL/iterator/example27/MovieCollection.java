package com.nskhoa.designpattern.BEHAVIORAL.iterator.example27;

public class MovieCollection {
    private final Movie[] movies = new Movie[10];
    private int count = 0;

    void addMovie(Movie movie) { if (count < movies.length) movies[count++] = movie; }

    MyIterator<Movie> createIterator() { return new MovieIterator(); }

    private class MovieIterator implements MyIterator<Movie> {
        int index = 0;
        public boolean hasNext() { return index < count; }
        public Movie next() { return movies[index++]; }
    }
}
