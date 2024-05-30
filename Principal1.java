package principal1;

public class Principal1 {

     public static void main(String[] args) {
        
    Factura Pago = new Factura ("325","Cable de Internet",05,153.230);  
    System.out.println("Factura");
    System.out.println("Numero de Piezas: " + Pago.getNumPieza());
    System.out.println("Descripcion de las Piezas: " + Pago.getDescripPieza());
    System.out.println("Cantidad de las Piezas: " + Pago.getCantidPieza());
    System.out.println("Precio de la Pieza: " + Pago.getPrecioPieza());
    System.out.println("Total a Pagar");
    
    
    EmpleadoAsalariado Empleado1 = new EmpleadoAsalariado ("Zulay","Rivero","2963XY",15);
    System.out.println("Datos del Empleado");
    System.out.println("Primer Nombre: " + Empleado1.getPrimerNombre());
    System.out.println("Primer Apellido: " + Empleado1.getApellidoPaterno());
    System.out.println("Numero de Seguro Social: " + Empleado1.getNumeroSeguroSocial());
    System.out.println("Tota dias Trabajados: " + Empleado1.getDiasTrabajados());
    
    }
  
}
