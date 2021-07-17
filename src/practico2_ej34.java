import java.util.Scanner;

public class practico2_ej34 {
    public static void main (String args[]) {
        // Pedir el ingreso de números hasta que se ingrese 0 y se muestre el promedio de los mismos.

        Scanner input = new Scanner(System.in);
        int num=1;
        int contador=0;
        int suma=0;
        float promedio=0;
        boolean muestrares=false;

        System.out.println("El programa calcula el promedio de los números ingresados por el usuario. Ingrese cero para finalizar.");
         while (num!=0) {
             System.out.println("Ingrese un número:");
             num = input.nextInt();

             if (num!=0) {
                 suma = suma + num;
                 contador++;
                 promedio = suma/contador;
                 muestrares=true;
             }

         }

         if (muestrares==true) {
             System.out.println("El promedio de los números ingresados  es: " + promedio);
         } else {
             System.out.println("Se ha ingresado el número cero");
         }

         System.out.println("Fin.");

    }
}
