
public class Main {

	public static void main ( String[] args ) {
		int factorial = 5;
		System.out.println(factorial+"! is " + calculateFactorial(factorial));
	}
	
	// method return inputted number��s factorial result.
	public static int calculateFactorial(int factorial){
		if(factorial<0)//���� �� ��
			if(factorial%2==0)//¦���� ����
				return calculateFactorial(factorial+1)*factorial*-1;
			else//Ȧ���� ����
			return calculateFactorial(factorial+1)*factorial;
		
		else if(factorial-1!=0 && factorial>=1)//���
			return calculateFactorial(factorial-1)*factorial;
		else//0!=1
			return 1; //0!=1
	}
}