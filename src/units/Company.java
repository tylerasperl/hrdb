package units;

import java.util.ArrayList;

/**
 * Creation of a company REQUIRES at least one employee.
 * @author mjgbenigno
 *
 */
public class Company {
	private String companyName = null;
	private int companyID = -1;

	private ArrayList<Employee> companyEmployees = new ArrayList<Employee>();
	private ArrayList<Department> companyDepartment = new ArrayList<Department>();
	
	/**
	 * Create a Company object
	 * 
	 */
	public Company() {
		
	}
	
	/**
	 * Adds an employee object to the list
	 * @param newEmployee
	 */
	public void addCompanyEmployee(Employee newEmployee) {
		this.companyEmployees.add(newEmployee);
	}
	
	/**
	 * Adds a department object to this company's list
	 * @param newDepartment
	 */
	public void addCompanyDepartment(Department newDepartment) {
		this.companyDepartment.add(newDepartment);
	}
	
	/** 
	 * Returns the number of employees this company has
	 * @return size of the companyEmployees list
	 */
	public int getCompanyEmployeeCount() {
		return this.companyEmployees.size();
	}
	
	/**
	 * Returns the department count that this company object contains
	 * @return size of the companyDepartment list
	 */
	public int getCompanyDepartmentCount() {
		return this.companyDepartment.size();
	}
	
	/**
	 * Prints out the contents of the companyEmployees list; for testing.
	 */
	public void listCompanyEmployees() {
		for(int i = 0;i<companyEmployees.size();i++) {
			System.out.println(companyEmployees.get(i).getEmployeeFullName());
		}
	}
	
	/**
	 * Prints out the contents of the companyDepartment list; for testing.
	 */
	public void listCompanyDepartments() {
		for(int i = 0; i<companyDepartment.size();i++) {
			System.out.println(companyDepartment.get(i).getDepartmentName());
		}
	}
	
	public void setCompanyName(String name) {
		this.companyName = name;
	}
	
	public void setCompanyID(int ID) {
		this.companyID = ID;
	}
	
	public String getCompanyName() {
		return this.companyName;
	}
	
	public long getCompanyID() {
		return this.companyID;
	}
}
