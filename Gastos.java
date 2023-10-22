import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
public class Gastos {
    private BufferedReader lector;
    private String linea;
    private String partes[] = null;
    private ArrayList<Producto> productos;

    public Gastos() {
        productos = new ArrayList<Producto>();
    }

    public void AgregarProducto(Producto producto) {
        productos.add(producto);
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }
    public Producto buscarProductoPorID(int id) {
        for (Producto producto : productos) {
            if (producto.getId() == id) {
                return producto; // Encuentra el producto con el ID dado
            }
        }
        return null; // Si no se encuentra un producto con el ID
    }
    
    public void listarProductosPorCategoria(String categoria) {
        for (Producto producto : productos) {
            if (producto.getCategoria().equalsIgnoreCase(categoria)) {
                producto.imprimirDetalles(); // Imprime los detalles del producto
            }
        }
    }

    public void mostrarVentasYComision() {
        double ventasTotales = 0;
        double comision = 0.20; // 20% de comisión
    
        for (Producto producto : productos) {
            ventasTotales += (producto.getPrecio() * producto.getCantidadVendidos());
        }
    
        double comisionTotal = ventasTotales * comision;
    
        System.out.println("Ventas totales: " + ventasTotales);
        System.out.println("Comisión (" + (comision * 100) + "%): " + comisionTotal);
    }
    

    //Metodo utilizado en ejercicios anteriores
    public void CargarCSV(String nombreArchivo) {
        try {
            lector = new BufferedReader(new FileReader(nombreArchivo));
            boolean primeraLinea = true;
    
            while ((linea = lector.readLine()) != null) {
                // Divide la línea en partes utilizando el punto y coma como separador
                partes = linea.split(";");
    
                // Si es la primera línea, puedes ignorarla o procesarla como encabezados
                if (primeraLinea) {
                    primeraLinea = false;
                    // Puedes agregar aquí el procesamiento de los encabezados si es necesario.
                    continue; // Saltar la primera línea
                }
    
                // Procesa los datos de cada fila
                int id = Integer.parseInt(partes[0]);
                String nombre = partes[1];
                int cantidadDisponible = Integer.parseInt(partes[2]);
                int cantidadVendidos = Integer.parseInt(partes[3]);
                String estado = partes[4];
                int precio = Integer.parseInt(partes[5]);
                String categoria = partes[6];
    
                // Determina la categoría y crea un producto correspondiente
                if (categoria.equals("Bebida")) {
                    int ml = Integer.parseInt(partes[7]);
                    String tipo = partes[8];
                    Bebida bebida = new Bebida(id, nombre, cantidadDisponible, cantidadVendidos, estado, precio, ml, tipo);
                    AgregarProducto(bebida);
                } else if (categoria.equals("Snack")) {
                    int gramos = Integer.parseInt(partes[9]);
                    String sabor = partes[10];
                    String tamaño = partes[11];
                    Snack snack = new Snack(id, nombre, cantidadDisponible, cantidadVendidos, estado, precio, gramos, sabor, tamaño);
                    AgregarProducto(snack);
                } else if (categoria.equals("Pan")) {
                    String tamaño = partes[9];
                    String sabor = partes[10];
                    Pan pan = new Pan(id, nombre, cantidadDisponible, cantidadVendidos, estado, precio, tamaño, sabor);
                    AgregarProducto(pan);
                }
            }
    
            lector.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
}
