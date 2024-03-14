package Trabajo;

   public class Persona {
   private String ID;
   private String primer_Nombre;
   private String primer_Apellido;
   private int Edad;
   private String Genero;
   private int Peso;
   private int Talla;
   private String Dirección;
   private String Email;

    public Persona(String ID, String primer_Nombre, String primer_Apellido, int Edad, String Genero, int Peso, int Talla, String Dirección, String Email) {
        this.ID = ID;
        this.primer_Nombre = primer_Nombre;
        this.primer_Apellido = primer_Apellido;
        this.Edad = Edad;
        this.Genero = Genero;
        this.Peso = Peso;
        this.Talla = Talla;
        this.Dirección = Dirección;
        this.Email = Email;
        
    }//fin de Método constructor

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setPrimer_Nombre(String primer_Nombre) {
        this.primer_Nombre = primer_Nombre;
    }

    public void setPrimer_Apellido(String primer_Apellido) {
        this.primer_Apellido = primer_Apellido;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public void setPeso(int Peso) {
        this.Peso = Peso;
    }

    public void setTalla(int Talla) {
        this.Talla = Talla;
    }

    public void setDirección(String Dirección) {
        this.Dirección = Dirección;
    }

    public void setEmail(String Email) {
        this.Email = Email;
        
    }//fin de Método Setter()

    public String getID() {
        return ID;
    }

    public String getPrimer_Nombre() {
        return primer_Nombre;
    }

    public String getPrimer_Apellido() {
        return primer_Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public String getGenero() {
        return Genero;
    }

    public int getPeso() {
        return Peso;
    }

    public int getTalla() {
        return Talla;
    }

    public String getDirección() {
        return Dirección;
        
  }//fin de método get()

}//fin de la cláse
