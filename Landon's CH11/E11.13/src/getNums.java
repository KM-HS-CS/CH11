import java.util.Scanner;



public class getNums {
	
	
	public static void main(String[] args) {
		double times = 0;
		int time = 0;
		float total = 0;
		Scanner in = new Scanner(System.in);
		while (times < 2 && time < 3) {
			System.out.printf("\n");
			System.out.println("Please give a floating point number: ");
			try {
				float out = in.nextFloat();
				total += out;
				times = 0;
				time++;
			} catch (Exception error) {
				times++;
				System.out.println("Input Error, not a float");
				in.next();
			}
			
		}
		System.out.println(total);
		in.close();
	}
}
