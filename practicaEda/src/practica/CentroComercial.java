/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica;
import java.util.*;
/**
 *
 * @author Miguel
 */
public class CentroComercial {
   
    private String Nombre;
    private String Direccion;
    private Tienda[] tiendas;
    private Empleado[] empleados;
    private ClienteStar[] clientes;
    private int puertasAcceso;
    private int salEmergencias;
    private int plazasGarage;
    int alquiler;
 
    public CentroComercial(String Nombre, String Direccion, int puertasAcceso, int salEmergencias, int plazasGarage, int tiend, int emp, int client) {
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.puertasAcceso = puertasAcceso;
        this.salEmergencias = salEmergencias;
        this.plazasGarage = plazasGarage;
        this.empleados = new Empleado[emp];
        this.clientes=new ClienteStar[client];
        this.tiendas=new Tienda[tiend];
    }

    public CentroComercial(int emp, int client, int tiend){
        this.empleados = new Empleado[emp];
        this.clientes=new ClienteStar[client];
        this.tiendas=new Tienda[tiend];
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public Tienda[] getTiendas() {
        return tiendas;
    }

    public void setTiendas(Tienda[] tiendas) {
        this.tiendas = tiendas;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }
    public Empleado getEmpleadosIndex(int index) {
        return empleados[index];
    }
    public void setEmpeados(Empleado[] empeados) {
        this.empleados = empeados;
    }

    public ClienteStar[] getClientes() {
        return clientes;
    }

    public void setClientes(ClienteStar[] clientes) {
        this.clientes = clientes;
    }

    public int getPuertasAcceso() {
        return puertasAcceso;
    }

    public void setPuertasAcceso(int puertasAcceso) {
        this.puertasAcceso = puertasAcceso;
    }

    public int getSalEmergencias() {
        return salEmergencias;
    }

    public void setSalEmergencias(int salEmergencias) {
        this.salEmergencias = salEmergencias;
    }

    public int getPlazasGarage() {
        return plazasGarage;
    }

    public void setPlazasGarage(int plazasGarage) {
        this.plazasGarage = plazasGarage;
    }


    public Tienda buscarTienda(String tienda){
        Tienda tiendaSelec = new Tienda();

        for(int ii=0;ii<tiendas.length; ii++){
            if(tienda.equalsIgnoreCase(this.tiendas[ii].getNombre())){
                tiendaSelec=tiendas[ii];
                //Contemplar fallo de tecla del usuario
                mostrarDatosTienda(tiendaSelec);
                return tiendaSelec;
             }
        }
        
        return null;
    }
    
    public void mostrarDatosTienda(Tienda tiendaSelec){
           boolean bandera=false;
           Scanner sc = new Scanner(System.in);

                String respuesta="a";
                while(bandera==false){
                    System.out.println("¿Quieres ver los datos de la tienda "+ tiendaSelec.getNombre() +"? S/N");
                    respuesta= sc.nextLine();
                    if("S".equalsIgnoreCase(respuesta)||"N".equalsIgnoreCase(respuesta)){
                        bandera=true;
                    }
                }
                if(respuesta.equalsIgnoreCase("S")){
                    System.out.println(tiendaSelec.getIdTienda());
                    System.out.println(tiendaSelec.getNombre());
                }else if(respuesta.equalsIgnoreCase("N")){System.out.println("No quieres ver la tienda seleccionada tienda");}
            
            
        }
    
    
    public Tienda[] buscarTiendasDeEmpleado(String nombre){
        Scanner sc = new Scanner(System.in);
        int contador =1;
        for(int i=0; i<this.tiendas.length;i++){
            for(int j=0;j<this.tiendas[i].getEmpleados().length;j++){
                Empleado[] emp = this.tiendas[i].getEmpleados();
                if(nombre.equalsIgnoreCase(emp[j].getNombre())){
                      contador++;
                }
            }
            System.out.println(contador);
       Tienda[] tiendas =new Tienda[contador];
       int contador2=0;
        for(int x=0; x<this.tiendas.length;x++){
            for(int k=0;k<this.tiendas[x].getEmpleados().length;k++){
                Empleado[] emp1 = this.tiendas[x].getEmpleados();
                if(nombre.equalsIgnoreCase(emp1[k].getNombre())){
                      tiendas[contador2]=this.tiendas[i];
                      contador2++;
                }
            }
        } 
        boolean bandera=false;
        String respuesta="a";
                while(bandera==false){
                    System.out.println("¿Quieres ver los datos de alguna de las tiendas donde trabaja "+ nombre +"? S/N");
                    respuesta= sc.nextLine();
                    if("S".equalsIgnoreCase(respuesta)||"N".equalsIgnoreCase(respuesta)){
                        bandera=true;
                    }
                }
                if(respuesta.equalsIgnoreCase("S")){
            for (Tienda tienda : tiendas) {
                System.out.println(tienda.getNombre());
                mostrarDatosTienda(tienda);
            }
                }
        }
        
        return tiendas;
    }
    public Tienda[] obtenerTiendasPorMarca(String marca){
        Scanner sc = new Scanner(System.in);
        Tienda[] tienda =new Tienda[this.tiendas.length];
        int contador=0;
          for(int i=0; i<this.tiendas.length;i++){
            
             Catalogo cat[] =tiendas[i].getCatalogos();
            for(int j=0;j<cat.length;j++){
                
                if(marca.equalsIgnoreCase(cat[j].getMarca())){
                    tienda[contador]=this.tiendas[i];
                    contador++;
                }
            }
            }
          boolean bandera=false;
        String respuesta="a";
                while(bandera==false){
                    System.out.println("¿Quieres ver los datos de alguna de las tiendas donde trabaja? S/N");
                    respuesta= sc.nextLine();
                    if("S".equalsIgnoreCase(respuesta)||"N".equalsIgnoreCase(respuesta)){
                        bandera=true;
                    }
                }
                if(respuesta.equalsIgnoreCase("S")){
                    for(int x=0; x<tiendas.length;x++){
                        System.out.println(tiendas[x].getNombre());
                        mostrarDatosTienda(tiendas[x]);
                    }
                }
          return tienda;
    }
    
    public Empleado[] obtenerEmpleadosCentro(){
//            Empleado[] listaEmpleados=new Empleado[this.getEmpleados().length];
//
//            for(int i=0;i<this.getEmpleados().length;i++){
//                    listaEmpleados[i]=this.getEmpleadosIndex(i);
//            }
        
        return this.getEmpleados();
    }
    public Empleado[] obtenerTodosLosEmpleados(){
    	Empleado []  listaEmpleados;
        int contador=0;
        contador=this.getEmpleados().length;
      
    	for(int j=0; j<this.getTiendas().length;j++){
    		contador +=this.tiendas[j].getEmpleados().length;
          
             
                
              }
              
              listaEmpleados = new Empleado[contador];
              contador=0;
        for(int i=0;i<this.getEmpleados().length;i++){
                     listaEmpleados[i]=this.getEmpleadosIndex(i);
                     contador++;
            }
        for(int j=0; j<this.getTiendas().length;j++){
            Empleado []emp=this.tiendas[j].getEmpleados();
        
            for(int x=0;x<emp.length;x++){
                listaEmpleados[contador]=emp[x];
                contador++;
            }
        }
        
        
        return listaEmpleados;
    }
   
    public Empleado[]obtenerEmpleadosMayorSueldo(){
    
        Empleado []  todEmpleados = obtenerTodosLosEmpleados();
        Empleado[]empleadosAdinerados=new Empleado[5];
        Empleado aux;    
        int i, j;
         for(i=0;i<todEmpleados.length-1;i++)
              for(j=0;j<todEmpleados.length-i-1;j++)
                   if(todEmpleados[j+1].getSueldo()<todEmpleados[j].getSueldo()){
                      aux=todEmpleados[j+1];
                      todEmpleados[j+1]=todEmpleados[j];
                      todEmpleados[j]=aux;
                   }
         for(int x=0; x<5; x++){
             empleadosAdinerados[x]=todEmpleados[x];
         }
        return empleadosAdinerados;
    }
}
