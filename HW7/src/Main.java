
import java.util.*;
import java.text.DateFormat;
import java.util.Date;

public class Main {

	public static void main ( String[] args ) {
		int factorial = 5;
		System.out.println(factorial+"! is " + calculateFactorial(factorial));
		System.out.println("Current Time is : " + getTime());
	}
	
	// method return inputted number占쏙옙s factorial result.
	public static int calculateFactorial(int factorial){
		if(factorial<0)//占쏙옙占쏙옙 占쏙옙 占쏙옙
			if(factorial%2==0)//짝占쏙옙占쏙옙 占쏙옙占쏙옙
				return calculateFactorial(factorial+1)*factorial*-1;
			else//홀占쏙옙占쏙옙 占쏙옙占쏙옙
			return calculateFactorial(factorial+1)*factorial;
		
		else if(factorial-1!=0 && factorial>=1)//占쏙옙占�
			return calculateFactorial(factorial-1)*factorial;
		else//0!=1
			return 1; //0!=1
	}
	public static void GUGUDAN(){
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("援ш뎄�떒 �엯�땲�떎.");
		System.out.println("�닽�옄瑜� �엯�젰�븯�꽭�슂.");
		num = sc.nextInt();
		System.out.println(num + "�떒 異쒕젰�빀�땲�떎.");
		for(int i = 1; i <10; i ++)
		{
			System.out.println(num +"*" +i +"="+ num*i);
		}
		
	}
	
	public static String getTime() {
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		
			String formattedDate = dateFormat.format(date);
			
			return formattedDate;
	 	}
}