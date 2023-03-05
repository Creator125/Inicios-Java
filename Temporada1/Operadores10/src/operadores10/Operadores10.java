/*
Ejercicio 6: Hacer un programa que calcule el cuadrado de una suma.

(a+b)^2 = a^2 + b^2 + 2ab
 */
package operadores10;

import java.util.Scanner;

public class Operadores10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a,
            b,
            resul;
        
        //Pedir los datos necesarios
        System.out.println("Ingrese el valor de 'a'");
        a = entrada.nextInt();
        System.out.println("Ingrese el valor de 'b'");
        b = entrada.nextInt();
        
        //Realizando el calculo
        resul =(int)(Math.sqrt(a) + Math.sqrt(b) + (2 * a * b));
        
        //Impriendo el resultado
        System.out.println("(a + b)^2 = " + resul);
    }
    
}
