package org.efrei.start.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.efrei.start.models.Movie;

public interface MovieRepository extends JpaRepository<Movie, String> {

}
