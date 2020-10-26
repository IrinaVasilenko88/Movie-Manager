package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieItem;
import ru.netology.manager.PosterManager;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PosterManagerTest {
    private PosterManager manager = new PosterManager();
    private MovieItem first = new MovieItem(1, 1, "first", "comedy", 10);
    private MovieItem second = new MovieItem(2, 2, "second", "cartoon", 11);
    private MovieItem third = new MovieItem(3, 3, "third", "thriller", 12);
    private MovieItem fourth = new MovieItem(4, 4, "fourth", "horror", 13);
    private MovieItem fifth = new MovieItem(5, 5, "fifth", "drama", 14);
    private MovieItem sixth = new MovieItem(6, 6, "sixth", "musical", 15);
    private MovieItem seventh = new MovieItem(7, 7, "seventh", "science-fiction", 16);
    private MovieItem eighth = new MovieItem(8, 8, "eighth", "biography", 17);
    private MovieItem ninth = new MovieItem(9, 9, "ninth", "mystery", 18);
    private MovieItem tenth = new MovieItem(10, 10, "tenth", "documentary", 19);

    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
    }

    @Test
    public void shouldGetAllMoviesInOrder() {
        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetMoviesLessThanTen() {
        PosterManager manager = new PosterManager();
        MovieItem first = new MovieItem(1, 1, "first", "comedy", 10);
        MovieItem second = new MovieItem(2, 2, "second", "cartoon", 11);
        MovieItem third = new MovieItem(3, 3, "third", "thriller", 12);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[]{third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetMoviesTen() {
        PosterManager manager = new PosterManager();
        MovieItem first = new MovieItem(1, 1, "first", "comedy", 10);
        MovieItem second = new MovieItem(2, 2, "second", "cartoon", 11);
        MovieItem third = new MovieItem(3, 3, "third", "thriller", 12);
        MovieItem fourth = new MovieItem(4, 4, "fourth", "horror", 13);
        MovieItem fifth = new MovieItem(5, 5, "fifth", "drama", 14);
        MovieItem sixth = new MovieItem(6, 6, "sixth", "musical", 15);
        MovieItem seventh = new MovieItem(7, 7, "seventh", "science-fiction", 16);
        MovieItem eighth = new MovieItem(8, 8, "eighth", "biography", 17);
        MovieItem ninth = new MovieItem(9, 9, "ninth", "mystery", 18);
        MovieItem tenth = new MovieItem(10, 10, "tenth", "documentary", 19);
        MovieItem eleventh = new MovieItem(11, 11, "eleventh", "documentary", 20);

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        MovieItem[] actual = manager.getAmountOfMovies();
        MovieItem[] expected = new MovieItem[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        assertArrayEquals(expected, actual);

    }
}
