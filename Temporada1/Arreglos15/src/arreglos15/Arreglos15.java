/*
Ejercicio 15: Leer 10 enteros ordenados crecientemente. Leer N y
buscarlo en la tabla. Se debe mostrar la posición en que se encuentra. Si
no está, indicarlo con un mensaje.
 */
package arreglos15;

import java.util.Scanner;

public class Arreglos15 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        int num;
        boolean creciente = true;
        
        do{
            //Pedimos el arreglo
            System.out.println("Rellene el arreglo");
            for (int i = 0; i < 10; i++) { //Llenar el arreglo
                    System.out.print((i + 1) +" Ingrese un numero: ");
                    numeros[i] = entrada.nextInt();
            }
            
            //Verifica si el arreglo está de forma creciente
            for (int i = 0; i < 9; i++) {//Creciente
                if(numeros[i] < numeros[i+1]){
                    creciente = true;
                }
                if(numeros[i] > numeros[i+1]){//Decreciente
                    creciente = false;
                    break;
                }
            }
            
            if(creciente ==  false){
                System.out.println("El arreglo está desordenado, ingrese nuevemente");
            }
        }while(creciente ==  false);
        
        //Pedimos el numero a buscar en el arreglo
        System.out.print("\nIngrese en el numero a consultar en el arreglo: ");
        num = entrada.nextInt();
        
        //Buscando el numero en el arreglo
        int i = 0;
        while((i < 10) && (numeros[i] < num)){
            i++;
        }
        
        if(i == 10){ //El iterador ha recorrido todo el arreglo y no encontramos nada
            System.out.println("\nEl numero ingresado no se encuentra en el arreglo");
        }else{
            if(numeros[i] == num){
                System.out.println("\nEl numero ha sido encontrado en el arreglo");
            }else{
              System.out.println("\nEl numero ingresado no se encuentra en el arreglo");  
            }
        }
        
        
    }
    
}
