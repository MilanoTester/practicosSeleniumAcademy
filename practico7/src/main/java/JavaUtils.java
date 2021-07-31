import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaUtils {

    // Mensaje de Bienvenida
    public static void mensajeBienvenida() {
        System.out.println("Bienvenido al programa!");
    }

    public static void mensajeFin() {
        System.out.println("El programa ha finalizado.");
    }

    public static int ingresarInteger(String unMensaje) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        try {
            System.out.println(unMensaje);
            num = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error! Debía ingresar un número entero. Comuníquese con el Administrador.");
        }
        return num;
    }

    public static float ingresarFloat(String unMensaje) {
        Scanner input = new Scanner(System.in);
        float num = 0f;
        try {
            System.out.println(unMensaje);
            num = input.nextFloat();
        } catch (InputMismatchException e){
            System.out.println("Error! Debía ingresar un número entero o decimal. Comuníquese con el Administrador.");
        }
        return num;
    }

    public static double ingresarDouble(String unMensaje) {
        Scanner input = new Scanner(System.in);
        double num = 0d;
        try {
            System.out.println(unMensaje);
            num = input.nextDouble();
        } catch (InputMismatchException e){
            System.out.println("Error! Debía ingresar un número entero o decimal. Comuníquese con el Administrador.");
        }
        return num;
    }

    public static String ingresarString(String unMensaje) {
        Scanner input = new Scanner(System.in);
        System.out.println(unMensaje);
        String mensaje = input.nextLine();
        return mensaje;
    }

    public static boolean ingresarBooleano(String unMensaje) {
        Scanner input = new Scanner(System.in);
        String opcion = "";
        boolean valorBooleano = false;
        int variable = 0;

        while (variable == 0){
            System.out.println(unMensaje);
            opcion = input.nextLine();

            if (opcion.equalsIgnoreCase("s")) {
                valorBooleano = true;
                variable = 1;
            } else if (opcion.equalsIgnoreCase("n")){
                valorBooleano = false;
                variable = 1;
            }

        }
        return valorBooleano;
    }


}
