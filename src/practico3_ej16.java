import java.util.Scanner;

public class practico3_ej16 {
    public static void main (String args[]) {
        // Crear un método llamado tipoTriangulo, que dado 3 valores enteros recibidos por parámetro, imprima en pantalla si es escaleno,
        // si es equilátero o isósceles.

        Scanner input = new Scanner(System.in);
        int ladoA = 0;
        int ladoB = 0;
        int ladoC = 0;

        System.out.println("El programa determina si un triángulo es equilátero, isósceles o escaleno.");
        System.out.println("Ingrese el valor de un lado:");
        ladoA = input.nextInt();
        System.out.println("Ingrese el valor del segundo lado:");
        ladoB = input.nextInt();
        System.out.println("Ingrese el valor del último lado:");
        ladoC = input.nextInt();

        tipoTriangulo(ladoA, ladoB, ladoC);
        System.out.println("Fin.");
    }

    public static void tipoTriangulo (int ladoA, int ladoB, int ladoC) {
        if ((ladoA == ladoB) && (ladoB == ladoC) && (ladoA == ladoC)) {
            System.out.println("El triángulo es equilátero.");
        } else if ((ladoA != ladoB) && (ladoB != ladoC) && (ladoA != ladoC)) {
            System.out.println("El triángulo es escaleno.");
        } else {
            System.out.println("El triángulo es isósceles.");
        }
    }


}
