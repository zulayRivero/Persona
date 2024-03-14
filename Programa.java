package programa;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Ingresar datos
        System.out.print("Ingresar primer nombre: ");
        String primerNombre = entrada.nextLine();
        
        System.out.print("Ingresar primer apellido: ");
        String primerApellido = entrada.nextLine();

        System.out.print("Ingresar edad: ");
        String edad = entrada.nextLine();

        System.out.print("Ingresar género (M/F): ");
        String genero = entrada.nextLine();

        System.out.print("Ingresar  peso (kg): ");
        String peso = entrada.nextLine();

        System.out.print("Ingresar talla (cm): ");
        String talla = entrada.nextLine();

        System.out.print("Ingresar dirección: ");
        String direccion = entrada.nextLine();

        System.out.print("Ingresar correo electrónico: ");
        String email = entrada.nextLine();

        // Mostrar datos
        System.out.println("\n**Datos ingresados:**");
        System.out.println("Primer nombre: " + primerNombre);
        System.out.println("Primer apellido: " + primerApellido);
        System.out.println("Edad: " + edad);
        System.out.println("Género: " + genero);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Talla: " + talla + " cm");
        System.out.println("Dirección: " + direccion);
        System.out.println("Correo electrónico: " + email); 
 }//fin de main

}//fin de la clase