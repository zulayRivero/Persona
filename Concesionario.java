package concesionario;

import java.awt.Color;

public class Concesionario {

    public static void main(String[] args) {
        
        //Vehiculo 1Turismo
          Turismo BMW = new Turismo("GK45", "ARDRI", "C42", "ROSA", 100, true);
            BMW.get_Matricula();
            BMW.setNumerodePuertas(4);
            BMW.setTipodeMarchaSincronica(true);
            BMW.mostrarRegistro(BMW.get_Matricula(),BMW.get_Marca(), BMW.get_Modelo(),BMW.get_Color(),BMW.get_tarifaAlquiler(),
            BMW.get_estaDisponible(), BMW.get_numerodePuertas(), BMW.get_tipodeMarchaSincronica());
            BMW.calcularMontoAlquiler(BMW.get_estaDisponible(), BMW.get_tarifaAlquiler());
    }
    
}