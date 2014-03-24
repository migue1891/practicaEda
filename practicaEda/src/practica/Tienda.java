/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica;

/**
 *
 * @author Miguel
 */
public class Tienda {

    private String nombre;
    private int idTienda;
    private float area;
    private Empleado[] empleados = new Empleado[10];
    private Catalogo[] catalogos = new Catalogo[10];
    private Producto [] Stock = new Producto[20];
    private int  alquiler;
    private boolean estado;

    public Tienda(String nombre, int idTienda, float area, int alquiler, boolean estado) {
        this.nombre = nombre;
        this.idTienda = idTienda;
        this.area = area;
        this.alquiler = alquiler;
        this.estado = estado;
        
    }

    public Tienda() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdTienda() {
        return idTienda;
    }

    public void setIdTienda(int idTienda) {
        this.idTienda = idTienda;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public Catalogo[] getCatalogos() {
        return catalogos;
    }

    public void setCatalogos(Catalogo[] catalogos) {
        this.catalogos = catalogos;
    }

    public Producto[] getStock() {
        return Stock;
    }

    public void setStock(Producto[] Stock) {
        this.Stock = Stock;
    }

    public float getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(int alquiler) {
        this.alquiler = alquiler;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }


}
