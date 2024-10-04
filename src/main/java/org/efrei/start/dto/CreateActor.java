package org.efrei.start.dto;

public class CreateActor {

    private String firstname;
    private String name;
    private String movieId;


    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getMovieId() {
        return movieId;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getName() {
        return name;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setName(String name) {
        this.name = name;
    }
}
