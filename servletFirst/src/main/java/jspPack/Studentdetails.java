package jspPack;

public class Studentdetails {
	
private String id;
private String name;
private String email;
private String age;
private String address;

 
public Studentdetails(String id, String name, String email, String age, String address) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.age = age;
	this.address = address;
}
public Studentdetails() {
	// TODO Auto-generated constructor stub
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "Studentdetails [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + ", address=" + address
			+ "]";
} 
}
