import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
class EmployeeTable {
	private String firstName;
	private String lastName;
	private char gender;
	private String department;
	private String phoneNumber;
	private String address;
	private String joiningDate;
	private String email;
	private String loginID;
	private String loginPassword;
	private int performanceIndex;
	
	private double finalSalary;
	
	public double getFinalSalary() {
		return finalSalary;
	}

	public void setFinalSalary(double finalSalary) {
		this.finalSalary = finalSalary;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLoginID() {
		return loginID;
	}

	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public int getPerformanceIndex() {
		return performanceIndex;
	}

	public void setPerformanceIndex(int performanceIndex) {
		this.performanceIndex = performanceIndex;
	}

	
	
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
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
	 */
	public EmployeeTable()
	{
		
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
	 */
	public EmployeeTable(String firstName, String lastName, char gender, String department, String phoneNumber,
			String address, String joiningDate, String email, String loginID, String loginPassword, int performanceIndex,
			double finalSalary) {
//		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.department = department;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.joiningDate = joiningDate;
		this.email = email;
		this.loginID = loginID;
		this.loginPassword = loginPassword;
		this.performanceIndex = performanceIndex;
		this.finalSalary = finalSalary;
	}

public boolean checkEmail(String emailid){
		
		return (emailid.endsWith("@company.in") || emailid.endsWith("@company.com"));
		
	}
	
    public static boolean checkPassword(String password)
    {
  
        // for checking if password length
        // is between 8 and 15
        if (!((password.length() >= 8)
              && (password.length() <= 15))) {
            return false;
        }
  
        // to check space
        if (password.contains(" ")) {
            return false;
        }
        if (true) {
            int count = 0;
  
            // check digits from 0 to 9
            for (int i = 0; i <= 9; i++) {
  
                // to convert int to string
                String str1 = Integer.toString(i);
  
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return false;
            }
        }
  
        // for special characters
        if (!(password.contains("@") || password.contains("#")
              || password.contains("!") || password.contains("~")
              || password.contains("$") || password.contains("%")
              || password.contains("^") || password.contains("&")
              || password.contains("*") || password.contains("(")
              || password.contains(")") || password.contains("-")
              || password.contains("+") || password.contains("/")
              || password.contains(":") || password.contains(".")
              || password.contains(", ") || password.contains("<")
              || password.contains(">") || password.contains("?")
              || password.contains("|"))) {
            return false;
        }
  
        if (true) {
            int count = 0;
  
            // checking capital letters
            for (int i = 65; i <= 90; i++) {
  
                // type casting
                char c = (char)i;
  
                String str1 = Character.toString(c);
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return false;
            }
        }
  
        if (true) {
            int count = 0;
  
            // checking small letters
            for (int i = 90; i <= 122; i++) {
  
                // type casting
                char c = (char)i;
                String str1 = Character.toString(c);
  
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return false;
            }
        }
  
        // if all conditions fails
        return true;
    }

    public static boolean checkNumber(String str)
    {  if(str.length()!=10)
    	return false;
    	int n=str.length();
        // Traverse the string from
        // start to end
        for (int i = 0; i < n; i++) {
  
            // Check if character is
            // digit from 0-9
            // then return true
            // else false
            if (str.charAt(i) >= '0'
                && str.charAt(i) <= '9') {
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }		
    public static boolean isValidDate(String date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(date.trim());
        } catch (ParseException pe) {
            return false;
        }
        return true;
    }
	
	
	 
		
		
	}
	


