package org.efrei.start.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String pseudo;

    @OneToMany
    private List<Movie> see;

    public String getId() {
        return id;
    }

    public String getPseudo() {
        return pseudo;
    }

    public List<Movie> getSee() {
        return see;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public void setSee(List<Movie> see) {
        this.see = see;
    }
}
