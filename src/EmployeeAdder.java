
public class EmployeeAdder {


	//add employee
	public Employee addEmployee(String id) {
	
	double basePay=0;
	double finalSalary;
	Details d1=new Details();
	
//	String id=assignID(1);
	String []details=d1.detailsInserter(1);
	Employee e1=new Employee(details[0], details[1],details[2].charAt(0),details[3], details[4],
			details[5], details[6], details[7], id, details[8],Integer.parseInt(details[9]),0,
			id, details[10],details[11], details[12],0);
	

	if(details[12].equals("Software Developer"))
	{
		basePay=2254782.34;

		finalSalary=basePay+(basePay)*(Integer.parseInt(details[9])/20.0);

	}
	else if(details[12].equals("HR Director"))
	{
		basePay=1256875.67;

		finalSalary=basePay+(basePay)*(Integer.parseInt(details[9])/20.0);
	}
	else 
	{
		basePay=1567975.39;

		finalSalary=basePay+(basePay)*(Integer.parseInt(details[9])/20.0);
	}
	e1.setFinalSalary(finalSalary);
	return e1;
}
	
	
	
	public Manager addManager(String id) {
		double basePay=0;
		double finalSalary=0;
		Details d1=new Details();
//		String id=assignID(2);
		String []details=d1.detailsInserter(2);
		Manager m1=new Manager(details[0], details[1],details[2].charAt(0),details[3], details[4],
				details[5], details[6], details[7], id, details[8], Integer.parseInt(details[9]),0,
				id);
		if(details[3].equals("IT Department"))
		{
			basePay=2754782.34;

			finalSalary=basePay+(basePay)*(Integer.parseInt(details[9])/20.0);

		}
		else if(details[3].equals("HR Department"))
		{
			basePay=1756875.67;

			finalSalary=basePay+(basePay)*(Integer.parseInt(details[9])/20.0);
		}
		else if(details[3].equals("Sales and Marketing Department"))
		{
			basePay=2067975.39;

			finalSalary=basePay+(basePay)*(Integer.parseInt(details[9])/20.0);
		}
		m1.setFinalSalary(finalSalary);
	return m1;
	}
}
