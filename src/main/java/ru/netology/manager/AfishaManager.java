package ru.netology.manager;

import ru.netology.domain.MovieItem;
import ru.netology.repository.AfishaRepository;

public class AfishaManager {
    private MovieItem[] items = new MovieItem[0];


    public int getNumberOfMovies() {
        return numberOfMovies;
    }

    public void setNumberOfMovies(int numberOfMovies) {
        this.numberOfMovies = numberOfMovies;
    }

    private int numberOfMovies = 10;
    private AfishaRepository repository;


    public AfishaManager(AfishaRepository repository)
    {this.repository = repository;};


        public void add(MovieItem item) {
            repository.save(item);
    }

    public MovieItem[] getAll() {
        MovieItem [] items = repository.findAll();
        MovieItem[] result = new MovieItem[items.length];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;

    }
    public void removeById (int id) {
         repository.removeById(id);
    }

    public MovieItem[] getAmountOfMovies() {
        MovieItem[] result = new MovieItem[getNumberOfMovies()];
        MovieItem[] tmp = getAll();
        if (numberOfMovies > numberOfMovies) {
            this.numberOfMovies = numberOfMovies;
        }
        System.arraycopy(tmp, 0, result, 0, numberOfMovies);
        return result;
    }



}

