package org.efrei.start.dto;


public class CreateNote {
    private String details;

    private String movieId;

    public void setDetails(String details) {
        this.details = details;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getDetails() {
        return details;
    }

    public String getMovieId() {
        return movieId;
    }

}
