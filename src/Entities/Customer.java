package Entities;



import java.util.Date;

import Abstract.IEntity;

public class Customer implements IEntity{
private int Id;
private String FirstName;
private String LastName;
private int dateOfBirth;
private String NationalityId;


public Customer(int Id, String FirstName, String LastName, int dateofBirth, String NationalityId) {
	super();
	this.Id = Id;
	this.FirstName = FirstName;
	this.LastName = LastName;
	this.dateOfBirth = dateOfBirth;
	this.NationalityId = NationalityId;
}
public int getId() {
	return Id;
}
public void setId(int Id) {
	this.Id = Id;
}
public String getFirstName() {
	return FirstName;
}
public void setFirstName(String FirstName) {
	this.FirstName = FirstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String LastName) {
	this.LastName = LastName;
}




public int getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(int dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public String getNationalityId() {
	return NationalityId;
}
public void setNationalityId(String NationalityId) {
	this.NationalityId = NationalityId;
}


}
