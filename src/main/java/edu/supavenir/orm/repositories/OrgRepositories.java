package edu.supavenir.orm.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.supavenir.orm.models.Organization;

@Repository
public interface OrgRepositories extends JpaRepository<Organization, Integer> {
    List<Organization> findByDomain(String domain);

    List<Organization> findByName(String name);
}