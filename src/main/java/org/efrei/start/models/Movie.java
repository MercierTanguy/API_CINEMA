package org.efrei.start.models;

import jakarta.persistence.*;
import org.efrei.start.global.Category;


@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;


    private String title;

    @Enumerated(EnumType.STRING)
    private Category category;

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }


    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
