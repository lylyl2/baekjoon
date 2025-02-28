import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		int D = A * 60 + B + C;
		
		A = D / 60;
		B = D % 60;
		
		if (A > 23) {
			A = A - 24;
		}
		
		System.out.println(A + " " + B);
		
		scan.close();
		
	}
}
