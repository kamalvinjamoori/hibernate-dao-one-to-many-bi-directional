package com.masai.model;

import javax.persistence.EntityManager;

import com.masai.util.EMUtil;

public class Demo1 {

	public static void main(String[] args) {

		EntityManager em = EMUtil.provideEntityManager();

//		Department dept = em.find(Department.class, 1);
//		
//		List<Employee> emps = dept.getEmps();
//		
//		emps.forEach(e -> {
//			System.out.println(e.getEmpId());
//			System.out.println(e.getEname());
//			System.out.println(e.getSalary());
//			System.out.println(e.getAddress());
//		});

		Employee emp = em.find(Employee.class, 2);

		System.out.println(emp.getEname());

		System.out.println(emp.getDept().getDname());

		em.close();

	}

}
