package edu.supavenir.orm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.supavenir.orm.models.User;

public interface UserRepositoriese extends JpaRepository<User, Integer> {

}
