package application;

import java.util.Date;

import models.entities.Department;
import models.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Department obj = new Department(1, "Books");
		Seller seller = new Seller(21,"bob","bob@gmail.com", new Date(), 3000.0,obj);
		
		System.out.print(seller);

	}

}
