import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		int X = B % 10;
		int Y = (B % 100) / 10;
		int Z = B / 100;
		
		//3번
		System.out.println( A * X );
		
		//4번
		System.out.println( A * Y );
		
		//5번
		System.out.println( A * Z );
		
		//6번
		System.out.println( A * B );
		
		scanner.close();
		
	}
}