package edu.supavenir.orm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.supavenir.orm.models.Groupe;
import edu.supavenir.orm.models.Organization;
import edu.supavenir.orm.repositories.OrgRepositories;

@Controller
@RequestMapping("/org/")
public class OrgControllers {

    @Autowired
    private OrgRepositories repository;

    @GetMapping("/")
    public String index(Model model) {
	List<Organization> organizations = repository.findAll();
	model.addAttribute("organizations", organizations);
	return "index";
    }

    @GetMapping("add")
    public String formAction() {
	return "formOrg";
    }

    @PostMapping("add")
    public @ResponseBody String addAction(Organization orga) {
	Groupe group = new Groupe();
	group.setName("etudiant");
	group.setOrganization(orga);
	orga.getGroups().add(group);
	repository.saveAndFlush(orga);
	return "orga ajouté : " + orga;
    }
}