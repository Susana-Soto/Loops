import java.util.Scanner;
public class Nombre {
	
	      public static void main(String[] args) {
	        Scanner console = new Scanner(System.in);

	        System.out.print("Ingrese un nombre: ");
	        String nombre = console.nextLine();

	        System.out.println("Cada letra del nombre:");
	        for (int i = 0; i < nombre.length(); i++) {
	            char letra = nombre.charAt(i);
	            System.out.println(letra);
	        }
	    }
	}