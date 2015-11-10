
import java.util.*;
import java.text.DateFormat;
import java.util.Date;

public class Main {

	public static void main ( String[] args ) {
		int factorial = 5;
		System.out.println(factorial+"! is " + calculateFactorial(factorial)+"\n");		
		System.out.println("Current Time is : " + getTime()+"\n");
		GUGUDAN();		
		drawDiamond();
		
	}
	
	// method return inputted number's factorial result.
	public static int calculateFactorial(int factorial){
		if(factorial<0)//negative number
			if(factorial%2==0)//negative even number
				return calculateFactorial(factorial+1)*factorial*-1;
			else//negative odd number
			return calculateFactorial(factorial+1)*factorial;
		
		else if(factorial-1!=0 && factorial>=1)//positive number
			return calculateFactorial(factorial-1)*factorial;
		else//0!=1
			return 1; //0!=1
	}
	public static void GUGUDAN(){
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("GUGUDAN");
		System.out.println("Input table number.");
		num = sc.nextInt();
		System.out.println("table " + num);
		for(int i = 1; i <10; i ++)
		{
			System.out.println(num +"*" +i +"="+ num*i);
		}
		System.out.println();
	}
	
	public static String getTime() {
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		
			String formattedDate = dateFormat.format(date);
			
			return formattedDate;
	 	}
	
	public static void drawDiamond(){
		for(int i=1;i<=4;i++){ 
 			for(int j=1;j<=5-i;j++){ 
 			System.out.print("вово");} 
 			for(int j=1;j<=(i*2)-1;j++){ 
 			System.out.print("войм");} 
 		System.out.println(); 
 		} 
 		for(int i=5;i>=1;i--){ 
 			for(int j=5-i;j>=1;j--){ 
 			System.out.print("вово");} 
 			for(int j = (i*2)-1;j>=1;j--){ 
 				System.out.print("войм");} 
 			System.out.println(); 
 		}
	}
}