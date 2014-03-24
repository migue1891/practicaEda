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
public class ClienteStar extends Cliente {
    
    
    private String nombre;
    private int idClienteStar;
    private Producto [] Comprados;
    private int puntos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdClienteStar() {
        return idClienteStar;
    }

    public void setIdClienteStar(int idClienteStar) {
        this.idClienteStar = idClienteStar;
    }

    public Producto[] getComprados() {
        return Comprados;
    }

    public void setComprados(Producto[] Comprados) {
        this.Comprados = Comprados;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public ClienteStar(String nombre, int idClienteStar, Producto[] Comprados, int puntos) {
        this.nombre = nombre;
        this.idClienteStar = idClienteStar;
        this.Comprados = Comprados;
        this.puntos = puntos;
    }
    public ClienteStar(){
    
    }
    
    @Override
    public void mostrarDatos(){
    
        System.out.println(this.idClienteStar);
        System.out.println(this.getNombre());
        System.out.println(this.puntos);        
        
    }
}
