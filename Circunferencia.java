package principal;

public class Circunferencia {
 
    public static final double PI = 3.14;

    private double radio;
    private double longitud;
    private double diametro;
    private double area;

    // Constructor 
    public Circunferencia() {
        this.radio = 2;
        calcularDiametro();
        calcularLongitud();
        calcularArea();  
    }

    // Constructor de radio
    public Circunferencia(double radio) {
        this.radio = radio;
        calcularDiametro();
        calcularLongitud();
        calcularArea();
    }

    public void setRadio(double radio) {
        this.radio = radio;
        calcularDiametro();
        calcularLongitud();
        calcularArea();
    }

    public double getRadio() {
        return radio;
    }

    private void calcularDiametro() {
        diametro = 2 * radio;
    }

    public double getDiametro() {
        return diametro;
    }

    private void calcularLongitud() {
        longitud = 2 * PI * radio;
    }

    public double getLongitud() {
        return longitud;
    }

    private void calcularArea() {
        area = PI * radio * radio;
    }

    public double getArea() {
        return area;
    }

    }
