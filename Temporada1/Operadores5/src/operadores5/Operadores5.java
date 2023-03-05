/*
Ejercicio 1: Hacer un programa que calcule e imprima la suma de tres 
calificaciones.
*/
package operadores5;

import java.util.Scanner;

public class Operadores5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;
        double suma;
        
        //Guardando las tres calificaciones
        System.out.println("Ingrese las tres calificaciones");
        nota1 = entrada.nextDouble();
        nota2 = entrada.nextDouble();
        nota3 = entrada.nextDouble();
        
        //Suma de las calificaciones
        suma = nota1 + nota2 + nota3;
        
        
        
        //Impriendo el resultado
        System.out.println("La suma de las tres calificaciones es: " + suma);
        
    }
    
}
