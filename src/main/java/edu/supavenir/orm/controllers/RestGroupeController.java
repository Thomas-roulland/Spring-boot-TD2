package edu.supavenir.orm.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.supavenir.orm.models.Groupe;

@RestController
@RequestMapping("/rest/groupe")
public class RestGroupeController extends abstractRestController<Groupe> {

}
