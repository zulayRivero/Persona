package concesionario;

public abstract class Vehiculo {
protected String Matricula;
protected String Marca;
protected String Modelo;
protected String Color;
protected float tarifaAlquiler;
protected boolean estaDisponible;
    
public Vehiculo(String Matricula, String Marca, String Modelo, String Color, float tarifaAlquiler, boolean estaDisponible){
    
   this.Matricula = Matricula;
   this.Marca = Marca;
   this.Modelo = Modelo;
   this.Color = Color;
   this.tarifaAlquiler = tarifaAlquiler;
   this.estaDisponible = estaDisponible;
} 
//Fin Metodo Constructor

//Inicio Metodo Get

public String get_Matricula(){
    return Matricula;
}

public String get_Marca(){
    return Marca;
}

public String get_Modelo(){
    return Modelo;
}

public String get_Color(){
    return Color;
}

public float get_tarifaAlquiler(){
    return tarifaAlquiler;
}

public boolean get_estaDisponible(){
    return estaDisponible;
}
//fin Metodo Get

//inicio Metodo Set

public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public void setTarifaAlquiler(float tarifaAlquiler) {
        this.tarifaAlquiler = tarifaAlquiler;
    }

    public void setEstaDisponible(boolean estaDisponible) {
        this.estaDisponible = estaDisponible;
    }
    //fin metodo de Set
    
   public abstract float calcularMontoAlquiler();

   public void mostrarRegistro(){
       System.out.println("Matricula: " + Matricula);
       System.out.println("Marca: " + Marca);
       System.out.println("Modelo: "+ Modelo);
       System.out.println("Color: " + Color);
       System.out.println("tarifaAlquiler: " + tarifaAlquiler);
       System.out.println("estaDisponible: " + estaDisponible);
   }

}
//fin de la Clase