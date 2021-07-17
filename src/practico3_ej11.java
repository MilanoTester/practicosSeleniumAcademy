import java.util.Scanner;

public class practico3_ej11 {
    public static void main (String args[]) {
        // Crear un método que reciba un número entero, y muestre en pantalla la cantidad de dólares y de euros que representa ese número.

        Scanner input = new Scanner(System.in);
        float pesos = 0;

        // Descripción del programa y pedir datos al usuario
        System.out.println("El programa cambia a dólares y a euros el valor ingresado en pesos.");
        System.out.println("Ingrese el valor en pesos:");
        pesos = input.nextFloat();

        // Hacer cálculo y mostrar resultado
        cambioMoneda(pesos);

        System.out.println("Fin.");
    }

    public static void cambioMoneda (float pesos) {
        float cotizDolar = 44.95f;
        float cotizEuro = 54.72f;

        float cambioDolar = pesos/cotizDolar;
        System.out.println("El valor en dólares es: " + cambioDolar);

        float cambioEuro = pesos/cotizEuro;
        System.out.println("El valor en euros es: " + cambioEuro);

    }



}
