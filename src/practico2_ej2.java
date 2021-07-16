import java.util.Scanner;

public class practico2_ej2 {
    public static void main (String args[]) {
        //Esto es un ejemplo de comentario, JAVA no lo lee....
        /*
        Esto es un ejemplo de comentario, Java no lo lee,
        esto tampoco lo lee
        */

        //Ejercicio: Pedir el ingreso del nombre y el año de nacimiento. Mostrar el nombre y la edad de la persona.

        Scanner input = new Scanner(System.in);
        String nombre = "";
        int año = 0;
        System.out.println("Ingrese su nombre");
        nombre = input.nextLine();
        System.out.println("Ingrese su año de nacimiento");
        año = input.nextInt();

        int edad = 2020-año;
        System.out.println("Su nombre es "+ nombre +" y su edad es "+ edad);

        System.out.println("El programa ha finalizado");

    }

}
