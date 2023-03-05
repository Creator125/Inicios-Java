/*
Ejercicio 4: Una compañía de venta de carros usados, paga a su personal 
de ventas un salario de $1000 mensuales, mas una comisión de
$150 por cada carro vendido, más el 5% del valor de la venta por carro. 
Cada mes el capturista de la empresa ingresa en la computadora los datos 
pertinentes. Hacer un programa que calcule e imprima el salario mensual 
de un vendedor dado.
 */
package operadores8;

import java.util.Scanner;

public class Operadores8 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario = 1000;
        double comision = 150;
        int carrovendidos;
        double porcentaje;
        double salariototal;
        
        //Guardando la cantidad de carros vendidos
        System.out.println("Ingrese la cantidad de carros vendidos");
        carrovendidos = entrada.nextInt();
        
        //Realizando los calculos
        porcentaje = comision * 0.5;
        salariototal = salario + (comision * carrovendidos) + porcentaje;
        
        System.out.println("El salario mensual es: $" + salariototal);
    }
    
}
