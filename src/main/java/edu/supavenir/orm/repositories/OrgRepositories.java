package edu.supavenir.orm.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.supavenir.orm.models.Organization;

@Repository
public interface OrgRepositories extends JpaRepository<Organization, Integer> {
    Optional<Organization> findByDomain(String domain);

    Optional<Organization> findByName(String name);

    public Integer deleteByName(String name);

    public List<Organization> findByNameContainingOrDomainContainingOrAliasesContainingIgnoreCase(String name,
	    String domain, String aliases);

    @Query("select o from Organization o where lower(o.name) like lower(concat('%',?1,'%')) or lower(o.domain) like lower(concat('%',?1,'%')) or lower(o.aliases) like lower(concat('%',?1,'%'))")
    public List<Organization> search(@Param("search") String search);

}
