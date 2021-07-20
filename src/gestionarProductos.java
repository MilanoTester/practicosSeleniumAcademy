import java.util.Scanner;

public class gestionarProductos {
    public static void main(String args []) {
        // Se debe crear una clase llamada GestionarProductos que permita crear 3 productos
        // Cuando termine el ingreso de los productos, se debe mostrar todos los productos en pantalla

        Scanner input = new Scanner(System.in);
        System.out.println("El sistema permite el registro de 3 productos.");


        // Pedir datos al usuario  y crear producto 1
        System.out.println("Producto 1 - Ingrese el nombre:");
        String nombre1 = input.nextLine();

        System.out.println("Producto 1 - Ingrese el código:");
        int codigo1 = input.nextInt();
        input.nextLine();

        System.out.println("Producto 1 - Ingrese el Nro de lote:");
        String nroLote1 = input.nextLine();

        System.out.println("Producto 1 - El producto es importado? Indique (s)i o (n)o:");
        String respuestaImportado = input.nextLine();
        boolean esImportado1 = false;
        if (respuestaImportado.equals("s")) {
            esImportado1 = true;
        } else if (respuestaImportado.equals("n")) {
            esImportado1 = false;
        }

        Producto producto1 = new Producto(nombre1, codigo1, esImportado1, nroLote1);
        int idProducto1 = producto1.getNROPRODUCTO();


        // Pedir datos al usuario  y crear producto 2
        System.out.println("Producto 2 - Ingrese el nombre:");
        String nombre2 = input.nextLine();

        System.out.println("Producto 2 - Ingrese el código:");
        int codigo2 = input.nextInt();
        input.nextLine();

        System.out.println("Producto 2 - Ingrese el Nro de lote:");
        String nroLote2 = input.nextLine();

        System.out.println("Producto 2 - El producto es importado? Indique (s)i o (n)o:");
        respuestaImportado = input.nextLine();
        boolean esImportado2 = false;
        if (respuestaImportado.equals("s")) {
            esImportado2 = true;
        } else if (respuestaImportado.equals("n")) {
            esImportado2 = false;
        }

        Producto producto2 = new Producto(nombre2, codigo2, esImportado2, nroLote2);
        int idProducto2 = producto2.getNROPRODUCTO();


        // Pedir datos al usuario  y crear producto 3
        System.out.println("Producto 3 - Ingrese el nombre:");
        String nombre3 = input.nextLine();

        System.out.println("Producto 3 - Ingrese el código:");
        int codigo3 = input.nextInt();
        input.nextLine();

        System.out.println("Producto 3 - Ingrese el Nro de lote:");
        String nroLote3 = input.nextLine();

        System.out.println("Producto 3 - El producto es importado? Indique (s)i o (n)o:");
        respuestaImportado = input.nextLine();
        boolean esImportado3 = false;
        if (respuestaImportado.equals("s")) {
            esImportado3 = true;
        } else if (respuestaImportado.equals("n")) {
            esImportado3 = false;
        }

        Producto producto3 = new Producto(nombre3, codigo3, esImportado3, nroLote3);
        int idProducto3 = producto3.getNROPRODUCTO();

        // Mostrar en pantalla los 3 productos
        System.out.println("Estos son los productos ingresados:");
        System.out.println(producto1);
        System.out.println(producto2);
        System.out.println(producto3);
        System.out.println("Fin");


    }

}
