import java.util.Scanner;

public class practico2_ej9 {
    public static void main (String args[]) {
        //Pedir un número NUM ingresado por el usuario. Luego muestre los números desde 1 hasta NUM utilizando la instrucción FOR.

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número mayor que cero:");
        int num = input.nextInt();
        System.out.println("Se mostrarán los números desde el 1 hasta el " + num + ":");

        if (num > 0) {
            for (int i = 1; i <=num; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("El número ingresado no es mayor que cero.");
        }

        System.out.println("El programa ha finalizado.");
    }
}
