public class Pan extends Producto{
    private String tamaño;
    private String sabor;

    public Pan(int id, String nombre, int cantidadDisponible, int cantidadVendidos, String estado, int precio, String tamaño, String sabor) {
        super(id, nombre, cantidadDisponible, cantidadVendidos, estado, precio, "Pan");
        this.tamaño = tamaño;
        this.sabor = sabor;
    }

    //Getters
    public String getTamaño() {
        return tamaño;
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
        System.out.println("Tamaño: " + tamaño);
        System.out.println("Sabor: " + sabor);
    }

}
