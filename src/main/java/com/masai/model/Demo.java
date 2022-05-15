package com.masai.model;

import javax.persistence.EntityManager;

import com.masai.util.EMUtil;

public class Demo {
	
	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		Department dept = new Department();
		
		dept.setDname("Operations");
		dept.setLocation("Mumbai");
		
		Employee emp1 = new Employee();
		emp1.setEname("Sunil");
		emp1.setSalary(100000);
		emp1.setAddress("Hyderabad");
		
		Employee emp2 = new Employee();
		emp2.setEname("Shankar");
		emp2.setSalary(200000);
		emp2.setAddress("Bangalore");
		
		Employee emp3 = new Employee();
		emp3.setEname("Krishna");
		emp3.setSalary(300000);
		emp3.setAddress("Chennai");
		
		dept.getEmps().add(emp1);
		dept.getEmps().add(emp2);
		dept.getEmps().add(emp3);
		
		emp1.setDept(dept);
		emp2.setDept(dept);
		emp3.setDept(dept);
		
		em.getTransaction().begin();
		
		em.persist(dept);
		em.getTransaction().commit();
		
		em.close();
		
	}
	
	
}
