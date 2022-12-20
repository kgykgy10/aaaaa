package kgy_project;

import java.util.ArrayList;

public class Apartment {

	private String apartmentName;
	
	private ArrayList<Person> personList = new ArrayList<Person>(); // 각 아파트에 청약 신청한 청약자 리스트.

	public Apartment(String apartmentName) {
		super();
		this.apartmentName = apartmentName;
	}

	public String getApartmentName() {
		return apartmentName;
	}

	public void setApartmentName(String apartmentName) {
		this.apartmentName = apartmentName;
	}
	
	public void register(Person person) {
		personList.add(person);              //********** 청약 신청 메서드
	} 
	
}
