/*
Ejercicio 13: Leer 10 enteros en una tabla. Guardar en otra tabla los
elementos pares de la primera, y a continuación los elementos impares.
*/
package arreglos13;

import java.util.Scanner;

public class Arreglos13 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        int contPares = 0, contImpares = 0;
        
        for (int i = 0; i < 10; i++) { //Llenar el 1mer arreglo
            System.out.print((i + 1) +" Ingrese un numero: ");
            numeros[i] = entrada.nextInt();
            
            if(numeros[i] % 2 == 0){
                contPares++;
            }else{
                contImpares++;
            }
        }
        
        
        //Crear el arreglo siguente
        int pares[] = new int[contPares];
        int impares[] = new int[contImpares];
        
        contPares = 0;
        contImpares =0;
        
        //Amacenamos los numeros pares en su arreglo y los impares tambien
        for (int i = 0; i < 10; i++) {
            if(numeros[i] % 2 == 0){ //Si el numero es par
                pares[contPares] = numeros[i];
                contPares++;
            }else{ //El numero es inpar
                impares[contImpares] = numeros[i];
                contImpares++;
            }
        }
        
        System.out.println("\nEl arreglo de los pares: ");
        for (int i = 0; i < contPares; i++) {
            System.out.print(pares[i] + " ");
        }
        
        System.out.println("\nEl arreglo de los impares: ");
        for (int i = 0; i < contImpares; i++) {
            System.out.print(impares[i] + " ");
        }
        
        System.out.print("\n");
    }
    
}
