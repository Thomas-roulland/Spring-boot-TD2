package edu.supavenir.orm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.supavenir.orm.models.Organization;
import edu.supavenir.orm.repositories.OrgRepositories;

@RestController
@RequestMapping("/rest/org")
public class RestOrganizationController {

    @Autowired
    private OrgRepositories orgrepo;

    @GetMapping()
    public List<Organization> indexAction() {
	return orgrepo.findAll();
    }

}
