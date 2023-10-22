public class Pan extends Producto{
    private String tamanio;
    private String sabor;

    public Pan(int id, String nombre, int cantidadDisponible, int cantidadVendidos, String estado, int precio, String tamanio, String sabor) {
        super(id, nombre, cantidadDisponible, cantidadVendidos, estado, precio, "Pan");
        this.tamanio = tamanio;
        this.sabor = sabor;
    }

    //Getters
    public String getTamanio() {
        return tamanio;
    }
    public String getSabor() {
        return sabor;
    }

    @Override
    public void imprimirDetalles() {
        // Implementa cómo imprimir los detalles específicos de un pan
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Cantidad Disponible: " + getCantidadDisponible());
        System.out.println("Cantidad Vendidos: " + getCantidadVendidos());
        System.out.println("Estado: " + getEstado());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Tamaño: " + tamanio);
        System.out.println("Sabor: " + sabor);
    }

}
