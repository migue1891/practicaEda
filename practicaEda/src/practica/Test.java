package practica;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miguel
 */

public class Test {
    
    protected CentroComercial cc; 
    
    public CentroComercial generarCentroComercial(){
        
       
        
        Empleado empCentro1=new Empleado();
        Empleado empCentro2=new Empleado();
        Empleado empCentro3=new Empleado();
        Empleado empCentro4=new Empleado();
        Empleado empCentro5=new Empleado();
        Empleado empCentro6=new Empleado();
        Empleado empCentro7=new Empleado();
        Empleado empCentro8=new Empleado();
        
        Empleado [] empleados = new Empleado[8];
        
        empCentro1.setNombre("Juan");
        empCentro2.setNombre("Ana");
        empCentro3.setNombre("Maria");
        empCentro4.setNombre("Nieves");
        empCentro5.setNombre("Emilio");
        empCentro6.setNombre("Pepe");
        empCentro7.setNombre("Antonio");
        empCentro8.setNombre("Laura");
     
        
        Empleado[] empleadosTien1 = new Empleado[2];
        Empleado empTiend11=new Empleado();
        Empleado empTiend12=new Empleado();
        
        Empleado[] empleadosTien2 = new Empleado[2];
        Empleado empTiend21=new Empleado();
        Empleado empTiend22=new Empleado();
        
        
        Empleado[] empleadosTien3 = new Empleado[2];
        Empleado empTiend31=new Empleado();
        Empleado empTiend32=new Empleado();
        
        Empleado[] empleadosTien4 = new Empleado[2];
        Empleado empTiend41=new Empleado();
        Empleado empTiend42=new Empleado();
        
        
        Catalogo[] catalogo1 = new Catalogo[3];
        Catalogo[] catalogo2 = new Catalogo[3];
        Catalogo[] catalogo3 = new Catalogo[3];
        Catalogo[] catalogo4 = new Catalogo[3];
        
        Catalogo catalogo11=new Catalogo();
        Catalogo catalogo12=new Catalogo();
        Catalogo catalogo13=new Catalogo();
        
        Catalogo catalogo21=new Catalogo();
        Catalogo catalogo22=new Catalogo();
        Catalogo catalogo23=new Catalogo();
        
        Catalogo catalogo31=new Catalogo();
        Catalogo catalogo32=new Catalogo();
        Catalogo catalogo33=new Catalogo();
        
        Catalogo catalogo41=new Catalogo();
        Catalogo catalogo42=new Catalogo();
        Catalogo catalogo43=new Catalogo();
        
        
        empTiend11.setNombre("Escandalo");
        empTiend12.setNombre("Catillo");
        
        empTiend21.setNombre("Maliea");
        empTiend22.setNombre("Olga");
        
        empTiend31.setNombre("Catillo");
        empTiend32.setNombre("Tumulto");
        
        empTiend41.setNombre("Escandalo");
        empTiend42.setNombre("Casto");
        
        
        empleadosTien1[0] =empTiend11;
        empleadosTien1[1]=empTiend12;
        
        empleadosTien2[0]=empTiend21;
        empleadosTien2[1]=empTiend22;
        
        empleadosTien3[0]=empTiend31;
        empleadosTien3[1]=empTiend32;
        
        empleadosTien4[0]=empTiend41;
        empleadosTien4[1]=empTiend42;
        
        empCentro1.setSueldo(1000);
        empCentro2.setSueldo(1200);
        empCentro3.setSueldo(3400);
        empCentro4.setSueldo(1300);
        empCentro5.setSueldo(1600);
        empCentro6.setSueldo(700);
        empCentro7.setSueldo(2000);
        empCentro8.setSueldo(4000);
        
           
        empleados[0]=empCentro1;
        empleados[1]=empCentro2;
        empleados[2]=empCentro3;
        empleados[3]=empCentro4;
        empleados[4]=empCentro5;
        empleados[5]=empCentro6;
        empleados[6]=empCentro7;
        empleados[7]=empCentro8;
        
        catalogo11.setMarca("Nike");
        catalogo12.setMarca("Adidas");
        catalogo13.setMarca("Rebook");
    
        catalogo21.setMarca("Nike");
        catalogo22.setMarca("Puma");
        catalogo23.setMarca("Volcom");
        
        catalogo31.setMarca("Polo");
        catalogo32.setMarca("Lacoste");
        catalogo33.setMarca("Adidas");
        
        catalogo41.setMarca("Polo");
        catalogo42 .setMarca("Viento");
        catalogo43.setMarca("Rebook");
       
        
      
        catalogo1[0]=catalogo11;
        catalogo1[1]=catalogo12;
        catalogo1[2]=catalogo13;
        
        catalogo2[0]=catalogo21;
        catalogo2[1]=catalogo22;
        catalogo2[2]=catalogo23;
        
        catalogo3[0]=catalogo31;
        catalogo3[1]=catalogo32;
        catalogo3[2]=catalogo33;
               
        catalogo4[0]=catalogo41;
        catalogo4[1]=catalogo42;
        catalogo4[2]=catalogo43;
        
        Tienda tiendas[] = new Tienda[4];
        
        Tienda tienda1=new Tienda();
        Tienda tienda2=new Tienda();
        Tienda tienda3=new Tienda();
        Tienda tienda4=new Tienda();
        
        tienda1.setNombre("deportes Z");
        tienda1.setCatalogos(catalogo1);
        tienda1.setEmpleados(empleadosTien1);
        
        tienda2.setNombre("deportes k");
        tienda2.setAlquiler(1000);
        tienda2.setCatalogos(catalogo2);
        tienda2.setEmpleados(empleadosTien2);
        
        tienda3.setNombre("elegant");
        tienda3.setAlquiler(3000);
        tienda3.setCatalogos(catalogo3);
        tienda3.setEmpleados(empleadosTien3);
        
        tienda4.setNombre("sport");
        tienda4.setAlquiler(2000);
        tienda4.setCatalogos(catalogo4);
        tienda4.setEmpleados(empleadosTien4);
        
        tiendas[0]=tienda1;
        tiendas[1]=tienda2;
        tiendas[2]=tienda3;
        tiendas[3]=tienda4;
        
        CentroComercial centro = new CentroComercial(8,4,4);
        centro.setNombre("Buenos Dias");
        centro.setTiendas(tiendas);
        centro.setEmpeados(empleados);
       
        return centro;
    }
   public  void comprobarCentroComercial(){
       CentroComercial centro = generarCentroComercial();
       centro.buscarTienda("deportes Z");
       centro.buscarTiendasDeEmpleado("Escandalo");
       
       Empleado[] listaEmpleados = centro.obtenerTodosLosEmpleados();
       
      
       for(int i=0;i<listaEmpleados.length;i++){
            System.out.println(i+" " +listaEmpleados[i].getNombre());
       }
       
       Empleado[] ricos=centro.obtenerEmpleadosMayorSueldo();
   
       for(int j=0;j<ricos.length;j++){
            System.out.println(ricos[j].getNombre());
       }
   }
   
   public void test1(){
       cc=generarCentroComercial();
       comprobarCentroComercial();
   }
   public static void main(String[] args) { 
            Test t = new Test();    
            t.test1(); 
    } 
       
    
}
