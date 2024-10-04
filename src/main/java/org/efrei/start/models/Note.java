package org.efrei.start.models;

import jakarta.persistence.*;

@Entity
@Table(name = "notes")
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String details;

    @OneToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

    public void setId(String id) {
        this.id = id;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Movie getMovie() {
        return movie;
    }

    public String getId() {
        return id;
    }

    public String getDetails() {
        return details;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
