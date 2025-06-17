package Objetos;

public class Producto {
    private String codigo;
    private String nombre;
    private String marca;
    private int stock;
    private double precio;

    public Producto() {
    }

    public Producto(String codigo, String nombre, String marca, int stock, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.stock = stock;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío");
        }
        else { //aquí también falta la restricción para que el nombre sea único
            this.nombre = nombre;
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.isEmpty()) {
            throw new IllegalArgumentException("La marca no puede ser nula o vacía");
        }
        else { //aquí también falta la restricción para que la marca sea única
            this.marca = marca;
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo='" + getCodigo() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", Marca='" + getMarca() + '\'' +
                ", Stock=" + getStock() +
                ", precio=" + getPrecio() +
                ", marca='" + getMarca() + '\'' +
                ", stock=" + getStock() +
                '}';
    }
}
