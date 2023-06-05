package 강의2;

public class PracServerConnection {

static PracServerConnection instance;
	
	PracServerConnection()
	{
	
	}
	 public static PracServerConnection getInstance()
	{
		 
		 if(instance == null)
		 {
			 instance =  new PracServerConnection();
		 }
		
		 
		 return instance;
	
	}
	
	
}
