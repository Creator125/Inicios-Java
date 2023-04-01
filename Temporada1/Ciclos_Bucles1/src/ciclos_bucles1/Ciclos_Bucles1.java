/*
Ejercicio 1: Leer un número y mostrar su cuadrado, repetir el
proceso hasta que se introduzca un número negativo.
*/
package ciclos_bucles1;

import java.util.Scanner;

public class Ciclos_Bucles1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = 0,
            cuadrado;
        
        
        while(num >= 0){
            System.out.println("Ingrese un numero");
            num = entrada.nextInt();
            cuadrado =(int) Math.pow(num, 2);
            
            System.out.println("El cuadrado de "+ num +" es: "+ cuadrado);
        }
    }
    
}
