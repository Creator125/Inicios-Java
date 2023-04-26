/*
Ejercicio 7: Leer por teclado una serie de 10 números enteros. La aplicación
debe indicarnos si los números están ordenados de forma creciente,
decreciente, o si están desordenados.
 */
package arreglos7;

import java.util.Scanner;

public class Arreglos7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[10];
        boolean creciente = false,
                decreciente = false;

        for(int i = 0; i < 10; i++){
            System.out.print((i + 1) +" Ingrese un numero: ");
            numeros[i] = entrada.nextInt();
        }
        
        for(int i = 0; i < 9; i++){
            if(numeros[i] < numeros[i+1]){ //Creciente
                creciente = true;
            }
            if(numeros[i] > numeros[i+1]){ //Decreciente
                decreciente = true;
            }
        }
        
        if(creciente == true && decreciente == false){
            System.out.println("\nEl arreglo esta odrenado de forma creciente");
        }else if(creciente == false && decreciente == true){
            System.out.println("\nEl arreglo esta odrenado de forma decreciente");
        }else if(creciente == true && decreciente == true){
            System.out.println("\nEl arreglo esta desordenado");
        }else if(creciente == false && decreciente == false){
            System.out.println("\nTodos los numeros del arreglo son iguales");
        }
    }
    
}
