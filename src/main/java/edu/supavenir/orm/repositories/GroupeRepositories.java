package edu.supavenir.orm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.supavenir.orm.models.Groupe;

@Repository
public interface GroupeRepositories extends JpaRepository<Groupe, Integer> {

}
