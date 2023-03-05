/*
Ejercicio 2: Hacer un programa que calcule e imprima el salario semanal
de un empleado a partir de sus horas semanales trabajadas y de su salario
por hora.
*/
package operadores6;

import java.util.Scanner;

public class Operadores6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario;
        int horas;
        double salariototal;
        
        //Guadando los datos
        System.out.println("Ingrese tu salario por horas:");
        salario = entrada.nextDouble();
        System.out.println("Ingrese las horas trabajadas:");
        horas = entrada.nextInt();
        
        //Realizando el calculo
        salariototal = salario * horas;
        
        System.out.print("\n");
        
        //Impriendo el reultado
        System.out.println("El salario semanal es: " + salariototal);
    }
    
}
