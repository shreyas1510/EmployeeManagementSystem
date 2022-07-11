import java.util.HashMap;
import java.util.Scanner;

public class EmployeeLeave {
	public Employee applyForLeave(HashMap<String,Employee> empMap,String temp,boolean flag) {
		Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the number of required Leaves");
	Employee e1=empMap.get(temp);
	int leaves=e1.getLeavesUsed();
	int x=sc.nextInt();
	flag=true;
	if(x+leaves<=10)
	{
		leaves=leaves+x;
		e1.setLeavesUsed(leaves);
//		empMap.put(temp,e1);

	}
	else {
		flag=false;
	}
	return e1;
	}
	
	public void leaveStatus(HashMap<String,Employee> empMap,String temp,boolean flag) {
		Employee e1=empMap.get(temp);
		if(e1.getLeavesUsed()==0 && flag==true)
		{
			System.out.println("You have not yet applied for leave\n");
		}
		else 
		{
			if(flag==true)
			{
				System.out.println("Your leave has been approved\nYou have "+(10-e1.getLeavesUsed())+" leaves left\n");
			}
			else
			{
				System.out.println("Your leave has been denied\nYou can only apply for "+(10-e1.getLeavesUsed()+" leaves \n"));
			}
		}
	}
}
