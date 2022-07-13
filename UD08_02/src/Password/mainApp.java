package Password;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Password pswd = new Password(16);
		System.out.println(pswd.getPasswd());
		
		pswd.setLon(22);
		System.out.println(pswd.getPasswd());
	}

}
