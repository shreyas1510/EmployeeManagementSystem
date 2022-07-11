import java.util.*;

public class Main {
	static int noOfEmployees=0;
	static int noOfManagers=0;
	final int noOfDepts=3;

	public static String assignID(int x) {

		if (x==1) {
			return ("EMP"+Integer.toString(noOfEmployees));
		}else if(x==2) {
			return ("MNG"+Integer.toString(noOfManagers));
		}else {
			return null;
		}
	}
//	function to promote an employee to a manager
//	###########################################################################################################################################################
	public static Manager updateManager(Employee e1,String id)
	{
		
		Manager m1=new Manager();
		m1.setLoginID(id);
		m1.setManagerID(id);
		m1.setAddress(e1.getAddress());
		m1.setDepartment(e1.getDepartment());
		m1.setEmail(e1.getEmail());
		m1.setFirstName(e1.getFirstName());
		m1.setGender(e1.getGender());
		m1.setJoiningDate(e1.getJoiningDate());
		m1.setLastName(e1.getLastName());
		m1.setLoginPassword(e1.getLoginPassword());
		m1.setPhoneNumber(e1.getPhoneNumber());
		m1.setPerformanceIndex(e1.getPerformanceIndex());
		double basePay=0,finalSalary=0;
		if(m1.getDepartment().equals("IT Department"))
		{
			basePay=2754782.34;

			finalSalary=basePay+(basePay)*((m1.getPerformanceIndex())/20.0);

		}
		else if(m1.getDepartment().equals("HR Department"))
		{
			basePay=1756875.67;

			finalSalary=basePay+(basePay)*((m1.getPerformanceIndex())/20.0);
		}
		else if(m1.getDepartment().equals("Sales and Marketing Department"))
		{
			basePay=2067975.39;

			finalSalary=basePay+(basePay)*((m1.getPerformanceIndex())/20.0);
		}
		m1.setFinalSalary(finalSalary);
		
		return m1;
	}
	
//	###########################################################################################################################################################
	public static void main(String[] args) {
		
//		#####################################################################################################################################################
//		object to validate id of employee/manager using respective methods of class idValidator
		IdValidator v1=new IdValidator();
		
//		object to update/remove employee/manager using respective methods of class employeeUpdater		
		EmployeeUpdater u1=new EmployeeUpdater();
		
//		object to add employee/manager using respective methods of class employeeAdder	
		EmployeeAdder empAdder=new EmployeeAdder();
//		object to view details of  employee/manager using respective methods of class DetailsViewer			
		DetailsViewer viewer=new DetailsViewer();
//		object to apply for leave or check status of  employee using respective methods of class EmployeeLeave
		EmployeeLeave leave=new EmployeeLeave();

		//		hashmap for employee
		HashMap<String,Employee> empMap=new HashMap<String,Employee>();
		//hashmap for salary
		HashMap<String,Double> empSalaryMap=new HashMap<String,Double>();
		//hashmap for salary
		HashMap<String,Double> mngSalaryMap=new HashMap<String,Double>();
		//		hashmap for manager
		HashMap<String,Manager> mngMap=new HashMap<String,Manager>();

//		###########################################################################################################################################################
		boolean flag=true;

		while(true)
		{
			Scanner scn=new Scanner(System.in);
		System.out.println("Welcome to the employee management system!!! :\n Choose option to access:\n 1.Employee \n 2.Manager\n 3.Department\n 4.Exit\n");
		try {
		int option=Integer.parseInt(scn.next());
		if(option==1)
		{System.out.println("There are "+noOfEmployees+" employees working in the company");
		boolean flag3=true;

		while(true) {


			System.out.println("Would you like to add an employee?(Enter 'y' for yes and 'n' for no 'e' to go back to previous menu)");
			String ch=scn.next();
			if(ch.equals("y") || ch.equals("Y"))
			{//add employee
				noOfEmployees++;
				Employee e1=empAdder.addEmployee(assignID(1));
				empSalaryMap.put(e1.getEmployeeID(),e1.getFinalSalary());
				empMap.put(e1.getEmployeeID(), e1);
			}
			else if((ch.equals("n") || ch.equals("N")) && noOfEmployees==0) {
				System.out.println("There are no employees in the company.Please add an employee first.");
				continue;
			}
			else if((ch.equals("n") || ch.equals("N")) && noOfEmployees!=0)
			{
				while(true) {
					System.out.println("Choose option to :\n 1.Update Details \n 2.View Details\n 3. Pay Details\n 4.Apply Leave\n 5.Leave Status\n 6.Remove Employee\n 7.Promote an existing employee to a manager\n 8.Go back to previous menu");
					int option2=0;
					
					try {
						option2=Integer.parseInt(scn.next());
					}catch(Exception e) {
						System.out.println("Please enter correct option");
						continue;
					}
					
					if(option2==1) {
						//							update details
						System.out.println("Please enter id number of employee");
						while(true)
						{
							try{
								String temp=scn.next();
								if(v1.validateEmpID(temp, noOfEmployees))
								{
									System.out.println("Choose the option to be updates\n1.Email\n2.Address\n3.Phone number\n");

									int x=0;
									try {
										x=Integer.parseInt(scn.next());
										Employee e1=u1.updateEmployee(empMap, x, temp);
										empMap.put(temp, e1);
										break;

									}catch(Exception e) {
										System.out.println("Please enter correct option");
										continue;
									}


								}else {
									System.out.println("Please enter correct id number of employee");
									continue;
								}
							}
							catch(Exception e) {
								System.out.println("Please enter correct id number of employee");
							}



						}
					}
					else if(option2==2) {
//						view details
						System.out.println("Please enter id number of employee");
						while(true)
						{
							try {
								String temp=scn.next();
								if(v1.validateEmpID(temp, noOfEmployees))
								{	
									viewer.viewEmpDetails(empMap,temp);
									break;
								}
								else
								{
									System.out.println("Please enter correct id number of employee");
									continue;
								}}catch(Exception e) {
									System.out.println("Please enter correct id number of employee");
								}
						}

					}
					else if(option2==3) {
						System.out.println("Please enter id number of employee");
						while(true)
						{
							try {
								String temp=scn.next();
								if(v1.validateEmpID(temp, noOfEmployees))
								{     
									System.out.println("Your salary is "+String.format("%,.2f", empSalaryMap.get(temp))+'\n');
									break;
								}
								else 
								{
									System.out.println("Please enter correct id number of employee");
									continue;
								}
							}
							catch(Exception e) {
								System.out.println("Please enter correct id number of employee");

							}

							//							pay details
						}


					}
					else if(option2==4) {
						//							leave apply
						System.out.println("Please enter id number of employee");
						while(true)
						{
							try {
								String temp=scn.next();


								if(v1.validateEmpID(temp, noOfEmployees))
								{ 
									Employee e1=leave.applyForLeave(empMap,temp,flag);
									empMap.put(temp,e1);
									break;
									}
								else
								{
									System.out.println("Please enter correct id number of employee");
									continue;
								}
							}catch(Exception e) {
								System.out.println("Please enter correct id number of employee");
							}
						}
					}
					else if(option2==5) {
						//							Leave Status
						System.out.println("Please enter id number of employee");
						while(true)
						{
							try {
								String temp=scn.next();
								if(v1.validateEmpID(temp, noOfEmployees))
								{ 	leave.leaveStatus(empMap,temp,flag);
									break;
								}
								else
								{
									System.out.println("Please enter correct id number of employee");
									continue;
								}
							}catch(Exception e) {
								System.out.println("Please enter correct id number of employee");
							}

						}
					}
					else if(option2==6) {

						//							remove employee
						int x=empMap.size();
						if(empMap.size()==0)
						{
							System.out.println("There are currently no employees in the company");
							break;
						}
						System.out.println("Please enter id number of employee to be removed");
						while(true)
						{
							try {
								String temp=scn.next();


								if(v1.validateEmpID(temp, noOfEmployees))

								{
//									Employee e1=empMap.get(temp);
//								System.out.println(e1.getFirstName()+" "+e1.getLastName()+" bearing Id number "+e1.getEmployeeID()+" has been removed from the company\n");
//								empMap.remove(temp);
									empMap.remove(u1.removeEmployee(empMap, temp,1));
									noOfEmployees--;
								break;
								}

								else {
									System.out.println("Please enter valid id number of employee to be removed");
									continue;
								}
							}catch(Exception e) {
								System.out.println("Please enter correct id number of employee");
							}
						}
						break;
					}
					else if(option2==7)
					{
						System.out.println("Enter the Id of the employee who is to be promoted to a manager");
						while(true)
						{
							try {
								String temp=scn.next();

								if(v1.validateEmpID(temp, noOfEmployees))

								{
//									Employee e1=empMap.get(temp);
//								System.out.println(e1.getFirstName()+" "+e1.getLastName()+" bearing Id number "+e1.getEmployeeID()+" has been removed from the company\n");
//								empMap.remove(temp);
									Employee e1=u1.removeEmployee(empMap, temp,0);
									empMap.remove(e1);
									noOfEmployees--;
									noOfManagers++;
									String id=assignID(2);
									Manager m1=updateManager(e1,id);
									mngSalaryMap.put(m1.getManagerID(),m1.getFinalSalary());
									mngMap.put(m1.getManagerID(), m1);
									System.out.println("Congrats Employee has been successfully promoted to a Manager");
									
									
								break;
								}

								else {
									System.out.println("Please enter valid id number of employee to be removed");
									continue;
								}
							}catch(Exception e) {
								System.out.println("Please enter correct id number of employee");
							}
						}
						break;
						
						
					}
					else if(option2==8) {
						break;
					}
					else {
						System.out.println("Please enter correct option");
						continue;
					}

				}
			}

			else if(ch.equals("e") || ch.equals("E"))
			{  
			flag3=false;
				break;

			}

			else {
				System.out.println("Please enter correct input(y/n/e)");
				continue;
			}
			
		}
		
		if(flag3==false)
			continue;
//		
	}
		//			########
		else if(option==2)
		{System.out.println("There are "+noOfManagers+" managers working in the company");
		boolean flag4=true;
		while(true) {


			System.out.println("Would you like to add a manager?(Enter y for yes and n for no e to go to previous menu)");
			String ch=scn.next();
			if(ch.equals("y") || ch.equals("Y"))
			{//add manager
				noOfManagers++;
				Manager m1=empAdder.addManager(assignID(2));
				mngSalaryMap.put(m1.getManagerID(),m1.getFinalSalary());
				mngMap.put(m1.getManagerID(), m1);

			}
			else if((ch.equals("n") || ch.equals("N")) && noOfManagers==0) {
				System.out.println("There are no managers in the company.Please add a manager first.");
				
			}
			else if((ch.equals("n") || ch.equals("N")) && noOfManagers!=0)
			{
				while(true) {
					System.out.println("Choose option to :\n 1.Update Details \n 2.View Details\n 3. Pay Details\n 4.Remove Manager\n 5.Search Employee\n 6.Display Project\n 7.Go back to previous menu");
					int option2=0;
					try {
						option2=Integer.parseInt(scn.next());
					}catch(Exception e) {
						System.out.println("Please enter correct option");
						continue;
					}

					if(option2==1) {
						//							update details
						System.out.println("Please enter id number of manager");
						while(true)
						{
							try {
								String temp=scn.next();


								if(temp.substring(0,3).equals("MNG") && ((Integer.parseInt(temp.substring(3)))>=1 && (Integer.parseInt(temp.substring(3)))<=noOfManagers))
								{
									System.out.println("Choose the option to be updates\n1.Email\n2.Address\n3.Phone number\n");
									int x=0;
									try {
										x=Integer.parseInt(scn.next());
										Manager m1=u1.updateEmployee(mngMap, x, temp);
										mngMap.put(temp, m1);
										break;
									}catch(Exception e) {
										System.out.println("Please enter correct option");
										continue;
									}
								}else {
									System.out.println("Enter Correct Id");
									continue;
								}
							}catch(Exception e) {
								System.out.println("Please enter valid id number of manager(MNGX-X is a positive integer of any digits");
							}
						}
					}
					else if(option2==2) {
						//							view details
						System.out.println("Please enter id number of manager");
						while(true)
						{
							try {
								String temp=scn.next();
//								if(temp.substring(0,3).equals("MNG") && ((Integer.parseInt(temp.substring(3)))>=1 && (Integer.parseInt(temp.substring(3)))<=noOfManagers))
								if(v1.validateMngID(temp, noOfManagers))
								{	viewer.viewMngDetails(mngMap,temp);
									break;
								}
								else
								{
									System.out.println("Enter Correct Id");
									continue;
								}
							}catch(Exception e) {
								System.out.println("Please enter valid id number of manager(MNGX-X is a positive integer of any digits");
							}
						}
					}
					else if(option2==3) {
						System.out.println("Please enter id number of manager");
						while(true)
						{
							try {
								String temp=scn.next();


								if(v1.validateMngID(temp, noOfManagers))
								{     
									System.out.println("Your salary is "+String.format("%,.2f", mngSalaryMap.get(temp))+'\n');
									break;
								}
								else 
								{
									System.out.println("Enter Correct Id\n");
									continue;
								}
								//							pay details
							}catch(Exception e) {
								System.out.println("Please enter valid id number of manager(MNGX-X is a positive integer of any digits");
							}
						}

					}
					else if(option2==4) {
						//							Remove Manager
						int x=mngMap.size();
						if(mngMap.size()==0)
						{
							System.out.println("There are currently no managers in the company");
							break;
						}else {
							
							System.out.println("Please enter id number of manager to be removed");
							while(true)
							{
								try {
								String temp=scn.next();


								if(v1.validateMngID(temp, noOfManagers))
								{	
									mngMap.remove(u1.removeEmployee(mngMap, temp,1));
								noOfManagers--;
								break;
								}

								else {
									System.out.println("Please enter valid id number of manager to be removed");
									continue;
								}
								}catch(Exception e) {
									System.out.println("Please enter valid id number of manager(MNGX-X is a positive integer of any digits");
								}
							}	
						}



					}
					else if(option2==5) {
						//							Search Employee
						System.out.println("Please enter id number of the employees's manager");
						while(true) {
							try {
							String mng=scn.next();
							if(noOfManagers==0) {
								System.out.println("There are no managers in the company.Please add a manager first");
								break;
							}
							if(v1.validateMngID(mng, noOfManagers))
							{
								System.out.println("Please enter id number of employee under this manager");
								while(true)
								{
									try {
									String temp=scn.next();

									if(noOfEmployees==0) {
										System.out.println("No employees present please add an employee first");
										break;
									}
									else if(v1.validateEmpID(temp, noOfEmployees))
									{
										if(empMap.containsKey(temp) && empMap.get(temp).getDepartment().equals(mngMap.get(mng).getDepartment())) {

//											System.out.println("Here are the details of this employee:\n");
											viewer.viewEmpDetails(empMap,temp);
											break;


										}
									}else {
										System.out.println("Please enter valid employee id to be searched");
										continue;
									}
									}catch(Exception e) {
										System.out.println("Please enter valid id number of employee(EMP-X is a positive integer of any digits");
									}
								}
								break;
							}
							else {
								System.out.println("Please enter valid manager id ");
								continue;
							}
						}catch(Exception e) {
							System.out.println("Please enter valid id number of manager(MNGX-X is a positive integer of any digits");
						}
					}
					}
					else if(option2==6) {
						//display Projects
						System.out.println("Please enter id number of manager");
						while(true)
						{
							try {
								String temp=scn.next();


								if(temp.substring(0,3).equals("MNG") && ((Integer.parseInt(temp.substring(3)))>=1 && (Integer.parseInt(temp.substring(3)))<=noOfManagers)) {
									Manager m1=mngMap.get(temp);
									if(m1.getDepartment().equals("IT Department")) {
										System.out.println("The projects are:\n1.Employee Management System\n2.Library Management System\n");
									}
									else if(m1.getDepartment().equals("HR Department")) {
										System.out.println("The projects are not applicable for HR department");
									}
									else{
										System.out.println("The projects are:\n1.Outreach Analysis\n2.Marketing Strategy Renewal\n");
									}
									break;
								}
								else {
									System.out.println("Please enter valid manager id ");
									continue;
								}
						
							}catch(Exception e) {
								System.out.println("Please enter valid id number of manager(MNGX-X is a positive integer of any digits");
							}
						}
					}
					else if(option2==7) {
						break;
					}

					else {

						System.out.println("Please enter correct option");
						continue;
					}


				}
			}

			else if(ch.equals("e") || ch.equals("E"))
			{ flag4=false;
				break;

			}
			else {
				System.out.println("Please enter correct input(y/n/e)");
				continue;
			}
		}
		if(flag4==false)
			continue;

		}
		else if(option==3)
		{	int flag1=0;
		while(true) {
			System.out.println("Choose Department:\n1.IT Department\n2.HR Department\n3.Sales and Marketing Department \n4.Go back to previous menu\n");
			int dept=0;
			try {
				dept=Integer.parseInt(scn.next());
			}catch(Exception e) {
				System.out.println("Please enter correct option");
				continue;
			}
               while(true) {
				if(dept==1) {
					//IT
					System.out.println("Choose option to :\n 1.Display Budget\n 2. Employees  \n 3. Display Projects \n 4.exit\n ");
					int option2=0;
					try {
						option2=Integer.parseInt(scn.next());
					}catch(Exception e) {
						System.out.println("Please enter correct option");
						continue;
					}
					if(option2==1) {
						//								Display budget
						System.out.println("The budget of the IT Department is 20 Crore 52 Lakh");
					}
					else if(option2==2) {
						//								no of employees
						int count=0;
						for (Employee e1 : empMap.values()) {

							if(e1.getDepartment().equals("IT Department"))
							{ count++;
							}
						}
						if(count==0)
						{
							System.out.println("There are currently no employees in the IT department");
							continue;

						}
						System.out.println("There are "+count+" number of employees in the IT department");
						for (Employee e1 : empMap.values())
						{

							if(e1.getDepartment().equals("IT Department"))
							{ 
								System.out.println("Employee Name: "+e1.getFirstName()+" "+e1.getLastName());
								System.out.println("Employee Id: "+e1.getLoginID()+'\n');
							}
						}

					}
					else if(option2==3) {
						//								display projects
						System.out.println("Employee Management System\n");
						System.out.println("Library Management System\n");

					}
					else if(option2==4) {
						break;
					}
					else {
						System.out.println("Please enter correct option");
						continue;
					}
				}
				else if(dept==2) {
					//							HR
					System.out.println("Choose option to :\n 1.Display Budget\n 2. Employees \n 3. Display Projects \n 4.Go back to previous menu\n ");
					int option2=0;
					try {
						option2=Integer.parseInt(scn.next());
					}catch(Exception e) {
						System.out.println("Please enter correct option");
						continue;
					}
					if(option2==1) {
						//								Display budget
						System.out.println("The budget of the HR Department is 10 Crore 46 Lakh\n");

					}
					else if(option2==2) {
						//								no of employees
						int count=0;
						for (Employee e1 : empMap.values()) {

							if(e1.getDepartment().equals("HR Department"))
							{ count++;
							}
						}
						if(count==0)					
						{
							System.out.println("There are currently no employees in the HR department");
							continue;

						}
						System.out.println("There are "+count+" number of emoployees in the HR department");
						for (Employee e1: empMap.values()) {

							if(e1.getDepartment().equals("HR Department"))
							{ 
								System.out.println("Employee Name: "+e1.getFirstName()+" "+e1.getLastName());
								System.out.println("Employee Id: "+e1.getLoginID()+'\n');
							}
						}
					}
					else if(option2==3) {
						//								display projects
						System.out.println("Project Not Applicable\n");
					}
					else if(option2==4) {
						break;
					}
					else {
						System.out.println("Please enter correct option");
						continue;
					}
				}
				else if(dept==3) 
				{
					//Sales and Marketing
					System.out.println("Choose option to :\n 1.Display Budget\n 2. Employees \n 3. Display Projects \n 4.Go back to previous menu\n ");
					int option2=0;
					try {
						option2=Integer.parseInt(scn.next());
					}catch(Exception e) {
						System.out.println("Please enter correct option");
						continue;
					}
					if(option2==1) {
						System.out.println("The budget of the Sales and Marketing Department is 15 Crore 37 Lakh");

						//								Display budget
					}
					else if(option2==2) {
						//								no of employees
						int count=0;
						for (Employee e1 : empMap.values()) {

							if(e1.getDepartment().equals("Sales and Marketing Department"));
							{ count++;
							}
						}
						if(count==0)					
						{
							System.out.println("There are currently no employees in the Sales and Marketing Department ");
							continue;

						}
						System.out.println("There are "+count+" number of emoployees in the Sales and Marketing Department");
						for (Employee e1 : empMap.values()) {

							if(e1.getDepartment().equals("Sales and Marketing Department"))
							{ 
								System.out.println("Employee Name: "+e1.getFirstName()+" "+e1.getLastName());
								System.out.println("Employee Id: "+e1.getLoginID()+'\n');
							}
						}
					}
					else if(option2==3) {
						//								display projects
						System.out.println("Outreach Analysis\n");
						System.out.println("Marketing Stratergy Renewal\n");
					}
					else if(option2==4) {
						break;
					}
					else {
						System.out.println("Please enter correct option");
						continue;
					}
				}
				else if(dept==4) 
				{  flag1=0;
				break;

				}
				else {
					System.out.println("Please enter correct option");

					continue;
				}

			}

			if(flag1==0)
				break;

		}
   if(flag1==0)
	   continue;
		}

		else if(option==4)
		{
			System.out.println("Thank you!!\n");
			break;

		}
		else {
			System.out.println("Please enter correct option");
			continue;
		}
		}catch(Exception e) {
			System.out.println("Please enter correct option");
			continue;
		}
		return;

	}

}
}