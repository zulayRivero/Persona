package concesionario;

import java.util.Scanner;

public class Deportivo extends Vehiculo {
    
    private int Cilindrada;

    //Metodo Constructor
    public Deportivo(String Matricula, String Marca, String Modelo, String Color, float tarifaAlquiler, boolean estaDisponible, int Cilindradraint ) {
        super(Matricula, Marca, Modelo, Color, tarifaAlquiler, estaDisponible);
        
       this.Cilindrada = Cilindrada;
    }// Fin del Constructor

    //Metodos de la Subclase

    public void setCilindrada(int Cilindrada) {
        this.Cilindrada = Cilindrada;
    }
    
    public int get_Cilindrada(){
        return Cilindrada;
    }// Fin Metodo set y get
    
    
    // Solicitar el registro de alquiler
    @Override
    public float calcularMontoAlquiler(){
        if (estaDisponible = true ) {
            
        Scanner teclado = new Scanner(System.in);
        
            System.out.println("Ingrese Cantidad de Dias: ");
            int CantidadDeDias = teclado.nextInt();
            
        float montoParcial = tarifaAlquiler*CantidadDeDias;
        //calculo =150$ * cantidad de Dias

            System.out.println("Pago Total: "+montoParcial+"$");
            } 
        
        return tarifaAlquiler;
        
    }

    //Mostrar Datos Solicitados
    @Override
    public void  mostrarRegistro(){
       System.out.println("Matricula: " + Matricula);
       System.out.println("Marca: " + Marca);
       System.out.println("Modelo: "+ Modelo);
       System.out.println("Color: " + Color);
       System.out.println("Cilindrada: " + Cilindrada);
    }

    
}