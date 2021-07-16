public class practico2_ej26 {
    public static void main (String args[]) {
        // Calcular la suma de los 10 primeros números naturales

        System.out.println("El programa calcula la suma de los números naturales desde 1 hasta 10:");
        int suma = 0;

        for (int i=0; i<=10; i++) {
            suma = suma + i;
        }

        System.out.println("El resultado es: " + suma);
        System.out.println("Fin");
    }
}
