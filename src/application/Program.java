package application;

import java.time.LocalDate;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department obj = new Department(1, "Books");
		Seller seller = new Seller(21, "Bob", "bob@xmail.com", LocalDate.parse("1980-07-20"), 3000.0, obj);
		System.out.println(seller);

	}

}
