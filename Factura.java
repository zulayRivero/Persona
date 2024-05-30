package principal1;

public class Factura implements PorPagar {
    
    private final String numPieza;
    private final String descripPieza;
    private int cantidPieza;
    private double precioPieza;
    
public Factura(String numPieza,String descripPieza,int cantidPieza,double precioPieza){
    
    this.numPieza = numPieza;
    this.descripPieza = descripPieza;
    this.cantidPieza = cantidPieza;
    this.precioPieza = precioPieza;
}
    
public void setNumPieza(String numPieza){
}

public String getNumPieza(){  
    return numPieza;
}

public void setDescripPieza(String descripPieza){
} 

public String getDescripPieza(){
    return descripPieza;
}

public void setCantidPieza(int cantidPieza){    
}

public int getCantidPieza(){
    return cantidPieza;
}

public void setPrecioPieza(double precioPieza){  
}

public double getPrecioPieza(){
    return precioPieza;
}

    @Override
    public double mostrarMontoPago(){
       return cantidPieza * precioPieza;
    }
    
}
