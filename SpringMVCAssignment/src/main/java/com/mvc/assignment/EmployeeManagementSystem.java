package com.mvc.assignment;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeManagementSystem {
	private ArrayList<Employee> employees = new ArrayList<Employee>(
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

	int employeeCount = 15;

	@RequestMapping("/ems/employees/download/employees.xlsx")
	public void employeesExcel(HttpServletResponse response) throws IOException {
		response.setContentType("application/octet-stream");
		response.setHeader("Content-Disposition", "attachment; filename=employees.xlsx");
		ByteArrayInputStream stream = ExcelFileExporter.employeeListToExcelFile(employees);
		IOUtils.copy(stream, response.getOutputStream());
	}

	@RequestMapping("/ems/employees/download/employees.pdf")
	public void employeesPDF(HttpServletResponse response) throws IOException {
		response.setContentType("application/octet-stream");
		response.setHeader("Content-Disposition", "attachment; filename=employees.pdf");
		ByteArrayInputStream stream = PDFFileExporter.employeeListToPDFFile(employees);
		IOUtils.copy(stream, response.getOutputStream());
	}

	public ArrayList<String> getNumPages() {
		int num = employees.size() / 5;

		if (employees.size() % 5 > 0) {
			num++;
		}

		ArrayList<String> pages = new ArrayList<>();

		for (int x = 1; x <= num; x++) {
			pages.add(String.valueOf(x));
		}

		return pages;
	}

	public ArrayList<Employee> getEmployeesByPage(int page) {
		ArrayList<Employee> emps = new ArrayList<>();

		int firstIndex = page * 5 - 5;
		int lastIndex = page * 5 - 1;

		if ((lastIndex + 1) > employees.size()) {
			lastIndex = employees.size() - 1;
		}

		for (int x = firstIndex; x <= lastIndex; x++) {
			emps.add(employees.get(x));
		}

		return emps;
	}

	@RequestMapping("/ems/employeesList")
	public ModelAndView showEmployeesList(@RequestParam(name="page", required=true, defaultValue="1") int page) {   
		ModelAndView mav = new ModelAndView("employeesList", "employees", getEmployeesByPage(page)); 
		mav.addObject("pages", getNumPages());
		return mav;
	}   

	@RequestMapping("/ems")
	public String show() {
		return "ems";
	}

	@RequestMapping("/ems/add")
	public String showAddForm() {
		return "add";
	}

	@RequestMapping("/ems/delete")
	public ModelAndView delete(@RequestParam(name="id", required=true, defaultValue="0") int id) {
		for (Employee emp : employees) {
			if (emp.getId() == id) {
				employees.remove(emp);
				break;
			}
		}

		return new ModelAndView("redirect:http://localhost:8080/ems/employees");
	}

	@RequestMapping("/ems/edit")
	public ModelAndView showEdit(@RequestParam(name="id", required=true, defaultValue="0") int id) {
		Employee employee = null;

		for (Employee emp : employees) {
			if (emp.getId() == id) {
				employee = emp;
			}
		}

		return new ModelAndView("edit", "employee", employee);
	}

	@RequestMapping("/ems/employees")
	public ModelAndView showEmployees() {
		return new ModelAndView("employees", "employees", employees);
	}

	@RequestMapping("/ems/employees/{id}")
	public ModelAndView showEmployee(@PathVariable int id) {
		Employee employee = null;

		for (Employee emp : employees) {
			if (emp.getId() == id) {
				employee = emp;
			}
		}

		return new ModelAndView("employee", "employee", employee);
	}

	@RequestMapping(value="/ems/add", method=RequestMethod.POST)
	public ModelAndView submitForm(@RequestParam("name") String name, @RequestParam("dep") String dep, @RequestParam("des") String des, @RequestParam("salary") double salary) {
		employeeCount++;
		employees.add(new Employee(employeeCount, name, dep, des, salary));
		return new ModelAndView("redirect:http://localhost:8080/ems/employees");
	}

	@RequestMapping(value="/ems/edit", method=RequestMethod.POST)
	public ModelAndView submitEditForm(@RequestParam(name="id", required=true, defaultValue="0") int id, @RequestParam("name") String name, @RequestParam("dep") String dep, @RequestParam("des") String des, @RequestParam("salary") double salary) {
		for (Employee emp : employees) {
			if (emp.getId() == id) {
				emp.setName(name);
				emp.setDepartment(dep);
				emp.setDesignation(des);
				emp.setSalary(salary);
				break;
			}
		}

		return new ModelAndView("redirect:http://localhost:8080/ems/employees/" + id);
	}
}
