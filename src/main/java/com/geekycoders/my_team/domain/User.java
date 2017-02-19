package com.geekycoders.my_team.domain;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
    private String fullname;
    private String email;
    private String phone;
    private String type;
    private String facebooktoken;
    private String image;
    private String gmailtoken;
    private String password;
    
    
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFacebooktoken() {
		return facebooktoken;
	}
	public void setFacebooktoken(String facebooktoken) {
		this.facebooktoken = facebooktoken;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getGmailtoken() {
		return gmailtoken;
	}
	public void setGmailtoken(String gmailtoken) {
		this.gmailtoken = gmailtoken;
	}
	public User() {
		super();
	}
    
    

}
