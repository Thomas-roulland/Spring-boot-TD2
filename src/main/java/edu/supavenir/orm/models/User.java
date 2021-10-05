package edu.supavenir.orm.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String firstname;
    private String name;

    public String getFirstname() {
	return firstname;
    }

    public void setFirstname(String firstname) {
	this.firstname = firstname;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    @ManyToOne
    private Organization organization;

    @Override
    public String toString() {
	return firstname;
    }

    @ManyToMany(mappedBy = "users")
    @JsonIgnore
    private List<Groupe> groups;

    public User() {
	groups = new ArrayList<Groupe>();
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public Organization getOrganization() {
	return organization;
    }

    public void setOrganization(Organization organization) {
	this.organization = organization;
    }

    public List<Groupe> getGroups() {
	return groups;
    }

    public void setGroups(List<Groupe> groups) {
	this.groups = groups;
    }

}
