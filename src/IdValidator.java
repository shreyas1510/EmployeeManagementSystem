
public class IdValidator {
	public boolean validateEmpID(String id,int num) {
		if(id.substring(0,3).equals("EMP") && ((Integer.parseInt(id.substring(3)))>=1 && (Integer.parseInt(id.substring(3)))<=num)) {
			return true;
		}else {
			return false;
		}
	}
	public boolean validateMngID(String id,int num) {
		if(id.substring(0,3).equals("MNG") && ((Integer.parseInt(id.substring(3)))>=1 && (Integer.parseInt(id.substring(3)))<=num)) {
			return true;
		}else {
			return false;
		}
	}
}
