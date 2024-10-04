package org.efrei.start.dto;

import java.util.List;

public class CreateUser {

    private String pseudo;
    private List<String> idMovie;


    public String getPseudo() {
        return pseudo;
    }



    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public List<String> getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(List<String> idMovie) {
        this.idMovie = idMovie;
    }
}
