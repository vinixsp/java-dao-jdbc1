package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
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

	}

}
