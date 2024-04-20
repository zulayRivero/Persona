package principal;

public class Circunferencia {
 
    private final double PI = 3.14;
    private double Radio;
    private double Longitud;
    private double Diametro;
    private double Area;
    
   
    // Constructor 
    public Circunferencia() {
       Radio = 4.0;
       calcular_Diametro();
       calcular_Longitud();
       calcular_Area();

       /*Inicializar
       radio = 0;
       longitud = 0;
       diametro = 0;
       area = 0; */
    }
    //fin metodo constructor
    
    // Constructor de radio
    public Circunferencia(double radio) {
        this.Radio = radio;
        calcular_Diametro();
        calcular_Longitud();
        calcular_Area();
    }
    //fin metodo constructor circunferencia

    public void set_Radio(double radio) {
      this.Radio = radio;
    }

    public double get_Radio() {
        return Radio;
    }

    private void calcular_Diametro() {
        Diametro = 2* get_Radio();
    }

    public double get_Diametro() {
        return Diametro;
    }
    
    private void calcular_Longitud(){
        Longitud = 2* PI * Radio; 
    }

    public double get_Longitud() {
        return Longitud;
    }

    private void calcular_Area() {
        Area = PI* Radio* Radio;
    }

    public double get_Area() {
        return Area;
    }

    }
//fin de la clase
