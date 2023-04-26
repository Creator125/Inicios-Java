/*
Ejercicio 8: Diseñar una aplicación que declare una tabla de 10 elementos
enteros. Leer mediante el teclado 8 números. Después se debe pedir un
número y una posición, insertarlo en la posición indicada, desplazando los que
estén detrás.
*/
package arreglos8;

import java.util.Scanner;

public class Arreglos8 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[10];
        int posicion, 
            num;
        
        for (int i = 0; i < 8; i++) {
            System.out.print((i + 1) +" Ingrese un numero: ");
            numeros[i] = entrada.nextInt();
        }
        
        System.out.print("\nIngrese la poscion en la que desea ingresar el elemento: ");
        posicion = entrada.nextInt();
        
        System.out.print("\nIngrese un numero: ");
        num = entrada.nextInt();
        
        numeros[posicion] = num;
        
        System.out.println("El arreglo resultado:");
        
        for(int numero: numeros){
            System.out.print(numero +" ");
        }
    }
    
}
