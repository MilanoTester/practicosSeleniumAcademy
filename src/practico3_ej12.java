import java.util.Scanner;

public class practico3_ej12 {
    private static float sueldo = 0;
    private static float iva = 0;

    public static void main (String args[]) {
        // Realizar un método llamado calcularIva, que calcule el IVA (22%) dado un número float llamado sueldo, recibido por parámetro.
        // Sugerencia: utilizar variables estáticas.

        Scanner input = new Scanner(System.in);
        // Descripción del programa y pedir datos al usuario
        System.out.println("El programa calcula el iva de una cantidad determinada.");
        System.out.println("Ingrese el valor al cual se le calculará iva:");
        sueldo = input.nextFloat();

        // Hacer cálculo y mostrar resultado
        iva = calcularIva(sueldo);
        System.out.println("El monto ingresado es: " + sueldo + " y el iva calculado es: " + iva);
        System.out.println("Fin.");


    }

    public static float calcularIva (float sueldo) {
        final float porcentajeIva = 22f;
        return sueldo * porcentajeIva/100;
    }


}
