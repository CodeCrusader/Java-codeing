import java.util.*;
public class Input {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = input.nextInt();
		System.out.println("Enter the 2th number");
		int b = input.nextInt();
		int answer = a + b;
		System.out.println(a + (" + ") + b + (" = ") + answer);
		
	}
}
