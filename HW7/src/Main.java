
import java.text.DateFormat;
import java.util.Date;

public class Main {

	public static void main ( String[] args ) {
		System.out.println("Hello Git!");
		
		System.out.println("Current Time is : " + getTime());
	}
	
	public static String getTime() {
			Date date = new Date();
			DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
			
				String formattedDate = dateFormat.format(date);
				
				return formattedDate;
		 	}
}