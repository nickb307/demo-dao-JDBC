package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Department d = new Department(1,"book");
		System.out.println(d);
		
		Seller s= new Seller(21, "Bob", "bob@gmail.com", new Date(), 200.0, d);
		System.out.println(s);
		
	}

}
