import java.util.Scanner;

public class practico3_ej5 {
    public static void main (String args[]) {
        // Método que reciba un número entero y un número double, y retorne su multiplicación. Que tipo de retorno tiene este método?

        Scanner input = new Scanner(System.in);
        int num1 = 0;
        double num2 = 0;
        double multiplicacion = 0;

        // Descripción del programa y pedir datos al usuario
        System.out.println("El programa calcula la multiplicación de un número entero y un número con decimales.");
        System.out.println("Ingrese un número entero:");
        num1 = input.nextInt();
        System.out.println("Ingrese un número con decimales:");
        num2 = input.nextDouble();

        multiplicacion = multiplicaN1N2(num1, num2);
        System.out.println("El resultado es: " + multiplicacion);
        System.out.println("Fin.");

    }

    public static double multiplicaN1N2 (int n1, double n2) {
        return n1*n2;
    }

}
