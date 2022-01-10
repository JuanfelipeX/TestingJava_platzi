package com.platzi.javatest.movies.data;

import com.platzi.javatest.movies.model.Movie;

import java.util.Collection;

public interface MovieRepository { //el repositorio donde guardara las peliculas de la BD

    Movie findById(long id);
    Collection<Movie> findAll();
    void saveOrUpdate(Movie movie);

}
