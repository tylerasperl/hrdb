package abstracts;

public abstract class Employees_abstract {
	protected String firstName = null;
	protected String lastName = null;
	protected long ID = -1;
	
	
	/**
	 * Sets the first name for the employee object
	 * @param s first name to be recorded
	 */
	public void setFirstName(String s) {
		this.firstName = s;
	}
	
	/**
	 * Sets the last name for the employee object
	 * @param s last name to be recorded
	 */
	public void setLastName(String s) {
		this.lastName = s;
	}
	
	/**
	 * Retrieves the first name recorded in this object
	 * @return String 
	 */
	public String getFirstName() {
		return this.firstName;
	}
	
	/**
	 * Retrieves the last name recorded in this object
	 * @return String 
	 */
	public String getLastName() {
		return this.lastName;
	}
	
	/**
	 * Gets the full name of this employee object
	 * @return firstName + " " + lastName
	 */
	public String getFullName() {
		return this.firstName +" "+ this.lastName;
	}
	
	/**
	 * Retrieves the ID recorded for this employee object
	 * @return ID value
	 */
	public long getID() {
		return this.ID;
	}
	
	abstract void setEmployeeType();
	abstract void getEmployeeType();
}
