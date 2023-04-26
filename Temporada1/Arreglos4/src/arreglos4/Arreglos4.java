/*
Ejercicio 4: Leer 10 números enteros, guardarlos en un arreglo.
Debemos mostrarlos en el siguiente orden: el primero, el último, el
segundo, el penúltimo, el tercero, etc.
*/
package arreglos4;

import java.util.Scanner;

public class Arreglos4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) +" Ingrese un numero: ");
            numeros[i] = entrada.nextInt();
        }
        
        System.out.println("\n");
        
        for (int i = 0; i < 10; i++){
            System.out.println(numeros[i]);
            
            for (int j = 9; j > 0; j--){
                System.out.println(numeros[j]);
            }
        }
    }
    
}
