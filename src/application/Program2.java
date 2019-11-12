package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Department d = null;
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("\n=== Test 1: departmentDao.insert ===");
		d = new Department(null, "Test Department");
		departmentDao.insert(d);
		System.out.println("Department inserted: " + d);
		
		System.out.println("\n=== Test 2: departmentDao.update ===");
		d.setName("Updated Test Department");
		departmentDao.update(d);
		System.out.println("Updated deparment: " + d);

		System.out.println("\n=== Test 3: departmentDao.findAll ===");
		List<Department> list = departmentDao.findAll();
		for (Department dep : list) {
			System.out.println(dep);
		}

		System.out.println("\n=== Test 4: departmentDao.findById ===");
		d = departmentDao.findById(2);
		System.out.println("Deparment: " + d);

		System.out.println("\n=== Test 5: departmentDao.deleteById ===");
		Scanner sc = new Scanner(System.in);
		System.out.print("Type the Department Id to delete: ");
		int i = sc.nextInt();
		departmentDao.deleteById(i);
		System.out.println("Department " + i + " deleted!");
		sc.close();
		
		System.out.println("=== Test 6: departmentDao.findAll ===");
		list = departmentDao.findAll();
		for (Department dep : list) {
			System.out.println(dep);
		}
	}

}
