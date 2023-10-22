/**
 * Autor: Nicolás Concuá
 * Fecha: 13/10/2023
 * Carnet: 23197
 * Universidad del Valle de Guatemala
 * Laboratorio 3 Herencia
 */
import java.util.Scanner;
/**
 * La clase `Driver` es la clase principal que inicia la aplicación del torneo de volleyball.
 */
public class Bar{
    /**
     * Método principal para ejecutar la aplicación.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este programa).
     */
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        boolean go = true;
        int opcion = 0;
        Gastos gastos = new Gastos();
        gastos.CargarCSV("InventarioBar.csv");

        while(go){
            PrintMenu();
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    // Buscar un producto por ID
                    System.out.print("Ingrese el ID del producto: ");
                    int idBusqueda = sc.nextInt();
                    Producto productoEncontrado = gastos.buscarProductoPorID(idBusqueda);

                    if (productoEncontrado != null) {
                        System.out.println("Producto encontrado:");
                        productoEncontrado.imprimirDetalles();
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;
                case 2:
                    // Listar categoria de productos
                    System.out.println("Las siguientes categorias estan disponibles: ");
                    System.out.println("Snack");
                    System.out.println("Bebida");
                    System.out.println("Pan");
                    System.out.print("Ingrese la categoria a listar: ");
                    String categoria = sc.next();
                    gastos.listarProductosPorCategoria(categoria);
                    break;
                case 3:
                    // Mostrar las ventas actuales más comisión
                    gastos.mostrarVentasYComision();
                    break;
                case 4:
                    go = false;
                    break;

            }


        }
    }
    public static void PrintMenu(){
        System.out.println("\nBienvenido al bar");
        System.out.println("1. Buscar un producto por ID");
        System.out.println("2. Listar categoria de productos");
        System.out.println("3. Mostrar las ventas actuales más comisión");
        System.out.println("4. Salir");
        System.out.println("Ingrese una opcion: ");
    }
}