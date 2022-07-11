import java.util.HashMap;

public class DetailsViewer {
	public void viewEmpDetails(HashMap<String,Employee> empMap,String temp) {
		System.out.println("Here are the details of this employee:\n");
		Employee e2=empMap.get(temp);
		System.out.println("First name: "+e2.getFirstName()+'\n');
		System.out.println("Last name: "+e2.getLastName()+'\n');
		System.out.println("Gender: "+e2.getGender()+'\n');
		System.out.println("Department: "+e2.getDepartment()+'\n');
		System.out.println("Phone number: "+e2.getPhoneNumber()+'\n');
		System.out.println("Address: "+e2.getAddress()+'\n');
		System.out.println("Joining date: "+e2.getJoiningDate()+'\n');
		System.out.println("Email: "+e2.getEmail()+'\n');
		System.out.println("Login Id: "+e2.getLoginID()+'\n');
		System.out.println("Login Password: "+e2.getLoginPassword()+'\n');
		System.out.println("Performance Index: "+e2.getPerformanceIndex()+'\n');
		System.out.println("Employee Id: "+e2.getEmployeeID()+'\n');
		System.out.println("Project Undertaken: "+e2.getProjectUndertaken()+'\n');
		System.out.println("Project Deadline: "+e2.getProjectDeadline()+'\n');
		System.out.println("Designation: "+e2.getDesignation()+'\n');
		System.out.println("Leaves Used: "+e2.getLeavesUsed()+'\n');
	}
	public void viewMngDetails(HashMap<String,Manager> mngMap,String temp) {
		Manager m2=mngMap.get(temp);
		System.out.println("First name: "+m2.getFirstName()+'\n');
		System.out.println("Last name: "+m2.getLastName()+'\n');
		System.out.println("Gender: "+m2.getGender()+'\n');
		System.out.println("Department: "+m2.getDepartment()+'\n');
		System.out.println("Phone number: "+m2.getPhoneNumber()+'\n');
		System.out.println("Address: "+m2.getAddress()+'\n');
		System.out.println("Joining date: "+m2.getJoiningDate()+'\n');
		System.out.println("Email: "+m2.getEmail()+'\n');
		System.out.println("Login Id: "+m2.getLoginID()+'\n');
		System.out.println("Login Password: "+m2.getLoginPassword()+'\n');
		System.out.println("Performance Index: "+m2.getPerformanceIndex()+'\n');
		System.out.println("Manager Id: "+m2.getManagerID()+'\n');
	}
	
	
}
