package edu.supavenir.orm.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String Firstname;

    public String getFirstName() {
	return Firstname;
    }

    public void setFirstName(String Firstname) {
	this.Firstname = Firstname;
    }

    public String getFirstname() {
	return Firstname;
    }

    @ManyToOne
    private Organization organization;

    @Override
    public String toString() {
	return Firstname;
    }

    @ManyToMany(mappedBy = "users")
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
