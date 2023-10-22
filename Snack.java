public class Snack extends Producto {
    private int gramos;
    private String sabor;
    private String tamaño;

    public Snack(int id, String nombre, int cantidadDisponible, int cantidadVendidos, String estado, int precio, int gramos, String sabor, String tamaño) {
        super(id, nombre, cantidadDisponible, cantidadVendidos, estado, precio, "Snack");
        this.gramos = gramos;
        this.sabor = sabor;
        this.tamaño = tamaño;
    }

    //Getters
    public int getGramos() {
        return gramos;
    }
    public String getSabor() {
        return sabor;
    }
    public String getTamaño() {
        return tamaño;
    }

    @Override
    public void imprimirDetalles() {
        // Implementa cómo imprimir los detalles específicos de un snack
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Cantidad Disponible: " + getCantidadDisponible());
        System.out.println("Cantidad Vendidos: " + getCantidadVendidos());
        System.out.println("Estado: " + getEstado());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Gramos: " + gramos);
        System.out.println("Sabor: " + sabor);
        System.out.println("Tamaño: " + tamaño);
    }
}
