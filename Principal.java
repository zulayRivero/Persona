package principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        // Objeto c1
        Circunferencia bubble1 = new Circunferencia();

        // Pedir Usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el valor de radio:");
        double radio = scanner.nextDouble();

        // Obejto c2
        Circunferencia bubble2 = new Circunferencia(radio);

        // Informacion c1
        System.out.println("\nInformación de c1:");
        System.out.println("Radio: " + bubble1.getRadio());
        System.out.println("Diametro: " + bubble1.getDiametro());
        System.out.println("Longitud: " + bubble1.getLongitud());
        System.out.println("Area: " + bubble1.getArea());

        //  Información c2
        System.out.println("\nInformación de c2:");
        System.out.println("Diametro: " + bubble2.getDiametro());
        System.out.println("Longitud: " + bubble2.getLongitud());
        System.out.println("Area: " + bubble2.getArea());
    }
}
