package com.platzi.javatest.movies.service;

import com.platzi.javatest.movies.data.MovieRepository;
import com.platzi.javatest.movies.model.Genre;
import com.platzi.javatest.movies.model.Movie;
import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static com.platzi.javatest.movies.model.Genre.*;
import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.junit.Assert.*;

public class MovieServiceTest {


    @InjectMocks
    MovieService movieService;

    @Mock
    MovieRepository movieRepository;


    @Before
    public void setUp() throws Exception {
        MovieRepository movieRepository = Mockito.mock(MovieRepository.class);
        Mockito.when(movieRepository.findAll()).thenReturn(Arrays.asList(
                new Movie(1, "Dark Knight", 152, ACTION),
                new Movie(2, "Memento", 113, THRILLER),
                new Movie(3, "There's Something About Mary", 119, COMEDY),
                new Movie(4, "Super 8", 112, THRILLER),
                new Movie(5, "Scream", 111, HORROR),
                new Movie(6, "Home Alone", 103, COMEDY),
                new Movie(7, "Matrix", 136, ACTION)
        ));

         movieService = new MovieService(movieRepository);
    }

    @Test
    public void return_movie_by_genre() {

        Collection<Movie> movies = movieService.findMovieByGenre(Genre.COMEDY);
        assertThat(getMoviesIds(movies), CoreMatchers.is(Arrays.asList(3,6)));
    }

    @Test
    public void return_movie_by_length() {

        Collection<Movie> movies = movieService.findMovieByLength(120);
        assertThat(getMoviesIds(movies), CoreMatchers.is(Arrays.asList(2,3,4,5,6)));
    }

    @Test
    public void return_movie_by_name_or_keyword()
    {
        Collection<Movie> movies = movieService.findMovieByName("Super 8");

        assertThat(getMoviesIds(movies), CoreMatchers.is(Arrays.asList(4)));
    }

    private List<Integer> getMoviesIds(Collection<Movie> movies) {
         return movies.stream().map(Movie::getId).collect(Collectors.toList());
    }
}