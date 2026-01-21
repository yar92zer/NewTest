package org.example.newtest.CodeRetreat.Cinema;

class Movie {
    protected String title;
    protected int duration;
    private static int totalMovies = 0;

    public Movie(String title, int duration) {
        if (title == null || title.isEmpty()) throw new IllegalArgumentException("Title empty");
        if (duration <= 0) throw new IllegalArgumentException("Duration invalid");
        this.title = title;
        this.duration = duration;
        totalMovies++;
    }

    public static int getTotal() {
        return totalMovies;
    }

    @Override
    public String toString() {
        return title + " (" + duration + " min)";
    }
}