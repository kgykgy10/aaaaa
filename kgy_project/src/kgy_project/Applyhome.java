package kgy_project;


import java.util.ArrayList;

public class Applyhome {
	private static Applyhome instance= new Applyhome();

//   private static String Applyhome_name = "APPLYHOME";
	
	private ArrayList<Person> personList = new ArrayList<Person>();
	private ArrayList<Apartment> ApartmentList = new ArrayList<Apartment>();
	
	private Applyhome() {}
	
	public static Applyhome getInstance() {
		return instance;
	}
	

	public Applyhome(ArrayList<Person> personList, ArrayList<Apartment> apartmentList) {
		super();
		this.personList = personList;
		ApartmentList = apartmentList;
	}


	public ArrayList<Person> getPersonList() {
		return personList;
	}


	public void addPerson(Person person) {
		personList.add(person);
	}
		
	public void addApartment(Apartment apartment) {
		ApartmentList.add(apartment);
		
	}
	
	
	
	public ArrayList<Apartment> getApartmentList() {
		return ApartmentList;
	}

	public void setApartmentList(ArrayList<Apartment> apartmentList) {
		ApartmentList = apartmentList;
	}

	
	


}
