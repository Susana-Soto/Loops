public class Fibonacci {

    public static void main(String[] args) {
        int n = 10; // Cambiar 'n' para generar más términos de la serie
        System.out.println("Serie de Fibonacci con " + n + " términos:");
        generateFibonacciSeries(n);
    }

    public static void generateFibonacciSeries(int n) {
        int Term1 = 0, Term2 = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(Term1+ " ");
            int Term = Term1 + Term2;
            Term1 = Term2;
            Term2 = Term;
        }
    }
}
        
       