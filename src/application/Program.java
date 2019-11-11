package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== Test 1: Seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== Test 2: Seller findByDepartmentId ===");
		List<Seller> list = sellerDao.findByDepartmentId(2);
		for (Seller s : list) {
			System.out.println(s);
		}

		System.out.println("\n=== Test 3: Seller findAll ===");
		List<Seller> list2 = sellerDao.findAll();
		for (Seller s : list2) {
			System.out.println(s);
		}

		System.out.println("\n=== Test 4: Seller insert ===");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, new Department(2, null));
		sellerDao.insert(newSeller);
		System.out.println("New seller inserted:\n" + sellerDao.findById(newSeller.getId()));
	}

}
