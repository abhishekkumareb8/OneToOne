package AdharDriver;

import OneToOneDBO.AdharDAO;
import OneToOneDTO.Adhar;
import OneToOneDTO.Person;

public class AdharDriver {

	public static void main(String[] args) {

//		Person person = new Person();
//		person.setId(1);
//		person.setName("Abhishek");
//		person.setAge(23);
//		person.setPhone(64647);
//
//		Adhar adhar = new Adhar();
//		adhar.setId(101);
//		adhar.setName("Abhishek kumar");
//		adhar.setAdharNo("hdf352264");
//
//		adhar.setPerson(person);
//		person.setAdhar(adhar);

		AdharDAO adharDAO = new AdharDAO();
		//adharDAO.save(person);
		Adhar adhar= adharDAO.getDetail(1);
		System.out.println(adhar);
	}

}
