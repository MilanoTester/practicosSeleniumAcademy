import java.util.Scanner;

public class practico3_ej18 {
    public static void main (String args[]) {
        // Realizar un método llamado validarNumero, que reciba 4 parámetros:
        // a) Un mensaje a mostrar: mensaje
        // b) Un mensaje de error: error
        // c) Un entero llamado: mínimo
        // d) Un entero llamado: máximo
        // Se debe pedir el ingreso de números indicando el mensaje por parámetro para solicitar el número.
        // En caso de que se ingrese un número fuera del rango, mostrar el mensaje de error y pedir que reingrese un número que se
        // encuentre dentro del rango.
        // El método debe retornar un entero que se encuentre dentro del rango comprendido entre el máximo y el mínimo.

        Scanner input = new Scanner(System.in);
        int min = 0;
        int max = 0;
        String mensaje = "";
        String error = "";
        int numeroValido = 0;

        System.out.println("El programa valida si un número se encuentra dentro de un intervalo.");
        System.out.println("Ingrese el valor mínimo del intervalo:");
        min = input.nextInt();
        System.out.println("Ingrese el valor máximo del intervalo:");
        max = input.nextInt();

        numeroValido = validarNumero("Ingrese el número a validar:", "Error: número fuera de intervalo. Reingrese:", min, max);
        System.out.println("Este número está dentro del intervalo: " + numeroValido);
        System.out.println("Fin.");
    }

    public static int validarNumero (String mensaje, String error, int min, int max) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        System.out.println(mensaje);
        num = input.nextInt();

        while ((num < min) || (num > max)) {
            System.out.println(error);
            num = input.nextInt();
        }
        return num;
    }

}
