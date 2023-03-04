/*
Tema: Operadores
 */
package operadores;

import java.util.Scanner;

public class Operadores {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double num1;
        double num2;
        double suma, resta, multi, division, modulo;
        
        System.out.println("Ingrese 2 numero");
        num1 = entrada.nextDouble();
        num2 = entrada.nextDouble();
        
        //Operadores aritméticos
        suma = num1 + num2;
        resta = num1 - num2;
        multi = num1 * num2;
        division = num1 / num2;
        modulo = num1 % num2;
        
        //Imprimiedo las operaciones
        System.out.println("Suma = " + suma);
        System.out.println("Resta = " + resta);
        System.out.println("Multiplicacion = " + multi);
        System.out.println("Division = " + division);
        System.out.println("Modulo = " + modulo);
        
    }
    
}
