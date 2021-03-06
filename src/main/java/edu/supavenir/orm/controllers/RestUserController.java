package edu.supavenir.orm.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.supavenir.orm.models.User;

@RestController
@RequestMapping("/rest/users")
public class RestUserController extends abstractRestController<User> {

}
