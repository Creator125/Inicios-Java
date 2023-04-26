/*
Ejercicio 9: Crear un programa que lea por teclado una tabla de 10 números enteros y la
desplace una posición hacia abajo: el primero pasa a ser el segundo, el segundo pasa a ser el
tercero y así sucesivamente. El último pasa a ser el primero.
 */
package arreglos9;

import java.util.Scanner;

public class Arreglos9 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[10];
        int ultimo;
        
        for (int i = 0; i < 10; i++) { //Llenar el arreglo
            System.out.print((i + 1) +" Ingrese un numero: ");
            numeros[i] = entrada.nextInt();
        }
        ultimo = numeros[9]; //Guardando el ultimo elemento
        
        for (int i = 8; i >= 0; i--) {
            numeros[i+1] = numeros[i];
        }
        
        numeros[0] = ultimo; //Guardando el ultimo arreglo
        
        System.out.print("\n");
        
        System.out.println("El nuevo arreglo es: ");
        for(int numero : numeros){
            System.out.print(numero +" ");
        }
        
        System.out.print("\n");
    }
    
}
