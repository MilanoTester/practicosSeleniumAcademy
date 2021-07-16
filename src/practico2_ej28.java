public class practico2_ej28 {
    public static void main (String args[]) {
        // Calcula el factorial del número 5.

        System.out.println("El programa calcula el factorial del número 5");
        int factorial = 1;

        for (int i=1; i<=5; i++) {
            factorial = factorial*i;
        }

        System.out.println("El resultado es: " + factorial);
        System.out.println("Fin");
    }
}
