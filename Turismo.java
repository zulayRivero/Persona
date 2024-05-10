package concesionario;

import java.util.Scanner;

public class Turismo extends Vehiculo {

    // Datos especificos de Turismo
    private int numerodePuertas;
    private boolean tipodeMarcha;

    //Metodo Constructor
  
    //Metodo Constructor
    public Turismo(String Matricula, String Marca, String Modelo, String Color, float tarifaAlquiler, boolean estaDisponible,int numerodePuertas, boolean tipodeMarcha){
        super(Matricula, Marca, Modelo, Color, tarifaAlquiler, estaDisponible);
        this.numerodePuertas = numerodePuertas;
        this.tipodeMarcha= tipodeMarcha;
      
    }// Fin de Metodo Constructor

    public int get_numerodePuertas() {
        return numerodePuertas;
    }

    public void setnumerodePuertas(int numerodePuertas) {
        this.numerodePuertas = numerodePuertas;
    }

    public void setTipodeMarcha(boolean tipodeMarcha) {
        this.tipodeMarcha = tipodeMarcha;
    }

    public boolean get_tipodeMarcha() {
        return tipodeMarcha;
    }

    // Mostrar los Datos Solicitados
   @Override
    public void mostrarRegistro(){
       System.out.println("Matricula: " + Matricula);
       System.out.println("Marca: " + Marca);
       System.out.println("Modelo: "+ Modelo);
       System.out.println("Color: " + Color);
       System.out.println("numerodePuertas: " + numerodePuertas);
       System.out.println("tipodeMarcha: " + tipodeMarcha + "Sincronica");

    }

    // Solicitar el registro de alquiler
    @Override
    public float calcularMontoAlquiler() {
        float totalAlquiler = 100; 

        //Informacion solicitada al usuario sobre recorrido y numero de dias
         Scanner teclado = new Scanner(System.in);
        
            System.out.println("Ingrese Cantidad de Dias: ");
            int CantidadDeDias = teclado.nextInt();
            
        Float montoParcial = tarifaAlquiler * CantidadDeDias;
        //calculo =100$ * cantidad de Dias
        
            System.out.println("Recorrido fuera de la Ciudad? 1 Si o 2 No");
            int fueradelaCiudad = teclado.nextInt();
        
        if (fueradelaCiudad == 1){
            float Incremento = montoParcial * 0.15f;
            float montoTotal = montoParcial + Incremento;
            System.out.println("Pago Total: "+montoTotal+"$");
            
        } 
        else { 
            System.out.println("Pago Total: "+montoParcial+"$");
            }
        
        return totalAlquiler;
    }
    
}  