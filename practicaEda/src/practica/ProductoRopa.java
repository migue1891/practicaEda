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
public class ProductoRopa extends Producto{
    
    private String color;
    private String talla;
    private int idMostrador;

    
    public ProductoRopa(int idProducto) {
        super(idProducto);
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }
    
    
     public int getIdMostrador() {
        return idMostrador;
    }

    public void setIdMostrador(int idMostrador) {
        this.idMostrador = idMostrador;
    }
    
}
