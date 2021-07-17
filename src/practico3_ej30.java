import java.util.Scanner;

public class practico3_ej30 {
    private static int añoActual = 2021;
    private static int limiteEdad = 18;

    public static void main (String args[]) {
        // Dado un año de nacimiento, retorne verdadero si la persona tiene 18 años o más, y falso si han pasado menos años.
        // Sugerencia: usar una variable estática.

        Scanner input = new Scanner(System.in);
        int añoNacimiento = 0;
        boolean mayorQue18;

        System.out.println("El sistema determina si una persona tiene 18 años o más.");
        System.out.println("Ingrese su año de nacimiento:");
        añoNacimiento = input.nextInt();
        mayorQue18 = mayorQue18(añoNacimiento);

        if (mayorQue18 == true) {
            System.out.println("La persona tiene 18 años o más.");
        } else {
            System.out.println("La persona tiene menos de 18 años.");
        }
        System.out.println("Fin.");
    }

    public static boolean mayorQue18 (int añoNacimiento) {
        if (añoActual-añoNacimiento >= limiteEdad) {
            return true;
        } else {
            return false;
        }

    }

}
