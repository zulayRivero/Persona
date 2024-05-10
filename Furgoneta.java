package concesionario;

import java.util.Scanner;

public class Furgoneta extends Vehiculo {

    private int capacidadCarga;
    private int volumenMetrosCubicos;
  
    //Metodo Constructor
    public Furgoneta(String Matricula, String Marca, String Modelo, String Color, float tarifaAlquiler, boolean estaDisponible, int capacidadCarga, int volumenMetrosCubicos) {
        super(Matricula, Marca, Modelo, Color, tarifaAlquiler, estaDisponible);
        this.capacidadCarga = capacidadCarga;
        this.volumenMetrosCubicos = volumenMetrosCubicos;
    }
    //fin Metodo Constructor
    
    //Inicio Metodo Get y Set
    public int get_CapacidadCarga() {
        return capacidadCarga;
    }
 
    public int get_VolumenMetrosCubicos() {
        return volumenMetrosCubicos;
    }
    
    public void set_CapacidadCarga(int capacidadCarga){
        this.capacidadCarga = capacidadCarga;
    }
    
    public void set_VolumenMetrosCubicos(int VolumenMetrosCubico){
        this.volumenMetrosCubicos = volumenMetrosCubicos;
    }
    //fin Metodo Get y Set
    
    
    //Procesar e Imprimir el calculo de alquiler y Disponibilidad
    @Override
    public float calcularMontoAlquiler(){
         if(estaDisponible = true ) {
             
            Scanner teclado = new Scanner(System.in);
        
            System.out.println("Ingrese Cantidad de Dias: ");
            int CantidadDeDias = teclado.nextInt();
            
        float montoParcial = tarifaAlquiler * CantidadDeDias;
        //calculo =200$ * cantidad de Dias
        
        if (capacidadCarga > 2.000){
         
            float Incremento = montoParcial * 0.25f;
            float montoTotal = montoParcial + Incremento;
            System.out.println("Pago Total: "+montoTotal+"$");
            
        } 
        else { 
            System.out.println("Pago Total: "+montoParcial+"$");
            }  
            
        } 
        else {
            System.out.println("Aviso: El Vehiculo no esta Disponible");  
         }
         
         return tarifaAlquiler;
    }

    @Override
    public void mostrarRegistro(){
       System.out.println("Matricula: " + Matricula);
       System.out.println("Marca: " + Marca);
       System.out.println("Modelo: "+ Modelo);
       System.out.println("Color: " + Color);
       System.out.println("capacidadCarga: " + capacidadCarga +"kg");
       System.out.println("volumenMetrosCubicos: " + volumenMetrosCubicos);
    }

}
