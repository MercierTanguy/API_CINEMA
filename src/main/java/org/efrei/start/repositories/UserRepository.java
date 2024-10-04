package org.efrei.start.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.efrei.start.models.User;

public interface UserRepository extends JpaRepository<User, String> {

}
