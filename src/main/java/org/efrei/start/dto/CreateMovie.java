package org.efrei.start.dto;

import org.efrei.start.global.Category;
import org.efrei.start.models.Actor;

public class CreateMovie
{
    private String title;
    private Category category;
    private Actor actor;

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public String getTitle() {
        return title;
    }

    public Category getCategory() {
        return category;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
