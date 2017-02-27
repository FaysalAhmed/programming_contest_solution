import java.util.Scanner;

public class DCP_13 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int testcases = scan.nextInt();
		
		while(testcases != 0) {
			int b1 = scan.nextInt() + scan.nextInt();
			int b2 = scan.nextInt() + scan.nextInt();
			int p1 = scan.nextInt() + scan.nextInt();
			int p2 = scan.nextInt() + scan.nextInt();
			if((b1-p1) > 0 && (b2-p2) > 0) {
				System.out.println("Banglawash");
			} else {
				System.out.println("Miss");
			}
			testcases--;
		}
	}

	
}