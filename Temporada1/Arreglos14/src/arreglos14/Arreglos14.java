/*
Ejercicio 14: Leer dos series de 10 enteros, que estarán ordenados
crecientemente. Copiar (fusionar) las dos tablas en una tercera, de forma
que sigan ordenados.
*/
package arreglos14;

import java.util.Scanner;

public class Arreglos14 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros1[] = new int[10];
        int numeros2[] = new int[10];
        int numeros3[] = new int[20];
        boolean creciente = true;
        
        do{ //Llenando el primer arreglo
            System.out.println("LLenando el primer arreglo");
            for (int i = 0; i < 10; i++) {
                System.out.print((i + 1) +" Ingrese un numero: ");
                numeros1[i] = entrada.nextInt();
            }
        
            for (int i = 0; i < 9; i++) {
                if(numeros1[i] < numeros1[i+1]){
                    creciente = true;
                }
                if(numeros1[i] > numeros1[i+1]){//Decreciente
                    creciente = false;
                    break;
                }
            }
            
            if(creciente ==  false){
                System.out.println("El primer arreglo está desordenado, ingrese nuevemente");
            }
        }while(creciente ==  false);
        
        
        do{ //Llenando el segundo arreglo
            System.out.println("LLenando el segundo arreglo");
            for (int i = 0; i < 10; i++) {
                System.out.print((i + 1) +" Ingrese un numero: ");
                numeros2[i] = entrada.nextInt();
            }
        
            for (int i = 0; i < 9; i++) {
                if(numeros2[i] < numeros2[i+1]){
                    creciente = true;
                }
                if(numeros2[i] > numeros2[i+1]){//Decreciente
                    creciente = false;
                    break;
                }
            }
            
            if(creciente ==  false){
                System.out.println("El segundo arreglo está desordenado, ingrese nuevemente");
            }
        }while(creciente ==  false);
        
        
        //Lennado el tecer arreglo
        for (int i = 0; i < 10; i++) {
            numeros3[i]= numeros1[i];
        }
        for (int i = 10; i <= 19; i++) {
            numeros3[i]= numeros1[i];
        }
        
        System.out.println("\nContenido de la tabla 3: ");
        for(int num : numeros3){
            System.out.print(num +" ");
        }
        
        System.out.print("\n");
    }
    
    //Con fallas
}
