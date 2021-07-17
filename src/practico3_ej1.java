import java.util.Scanner;

public class practico3_ej1 {
    public static void main (String args[]) {
        // Escribir un método que reciba un número y retorne su doble

        Scanner input = new Scanner(System.in);
        int nUsuario=0;
        int nDoble = 0;

        System.out.println("El programa calcula el doble de un número ingresado por el usuario.");
        System.out.println("Ingrese un número:");
        nUsuario = input.nextInt();

        nDoble = dobleNum(nUsuario);
        System.out.println("El doble del número ingresado es: " + nDoble);
        fin();

    }
        // Calcular el doble de un número
        public static int dobleNum (int num) {
            return num * 2;
        }

        // Mensaje fin del programa
        public static void fin() {
            System.out.println("Fin.");
        }

}
