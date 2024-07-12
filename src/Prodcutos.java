public class Prodcutos {
    String código_producto;
    String nombre;
    String descripción;
    double precio;
    int cantidad;
    String categoría;

    public Prodcutos(String código_producto, String nombre, String descripción, double precio, int cantidad, String categoría) {
        this.código_producto = código_producto;
        this.nombre = nombre;
        this.descripción = descripción;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoría = categoría;
    }

    public String getCódigo_producto() {
        return código_producto;
    }

    public void setCódigo_producto(String código_producto) {
        this.código_producto = código_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCategoría() {
        return categoría;
    }

    public void setCategoría(String categoría) {
        this.categoría = categoría;
    }
}


