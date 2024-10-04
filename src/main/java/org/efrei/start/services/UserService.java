package org.efrei.start.services;


import org.efrei.start.dto.CreateUser;

import org.efrei.start.models.Movie;
import org.efrei.start.models.User;

import org.efrei.start.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repository;
    private final MovieService movieService;

    @Autowired
    public UserService(UserRepository repository,MovieService movieService){
        this.repository=repository;
        this.movieService=movieService;
    }

    public List<User> findAll(){
        return (List<User>) repository.findAll();
    }

    public User findById(String id){
        return repository.findById(id).orElse(null);
    }

    public void create(CreateUser createUser){
        User user=new User();
        List<Movie> movies = movieService.findAllByI(createUser.getIdMovie());
        user.setPseudo(createUser.getPseudo());

        // SUPPRIME LES AUTRES VALEURS , A MODIFIER POUR SAUVEGARDER LE TOUT
        user.setSee(movies);
        repository.save(user);
    }

    public void deleteById(String id){
        repository.deleteById(id);
    }

    public void updateMovie(String id, User user){
        User updateUser=findById(id);
        updateUser.setPseudo(user.getPseudo());
        repository.save(updateUser);
    }

}
