import java.util.Scanner;

public class practico3_ej9 {
    private static float PI = 3.1416f;

    public static void main (String arg[]) {
        // Crear un método que reciba el radio de un círculo, y retorne su área (radio^2)*PI
        // (utilizar una variable estática para el valor de PI)

        Scanner input = new Scanner(System.in);
        float radio = 0;
        float area = 0;

        // Descripción del programa y pedir datos a usuario
        System.out.println("El programa calcula el área de un círculo, conociendo el radio. ");
        System.out.println("Ingrese el radio del círculo:");
        radio = input.nextFloat();

        // Hacer cálculo y mostrar  resultado
        area = areaCirculo(radio);
        System.out.println("El radio del círculo es " + radio + " y su área es: " + area);
        System.out.println("Fin.");

    }

    public static float areaCirculo (float r) {
        return PI * r * r;
    }

}
