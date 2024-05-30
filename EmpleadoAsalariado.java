package principal1;

    public class EmpleadoAsalariado extends Empleado {
    
    private final double SUELDOHORA = 600;
    private int diasTrabajados;
    
public EmpleadoAsalariado(String primerNombre,String apellidoPaterno,String numeroSeguroSocial,int diasTrabajados){
    super(primerNombre,apellidoPaterno,numeroSeguroSocial);
      this.diasTrabajados = diasTrabajados; 
}  
  
public void setDiasTrabajados(int diasTrabajados){
    this.diasTrabajados = diasTrabajados;
}

public int getDiasTrabajados(){
    return diasTrabajados;

}
@Override
public double mostrarMontoPago(){
    return SUELDOHORA *diasTrabajados ;
}

}
