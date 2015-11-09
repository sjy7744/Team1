
import java.util.*;
public class Main {
	public static void GUGUDAN(){
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("구구단 입니다.");
		System.out.println("숫자를 입력하세요.");
		num = sc.nextInt();
		System.out.println(num + "단 출력합니다.");
		for(int i = 1; i <10; i ++)
		{
			System.out.println(num +"*" +i +"="+ num*i);
		}
		
	}
	
	public static void main ( String[] args ) {
		
	}

}
