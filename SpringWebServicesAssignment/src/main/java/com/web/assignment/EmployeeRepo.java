package com.web.assignment;

import java.util.ArrayList;
import java.util.Arrays;


public class EmployeeRepo {
	private static ArrayList<Employee> employees = new ArrayList<Employee>(
			Arrays.asList(
					new Employee(1,"Pancho Sigsworth","Services","Physical Therapy Assistant",197297.67),
					new Employee(2,"Kandace Gaughan","Business Development","Analog Circuit Design manager",172522.84),
					new Employee(3,"Ephrem Cardoso","Human Resources","Physical Therapy Assistant",96939.21),
					new Employee(4,"Carola Vasyutin","Training","Staff Accountant I",87720.13),
					new Employee(5,"Adriena Mokes","Training","Graphic Designer",189495.66),
					new Employee(6,"Ammamaria Lorrain","Sales","Geological Engineer",90989.07),
					new Employee(7,"Bennett Garz","Product Management","Community Outreach Specialist",74171.52),
					new Employee(8,"Nickolai Medley","Research and Development","Budget/Accounting Analyst III",182524.49),
					new Employee(9,"Hannie Ducker","Training","Operator",141041.09),
					new Employee(10,"Emmit Dunbabin","Training","Food Chemist",166628.58),
					new Employee(11,"Kaitlynn Klassmann","Support","Quality Control Specialist",101911.79),
					new Employee(12,"Gus Ivons","Business Development","Junior Executive",83360.92),
					new Employee(13,"Bessy Frackiewicz","Legal","Cost Accountant",192886.13),
					new Employee(14,"Aurora Abendroth","Legal","Engineer III",188821.15),
					new Employee(15,"Lourette Joontjes","Sales","Technical Writer",71653.52)
					));
	
	private static int employeeCount = 15;
	
	public static ArrayList<Employee> getAllEmployees() {
		return employees;
	}
	
	public static Employee getEmployee(int id) {
		for (Employee emp : employees) {
			if (emp.getId() == id) {
				return emp;
			}
		}
		return new Employee(0, null, null, null, 0);
	}
	
	public static Employee addEmployee(Employee emp) {
		employeeCount++;
		emp.setId(employeeCount);
		employees.add(emp);
		return emp;
	}
	
	public static String deleteEmployee(int id) {
		for (Employee emp : employees) {
			if (emp.getId() == id) {
				employees.remove(emp);
				return "Successfully deleted";
			}
		}
		return "Not found";
	}
	
	public static Employee updateEmployee(Employee emp2) {
		for (Employee emp1 : employees) {
			if (emp1.getId() == emp2.getId()) {
				emp1.setName(emp2.getName());
				emp1.setDepartment(emp2.getDepartment());
				emp1.setDesignation(emp2.getDesignation());
				emp1.setSalary(emp2.getSalary());
				return emp1;
			}
		}
		return new Employee(0, null, null, null, 0);
	}
}
