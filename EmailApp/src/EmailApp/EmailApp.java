package EmailApp;

public class EmailApp {

	public static void main(String[] args) {
		Email firstEmailObj = new Email ("Nasir","Herawi"); //first Object
		
		firstEmailObj.setAlternateEmail("NasirHerawi@gmail.com");
		
		//System.out.println(firstEmailObj.getMailboxCapcity());
		//System.out.println(firstEmailObj.getAlterEmail());
		
		System.out.println(firstEmailObj.showInfo());
		
		

	}

}

