import java.util.Scanner;

public class practico3_ej14 {
    public static void main (String args[]) {
        // Método llamado convertirAMillas, que reciba un entero llamado kilómetros y retorne el equivalente a las millas.
        // Se debe imprimir el valor en millas en pantalla. (1 milla = 1.6 kms).

        Scanner input = new Scanner(System.in);
        float kilometros = 0;
        float millas = 0;

        System.out.println("El programa convierte kilómetros en millas.");
        System.out.println("Ingrese cantidad de kilómetros:");
        kilometros = input.nextFloat();
        millas = convertirAMillas(kilometros);
        System.out.println("La cantidad de millas es: " + millas);
        System.out.println("Fin.");
    }

    public static float convertirAMillas (float kilometros) {
        final float millaUnitaria = 1.6f;
        return kilometros * millaUnitaria;
    }


}
