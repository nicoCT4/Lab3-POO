public abstract class Producto {
    protected int id;
    protected String nombre;
    protected int cantidadDisponible;
    protected int cantidadVendidos;
    protected String estado;
    protected int precio;
    protected String categoria;

    public Producto(int id, String nombre, int cantidadDisponible, int cantidadVendidos, String estado, int precio, String categoria) {
        this.id = id;
        this.nombre = nombre;
        this.cantidadDisponible = cantidadDisponible;
        this.cantidadVendidos = cantidadVendidos;
        this.estado = estado;
        this.precio = precio;
        this.categoria = categoria;
    }

    //Getters
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public int getCantidadDisponible() {
        return cantidadDisponible;
    }
    public int getCantidadVendidos() {
        return cantidadVendidos;
    }
    public String getEstado() {
        return estado;
    }
    public double getPrecio() {
        return precio;
    }
    public String getCategoria() {
        return categoria;
    }
    public String toString() {
        return "ID: " + id + "\n" +
            "Nombre: " + nombre + "\n" +
            "Cantidad disponible: " + cantidadDisponible + "\n" +
            "Cantidad vendidos: " + cantidadVendidos + "\n" +
            "Estado: " + estado + "\n" +
            "Precio: " + precio + "\n";
    }

    //Metodos Abstractos
        public abstract void imprimirDetalles();
}
