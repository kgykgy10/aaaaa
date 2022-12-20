package kgy_project;

public class Main {

 Applyhome applyhome = Applyhome.getInstance();
 Apartment ramian;
 Apartment xi;
 Apartment prugio;
 
 public void createApartment() {
	 ramian = new Apartment("래미안");
	 xi = new Apartment("자이");
	 prugio = new Apartment("푸르지오");
	 
	 applyhome.addApartment(ramian);
	 applyhome.addApartment(xi);
	 applyhome.addApartment(prugio);
	  }
	
 public void createPerson() {
	 Person person1 = new Person(0001, "손흥민");
	 Person person2 = new Person(0002, "황희찬");
	 Person person3 = new Person(0003, "김민재");
	 Person person4 = new Person(0004, "안정환");
	 
 ramian.register(person1);
 ramian.register(person2);
 ramian.register(person3);
 ramian.register(person4);
 
xi.register(person1);
xi.register(person2);
xi.register(person3);
xi.register(person4);
 
prugio.register(person1);
prugio.register(person2);
prugio.register(person3);
prugio.register(person4);
 
addScoreForPerson(person1,98);
addScoreForPerson(person2,75);
addScoreForPerson(person3,63);
addScoreForPerson(person4,45);
 }

private void addScoreForPerson(Person person1, int i) {
	// TODO Auto-generated method stub
	
}



 
}
