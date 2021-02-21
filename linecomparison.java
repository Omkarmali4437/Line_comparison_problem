import java.util.Scanner;

public class linecomparison {
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Problem");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter x1 co-ordinate: ");
		int x1=scan.nextInt();
		System.out.println("Enter y1 co-ordinate: ");
      int y1=scan.nextInt();
		System.out.println("Enter x2 co-ordinate: ");
      int x2=scan.nextInt();
		System.out.println("Enter y2 co-ordinate: ");
      int y2=scan.nextInt();
		scan.close();
		int length=(int)Math.sqrt((Math.pow(x2-x1,2)) + (Math.pow(y2-y1,2)));
		System.out.println("Length of line is: "+length);
	}
}
