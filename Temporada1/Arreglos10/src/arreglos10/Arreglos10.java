/*
Ejercicio 10: Crear un programa que lea por teclado una tabla de 10
números enteros y desplace N posiciones en el arreglo 
(N es digitado por el usuario).
 */
package arreglos10;

import java.util.Scanner;

public class Arreglos10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[10];
        int posicionN, ultimo;
        
        for (int i = 0; i < 10; i++) { //Llenar el arreglo
            System.out.print((i + 1) +" Ingrese un numero: ");
            numeros[i] = entrada.nextInt();
        }
        
        System.out.print("\nIngrese la poscion para despazar los elementos: ");
        posicionN = entrada.nextInt();
        
        ultimo = numeros[posicionN];
        
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
