package practica;

import edalib.list.singlelink.SQueue;
import edalib.list.singlelink.SStack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miguelgt
 */
public class Mostrador {
    SStack<Producto>  estanteria = new SStack<Producto>();
    SQueue<Producto>  perchero = new SQueue<Producto>();
    
    
    //AQUI HAY QUE PENSAR COMO CREO LAS ESTANTERIA Y LOS PERCHEROs...A Traves del stock?
    
    public void ordenarPerchero(){}
    public void ordenarEstanteria(){}
}
