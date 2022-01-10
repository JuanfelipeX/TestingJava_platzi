package com.platzi.javatest.movies.model;

public class Movie {

    private Integer id;
    private String name;
    private int minutes;
    private Genre genre;

    public Movie(Integer id, String name, int minutes, Genre genre) {
        this.id = id;
        this.name = name;
        this.minutes = minutes;
        this.genre = genre;
    }

    public Movie(String name, int minutes, Genre genre) {
        this(null, name, minutes, genre); //esto se hace para llamar el otro costructor, y se usa para cuando no se llama al id indica un id nulo
    }

}
