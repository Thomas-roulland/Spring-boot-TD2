package edu.supavenir.orm.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Groupe {

    @Override
    public String toString() {
	return name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    @ManyToOne
    private Organization organization;

    @ManyToMany
    @JoinTable(name = "user_group")
    private List<User> users;

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public Groupe() {
	users = new ArrayList<User>();
    }

    public List<User> getUsers() {
	return users;
    }

    public void setUsers(List<User> users) {
	this.users = users;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public Organization getOrganization() {
	return organization;
    }

    public void setOrganization(Organization organization) {
	this.organization = organization;
    }

}
