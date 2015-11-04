
public class Main {

	public static void main ( String[] args ) {
		drawDiamond();
	}
	public static void drawDiamond(){
		System.out.println("Hello Git!");
		for(int i=1;i<=4;i++){
			for(int j=1;j<=5-i;j++){
			System.out.print("¡¡");}
			for(int j=1;j<=(i*2)-1;j++){
			System.out.print("¡ß");}
		System.out.println();
		}
		for(int i=5;i>=1;i--){
			for(int j=5-i;j>=1;j--){
			System.out.print("¡¡");}
			for(int j = (i*2)-1;j>=1;j--){
				System.out.print("¡ß");}
			System.out.println();
		}
	}
}