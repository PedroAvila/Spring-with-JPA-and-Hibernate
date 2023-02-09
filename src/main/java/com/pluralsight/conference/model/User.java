package com.pluralsight.conference.model;

import javax.persistence.*;

@Entity
@Table(name = "Users")
public class User {

	@Id
	@GeneratedValue
	@Column(name = "UserId")
	private long id;
	
	@Column(name = "FirstName")
    private String firstname;
    
	@Column(name = "LastName")
    private String lastname;
	
	@Column(name = "Age")
    private int age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
