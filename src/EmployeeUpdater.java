import java.util.HashMap;
import java.util.Scanner;

public class EmployeeUpdater {

	public <T extends EmployeeTable> T updateEmployee(HashMap<String,T> empMap,int x,String temp) {
		Scanner sc=new Scanner(System.in);
		T e1=empMap.get(temp);
		if(x==1)
			{
				System.out.println("Enter new Email:\n");
				while(true) {
					String buff=sc.next();
					
					if(e1.checkEmail(buff)) {
						e1.setEmail(buff);
//						empMap.put(temp, e1);
						
						System.out.println("Email has been successfully updated\n");
						break;
					}else {
						System.out.println("Please enter valid email(should end with '@company.in' or '@company.com')\n");
						continue;
					}
				}
			}

			else if(x==2)
			{
				System.out.println("Enter your new Address");
				sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
				String buff=sc.nextLine();

				e1.setAddress(buff);
//				empMap.put(temp, e1);
				
				System.out.println("Your address has been successfully updated\n");

			}
			else if(x==3)
			{
				System.out.println("Enter new phone Number:\n");
				while(true) {

					String buff=sc.next();

					if(e1.checkNumber(buff)) {
						e1.setPhoneNumber(buff);
//						empMap.put(temp, e1);
						
						System.out.println("Your phone number has been successfully updated");
						break;
					}else {
						System.out.println("Please enter valid phone number(10 digit phone number) \n");
						continue;
					}



				}
	}
	
	else {

//		continue;
	}
//	break;
		return e1;
	}
	public <T extends EmployeeTable> T removeEmployee(HashMap<String,T> empMap,String temp,int x) {
		T e1=empMap.get(temp);
		if(x==1) {
		System.out.println(e1.getFirstName()+" "+e1.getLastName()+" bearing Id number "+temp+" has been removed from the company\n");}
		return e1;
	}
}
