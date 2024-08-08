
package Modelo;

public class Producto {
    private String Seleccion;
    private int Cantidad;
    
    public Producto(String Seleccion, int cantidad) {
        this.Seleccion = Seleccion;
        this.Cantidad = cantidad;
    }

    public String getSeleccion() {
        return Seleccion;
    }

    public void setSeleccion(String Seleccion) {
        this.Seleccion = Seleccion;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    
}
