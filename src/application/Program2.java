package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import models.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=====Test 1: testando Insert");
		Department newDepartment = new Department(null, "Music");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! new id:" + newDepartment.getId());
		
		System.out.println(" ");
		
		System.out.println("=====Test 2: testando Update");
		Department dep1 = departmentDao.findById(2); 
		dep1.setName("Buceta");
		departmentDao.update(dep1);
		System.out.println("Department modified");
		
		System.out.println(" ");
		
		System.out.println("=====Test 3: testando FindAll");
		List<Department> list = departmentDao.findAll();
		for(Department dep : list) {
			System.out.println(dep);
		}
		
		System.out.println(" ");
		
		System.out.println("=====Test 4: testando Delete");
		System.out.print("Enter the id for delete: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Deleted");
		
		}
}
