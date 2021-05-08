package core;

public class ValidationRules {
	public static boolean run(boolean... checks ) {
		for (boolean check : checks) {
			if(!check) return false;
		}
		return true;
	}
	
	

}
