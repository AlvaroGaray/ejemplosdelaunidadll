package OtrosTemas;

public class InicioDeSesion {

	String UserName;
	String Password;
	public InicioDeSesion(String userName, String password) {
	
		UserName = userName;
		Password = password;
	}
	
	boolean EsDebil() {
		
		if(Password.length()<8)
			return true;
					
			else 
				return false;
	}
	
	
}
