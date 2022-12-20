package kgy_project;

public class Score {

int personId;
Apartment apartment;
int score;


public Score(int personId, Apartment apartment, int score) {
	super();
	this.personId = personId;
	this.apartment = apartment;
	this.score = score;
}

public int getPersonId() {
	return personId;
}
public void setPersonId(int personId) {
	this.personId = personId;
}

public Apartment getApartment() {
	return apartment;
}

public void setApartment(Apartment apartment) {
	this.apartment = apartment;
}

public int getScore() {
	return score;
}
public void setScore(int score) {
	this.score = score;
}
	
public String toString() {
	return "청약자 고유번호" + personId + "," + apartment.getApartmentName() + ":" + score;
}

}
