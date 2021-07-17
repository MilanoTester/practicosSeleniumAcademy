import java.util.Scanner;

public class practico3_ej17 {
    public static void main (String args[]) {
        // Crear un método llamado factorial que reciba un número y retorne el factorial de ese número.
        // Ej. si el número recibido es 5, se deberá retornar el siguiente valor: 5*4*3*2*1.
        // Sugerencia: utilizar un acumulador.

        Scanner input = new Scanner(System.in);
        int num = 0;
        int factorial = 0;

        System.out.println("El programa calcula el factorial de un número dado.");
        System.out.println("Ingrese el número de interés:");
        num = input.nextInt();
        factorial = factorial(num);
        System.out.println("El resultado es: " + factorial);
        System.out.println("Fin.");

    }

    public static int factorial (int num) {
        int multiplicacion = 1;
        for (int i=1; i <= num; i++) {
            multiplicacion = multiplicacion * i;
        }
        return multiplicacion;
    }

}
