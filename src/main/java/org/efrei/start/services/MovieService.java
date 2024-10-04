package org.efrei.start.services;

import org.efrei.start.dto.CreateMovie;
import org.efrei.start.models.Movie;
import org.efrei.start.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    private final MovieRepository repository;

    @Autowired
    public MovieService(MovieRepository repository){
        this.repository=repository;
    }


    public List<Movie> findAll(){
        return (List<Movie>) repository.findAll();
    }

    public Movie findById(String id){
        return repository.findById(id).orElse(null);
    }

    public List<Movie> findAllByI(List<String> ids) {
        return repository.findAllById(ids);
    }

    public void create(CreateMovie createMovie){
        Movie movie=new Movie();
        movie.setTitle(createMovie.getTitle());
        movie.setCategory(createMovie.getCategory());
        repository.save(movie);
    }

    public void deleteById(String id){
        repository.deleteById(id);
    }

    public void updateMovie(String id, Movie movie){
        Movie updateMovie=findById(id);
        updateMovie.setTitle((movie.getTitle()));
        updateMovie.setCategory(movie.getCategory());
        repository.save(updateMovie);
    }
}
