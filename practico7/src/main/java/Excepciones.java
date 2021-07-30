import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {
    public static void main(String args[]) {

        // Ejemplos de excepciones, uso de try y catch

        JavaUtils.mensajeBienvenida();

        try {
            int numero = JavaUtils.ingresarInteger("Ingrese un número:");

        } catch (InputMismatchException e) {
            System.out.println("Debe ingresar sólo números enteros!");
        } catch (Exception e) {
             System.out.println("Ha ocurrido un error del tipo " + e + ". Contacte un administrador.");
        }

        /*
        Integer[]unArreglo = new Integer[3];
        System.out.println(unArreglo[3]);
        */

         JavaUtils.mensajeFin();
    }


}
