import java.util.Scanner;

public class Tabla {

		    public static void main(String[] args) {
	        Scanner console = new Scanner(System.in);
	        int num;

	        System.out.print("Enter any positive integer: ");
	        num = console.nextInt();

	        System.out.println("Multiplication Table of " + num);

	        int multiplier = 1;
	        while (multiplier <= 10) {
	            int result = num * multiplier;
	            System.out.println(num + " x " + multiplier + " = " + result);
	            multiplier++;
	        }
	    }
}