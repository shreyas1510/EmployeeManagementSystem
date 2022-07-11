import java.util.*;

/**
 * 
 */

/**
 * @author kkp
 *
 */
class Manager extends EmployeeTable {
	
	String ManagerID;
	
	/**
	 * @param managerID
	 */
	
	
	
    public String getManagerID() {
		return ManagerID;
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
	 * @param managerID
	 */
	public Manager(String firstName, String lastName, char gender, String department, String phoneNumber,
			String address, String joiningDate, String email, String loginID, String loginPassword, int performanceIndex,
			double finalSalary, String managerID) {
		super(firstName, lastName, gender, department, phoneNumber, address, joiningDate, email, loginID, loginPassword,
				performanceIndex, finalSalary);
		ManagerID = managerID;
	}
	public Manager()
	{
		
	}

	public void setManagerID(String managerID) {
		ManagerID = managerID;
	}
	
		
	public void updateDetails() {
		
	}
    /**
	 * @param managerID
	 */
	public Manager(String managerID) {
		super();
		ManagerID = managerID;
	}
	
    
    

	
}
