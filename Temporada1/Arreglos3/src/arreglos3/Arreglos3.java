/*
Ejercicio 3: Leer 5 números por teclado, almacenarlos en un arreglo y a
continuación realizar la media de los números positivos, la media de los
negativos y contar el número de ceros.
*/
package arreglos3;

import java.util.Scanner;

public class Arreglos3 {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[5];
        int mediaPositivos = 0,
            mediaNegativos = 0,
            contPositivos = 0,
            contNegativos = 0,
            contCeros = 0;
        
        for (int i = 0; i < 5; i++){//Ingresando los valores
            System.out.print("Ingrese un numero: ");
            numeros[i] = entrada.nextInt();
            
            if(numeros[i] == 0){
                contCeros++;
            }else if(numeros[i] > 0){
                mediaPositivos += numeros[i];
                contPositivos++;
            }else{
                mediaNegativos += numeros[i];
                contNegativos++;
            }
        }
        
        //Media de los numeros positivos
        if(contPositivos == 0){ 
            System.out.println("No se puede sacar el promedio de los numeros positivos");
        }else{
            mediaPositivos /= contPositivos;
            
            System.out.println("Pormedio de los numeros positivos: "+ mediaPositivos);
        }
        
        //Media de los numeros negativos
        if(contNegativos == 0){ 
            System.out.println("No se puede sacar el promedio de los numeros negativos");
        }else{
            mediaNegativos /= contNegativos;
            
           System.out.println("Pormedio de los numeros negativos: "+ mediaNegativos); 
        }

        System.out.println("Total de ceros: "+ contCeros);
    }
    
}
