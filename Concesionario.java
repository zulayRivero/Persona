package concesionario;

import java.awt.Color;
import java.util.Scanner;

public class Concesionario {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        boolean Sincronica = false;
           
        //Vehiculo Turismo
          Turismo Bmw = new Turismo("GK4025","BMW","C42","MORADO",100,true,4,Sincronica);
          
        //vehiculo deportivo  
          Deportivo Ardri = new Deportivo ("KJU255","ARDRI","B14","ROSA",150,true,8000);
          
        //vehiculo furgoneta  
          Furgoneta Mercedes = new Furgoneta ("ZJK214","MERCEDES","S65AMG","NEGRO",200,true,500, (int) 16.6);
          
         Bmw.mostrarRegistro();
         System.out.println("Precio del alquiler: $ " +Bmw.calcularMontoAlquiler());
         
         Ardri.mostrarRegistro();
         System.out.println("Precio del alquiler: $ "+Ardri.calcularMontoAlquiler());
         
         Mercedes.mostrarRegistro();
         System.out.println("Precio del alquiler: $ "+Mercedes.calcularMontoAlquiler());            
    }
    
}