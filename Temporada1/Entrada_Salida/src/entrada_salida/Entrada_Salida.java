/*
Tema: Entrada y salida de datos
 */
package entrada_salida;

import java.util.Scanner;

public class Entrada_Salida {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //Iniciando una entada de datos
        int num1;
        float num2;
        double num3;
        String text;
        char letra;
        
        System.out.println("Ingrese un valor entero (int): ");
        num1 = entrada.nextInt();//Entrada de tipo int
        System.out.println("Ingrese un valor decimal (float): ");
        num2 = entrada.nextFloat(); //Entrada de tipo float
        System.out.println("Ingrese un valor decimal doble (double): ");
        num3 = entrada.nextDouble(); //Entrada de tipo double
        System.out.println("Ingrese una cadena: ");
        text = entrada.nextLine(); //Entrada de String
        System.out.println("Ingrese una letra: ");
        letra = entrada.next().charAt(0); //Entrada de tipo double
        
        System.out.println("El valor de num1 es: " + num1);
        System.out.println("El valor de num2 es: " + num2);
        System.out.println("El valor de num3 es: " + num3);
        System.out.println(text);
        System.out.println(letra);
    }
    
}
