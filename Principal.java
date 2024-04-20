package principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[]args) {
        
       double radio;

        // Objeto c1
        Circunferencia bubble1 = new Circunferencia();
     
        // Pedir Usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el valor de radio:");
        radio = scanner.nextDouble();

        // Obejto c2
        Circunferencia bubble2 = new Circunferencia(radio);

        // Informacion c1
        System.out.println("Información de c1:");
        System.out.println("Radio: " + bubble1.get_Radio());
        System.out.println("Diametro: " + bubble1.get_Diametro());
        System.out.println("Longitud: " + bubble1.get_Longitud());
        System.out.println("Area: " + bubble1.get_Area());

        //  Información c2
        System.out.println("Información de c2:");
        System.out.println("Diametro: " + bubble2.get_Diametro());
        System.out.println("Longitud: " + bubble2.get_Longitud());
        System.out.println("Area: " + bubble2.get_Area());
    }
}
