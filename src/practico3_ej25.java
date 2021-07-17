import java.util.Scanner;

public class practico3_ej25 {
    public static void main (String args[]) {
        // Realizar un método que retorne verdadero si el número recibido por parámetro es impar

        Scanner input = new Scanner(System.in);
        int num=0;
        boolean esImpar;

        //Descripción del programa y pedir datos al usuario:
        System.out.println("El programa determina si un número es impar. Ingrese un número:");
        num = input.nextInt();

        // confirmar si el número suministrado es impar e informar al usuario
        esImpar = nImpar(num);
        if (esImpar == true) {
            System.out.println("El número sí es impar.");
        } else {
            System.out.println("El número no es impar.");
        }
        System.out.println("Fin.");
    }

    // Método Número Impar
    public static boolean nImpar (int n){
        if (n%2 != 0) {
            return true;
        } else {
            return false;
        }

    }


}
