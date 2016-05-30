package com.phase3.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
 
import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
 
@Entity
@Table(name="USER")
public class User {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
 
    @Size(min=3, max=50)
    @Column(name = "NAME", nullable = false)
    private String name;
     
    @NotNull
	@Digits(integer=8, fraction=2) 
    @Column(name = "JOINING_DATE", nullable = false)
    private int joiningDate;
 
    @Size(min=3, max=50)
    @Column(name = "ADDRESS", nullable = false)
    private String address;
    
    @NotNull
	@Digits(integer=8, fraction=2) 
    @Column(name = "PHONE_NUMBER", nullable = false)
    private int phoneNumber;
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}    
 
    public int getJoiningDate() {
        return joiningDate;
    }
 
    public void setJoiningDate(int joiningDate) {
        this.joiningDate = joiningDate;
    }
 
    public String getAddress(){
    	return address;
    }
    
    public void setAddress(String adress){
    	this.address = adress;
    }
    
    public int getPhoneNumber(){
    	return phoneNumber;
    }
    
    public void setPhoneNumber(int phonenumber){
    	this.phoneNumber = phonenumber;
    }
 

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof User))
            return false;
        User other = (User) obj;
        if (id != other.id)
            return false;
        return true;
    }
 
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", joiningDate="
                + joiningDate + ", adress=" + address + ", phonenumber=" + phoneNumber + "]";
    }
     
}