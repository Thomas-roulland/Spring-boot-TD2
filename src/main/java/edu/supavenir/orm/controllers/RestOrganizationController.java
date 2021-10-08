package edu.supavenir.orm.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.supavenir.orm.models.Organization;

@RestController
@RequestMapping("/rest/org")
public class RestOrganizationController extends abstractRestController<Organization> {

}
