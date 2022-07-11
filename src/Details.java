import java.io.Console;
import java.util.Random;
import java.util.Scanner;

class Details extends EmployeeTable {
	
	
	public String[] detailsInserter(int option) {
		String []list=new String[14];
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter details:\n");
		
		System.out.println("Enter First Name:\n");
		list[0]=scn.next();
		
		System.out.println("Enter Last Name:\n");
		list[1]=scn.next();
		
		System.out.println("Enter Gender:(enter M for male ,F for female and O for others)\n");
		while(true) {
		
		String buff=scn.next();
		if(buff.equals("M")||buff.equals("F")||buff.equals("O")) {
			list[2]=buff;
			break;
		}else {
			System.out.println("Please enter valid input (M/F/O)\n");
			continue;
		}
		
		}
		
		System.out.println("Choose Department:\n1.IT Department\n2.HR Department\n3.Sales and Marketing Department\n");
		while(true) {
			try {
				int x=Integer.parseInt(scn.next());
				if(x==1) {
					list[3]="IT Department";
					break;
				}else if(x==2) {
					list[3]="HR Department";
					break;
				}else if(x==3) {
					list[3]="Sales and Marketing Department";
					break;
				}else {
					System.out.println("Please select from '1','2' or '3'");
				}
				
				
			}catch(Exception e) {
				System.out.println("Please enter valid input i.e. '1','2' or '3'");
				continue;
			}
		}
		
		System.out.println("Enter phone Number:\n");
		while(true) {
		
		String buff=scn.next();
		if(checkNumber(buff)) {
			list[4]=buff;
			break;
		}else {
			System.out.println("Please enter valid phone number(10 digit phone number) \n");
			continue;
		}

		
		
		}
		System.out.println("Enter address:\n");
		scn.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		list[5]=scn.nextLine();
		System.out.println("Enter Joining Date(dd-mm-yyyy):\n");
		while(true) {
			String buff=scn.next();
			if(isValidDate(buff)) {
				list[6]=buff;
				break;
			}else {
				System.out.println("Please enter valid date(dd-mm-yyyy)\n");
				
			}
		}
		
		
		System.out.println("Enter Email:\n");
		while(true) {
			String buff=scn.next();
			if(checkEmail(buff)) {
				list[7]=buff;
				break;
			}else {
				System.out.println("Please enter valid email(should end with '@company.in' or '@company.com')\n");
				continue;
			}
		}

		
		
		System.out.println("Password will remain hidden for safety purposes");
		while(true) {
			
			Console console = System.console(); 
			System.out.println("Enter login Password:\n");
			char[] password = console.readPassword(); 
			String buff=String.valueOf(password);
			if(checkPassword(buff)) {
				list[8]=buff;
				break;
			}else {
				System.out.println("Invalid format \n Re-enter your password\n Password should be of form:\n");
				System.out.println("Password should not contain any space.\n"
						+ "Password should contain at least one digit(0-9).\n"
						+ "Password length should be between 8 to 15 characters.\n"
						+ "Password should contain at least one lowercase letter(a-z).\n"
						+ "Password should contain at least one uppercase letter(A-Z).\n"
						+ "Password should contain at least one special character ( @, #, %, &, !, $, etc….).");
				continue;
			}
			
			
		}
		System.out.println("Enter Performance Index(0-9):\n");
		list[9]=scn.next();
		
		if(option==1) {
			String x=list[3];
			if(x.equals("IT Department")) {
				Random rand=new Random() ;
						int y = rand.nextInt(2);
						if(y == 0) {
						  //  choose answer 1
							list[10]="Employee Management System";
							list[11]="25-11-2021";
						}
						else {
							list[10]="Library Management System";
							list[11]="27-11-2021";
						}
						//   choose answer 2
				
				
				list[12]="Software Developer";
			}else if(x.equals("HR Department")) {
				list[10]="Project Not applicable";
				list[11]="N/A";
				list[12]="HR Director";
			}else {
				Random rand=new Random() ;
				int y = rand.nextInt(2);
				if(y == 0) {
				  //  choose answer 1
					list[10]="Outreach Analysis";
					list[11]="22-11-2021";
				}
				else {
					list[10]="Marketing Strategy Renewal";
					list[11]="26-11-2021";
				}
				
				list[12]="Analyst";
			}
			
			
		}else if(option==2) {
			
			
		}
	return list;	
	}
	
	
}
