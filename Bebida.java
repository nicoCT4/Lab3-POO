public class Bebida extends Producto {
    private int ml;
    private String tipo;

    public Bebida(int id, String nombre, int cantidadDisponible, int cantidadVendidos, String estado, int precio, int ml, String tipo) {
        super(id, nombre, cantidadDisponible, cantidadVendidos, estado, precio, "Bebida");
        this.ml = ml;
        this.tipo = tipo;
    }

    //Getters
    public int getMl() {
        return ml;
    }
    public String getTipo() {
        return tipo;
    }

    @Override
    public void imprimirDetalles() {
        // Implementa cómo imprimir los detalles específicos de una bebida
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Cantidad Disponible: " + getCantidadDisponible());
        System.out.println("Cantidad Vendidos: " + getCantidadVendidos());
        System.out.println("Estado: " + getEstado());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Mililitros: " + ml);
        System.out.println("Tipo: " + tipo);
    }

    
}
