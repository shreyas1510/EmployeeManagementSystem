import java.util.Scanner;

class Employee extends EmployeeTable {
	




	private String employeeID;
	private String projectUndertaken;
	private String projectDeadline;
	private String designation;
	private int leavesUsed;
	
	
	

	public String getEmployeeID() {
		return employeeID;
	}




	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}




	public String getProjectUndertaken() {
		return projectUndertaken;
	}




	public void setProjectUndertaken(String projectUndertaken) {
		this.projectUndertaken = projectUndertaken;
	}




	public String getProjectDeadline() {
		return projectDeadline;
	}




	public void setProjectDeadline(String projectDeadline) {
		this.projectDeadline = projectDeadline;
	}




	public String getDesignation() {
		return designation;
	}




	public void setDesignation(String designation) {
		this.designation = designation;
	}




	public int getLeavesUsed() {
		return leavesUsed;
	}




	public void setLeavesUsed(int leavesUsed) {
		this.leavesUsed = leavesUsed;
	}




	/**
	 * @param firstName
	 * @param lastName
	 * @param gender
	 * @param department
	 * @param phoneNumber
	 * @param address
	 * @param joiningDate
	 * @param email
	 * @param loginID
	 * @param loginPassword
	 * @param performanceIndex
	 * @param finalSalary
	 * @param employeeID
	 * @param projectUndertaken
	 * @param projectDeadline
	 * @param designation
	 * @param leavesUsed
	 */
	public Employee(String firstName, String lastName, char gender, String department, String phoneNumber,
			String address, String joiningDate, String email, String loginID, String loginPassword, int performanceIndex,
			double finalSalary, String employeeID, String projectUndertaken, String projectDeadline, String designation,
			int leavesUsed) {
		
		super(firstName, lastName, gender, department, phoneNumber, address, joiningDate, email, loginID, loginPassword,
				performanceIndex, finalSalary);
		this.employeeID = employeeID;
		this.projectUndertaken = projectUndertaken;
		this.projectDeadline = projectDeadline;
		this.designation = designation;
		this.leavesUsed = leavesUsed;
	}





	




	
	





	


}
