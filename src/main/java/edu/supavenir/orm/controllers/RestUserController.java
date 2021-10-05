package edu.supavenir.orm.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.supavenir.orm.models.User;
import edu.supavenir.orm.repositories.UserRepositoriese;

@RestController
@RequestMapping("/rest/users")
public class RestUserController {

    @Autowired
    private UserRepositoriese userRepo;

    @GetMapping()
    public List<User> indexAction() {
	return userRepo.findAll();
    }

    @GetMapping("{id}")
    public Optional<User> readOneAction(@PathVariable int id) {
	return userRepo.findById(id);

    }

    @PostMapping()
    public User AddAction(@RequestBody User user) {
	userRepo.saveAndFlush(user);
	return user;
    }

    @DeleteMapping("{id}")
    public User deleteAction(@PathVariable int id) {
	Optional<User> opt = userRepo.findById(id);
	if (opt.isPresent()) {
	    User user = opt.get();
	    userRepo.delete(user);
	    return user;
	}
	return null;
    }

    @PutMapping("{id}")
    public User updateAction(@PathVariable int id, @RequestBody User user) {
	if (userRepo.existsById(id)) {
	    userRepo.save(user);
	    return user;
	}
	return null;
    }
}
