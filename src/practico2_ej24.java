public class practico2_ej24 {
    public static void main (String args[]) {
        //Mostrar los números múltiplos de 3, que se encuentran entre 0 al 40 utilizando un for. Es decir, 12,15,18…

        System.out.println("El programa muestra los números múltiplos de 3, que se encuentran entre 0 y 40:");

        for (int i=1; i<=40; i++) {
            if (i%3==0) {
                System.out.println(i);
            }
        }
        System.out.println("Fin");
    }
}
