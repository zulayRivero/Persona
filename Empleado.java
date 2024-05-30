package principal1;

    public abstract class Empleado implements PorPagar {
    
    private final String primerNombre;
    private final String apellidoPaterno;
    private final String numeroSeguroSocial;
    
public Empleado(String primerNombre,String apellidoPaterno,String numeroSeguroSocial){
    this.primerNombre = primerNombre;
    this.apellidoPaterno = apellidoPaterno;
    this.numeroSeguroSocial = numeroSeguroSocial;
}     

public void setPrimerNombre(){  
}

public String getPrimerNombre(){
    return primerNombre;
}

public void setApellidoPaterno(){   
}

public String getApellidoPaterno(){
    return apellidoPaterno;
}

public void setNumeroSeguroSocial(){  
}

public String getNumeroSeguroSocial(){
    return numeroSeguroSocial;
}


}
