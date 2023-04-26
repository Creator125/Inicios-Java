/*
Ejercicio 12: Leer por teclado una tabla de 10 elementos numéricos enteros
y una posición (entre 0 y 9). Eliminar el elemento situado en la posición dada sin
dejar huecos.
*/
package arreglos12;

import java.util.Scanner;

public class Arreglos12 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[10];
        int eliminarPosi;
        
        for (int i = 0; i < 9; i++) { //Llenar el arreglo
                System.out.print((i + 1) +" Ingrese un numero: ");
                numeros[i] = entrada.nextInt();
            }
        
        System.out.println("Ingrese la posicion a eliminar el numero:");
        eliminarPosi = entrada.nextInt();
        
        for (int i = 0; i >= 8; i++) {
            numeros[i-1] = numeros[i];
        }
        
        System.out.println("\nEl nuevo arreglo es: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(numeros[i] +" ");
        }
        
        System.out.print("\n");
    }
    
}
