/*
Ejercicio 11: Leer 5 elementos numéricos que se introducirán ordenados de forma
creciente. Estos los guardaremos en una tabla de tamaño 10. Leer un número N, e
insertarlo en el lugar adecuado para que la tabla continúe ordenada.
 */
package arreglos11;

import java.util.Scanner;

public class Arreglos11 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[10];
        int num, sitioNum=0, j=0;
        boolean creciente = true;
        
        do{
            //Lienando el arreglo
            for (int i = 0; i < 5; i++) { //Llenar el arreglo
                System.out.print((i + 1) +" Ingrese un numero: ");
                numeros[i] = entrada.nextInt();
            }
            
            //Comprobar si el arreglo está en orden creciente
            for (int i = 0; i < 4; i++) {
                if(numeros[i] < numeros[i+1]){ //Creciente
                    creciente = true;
                }
                if(numeros[i] > numeros[i+1]){ //Decreciente
                    creciente = false;
                    break;
                }
                
            }
            
            if(creciente == false){
                System.out.println("\nEl arreglo no está ordenado en forma creciente, vuelva a digitar");
            }
        }while(creciente == false);
        
        System.out.print("\nIngrese un numero para insertar: ");
        num = entrada.nextInt();
        
        //Esto para darnos cuenta en que posicion se encuetra el numero
        while(numeros[j]< num && j < 5){
            sitioNum++;
            j++;
        }
        
        //Por ultimo transladamos una posicion en el arreglo a los elementos que van detras de num
        for (int i = 4; i >= sitioNum; i--) {
            numeros[i+1] = numeros[i];
        }
        
        //Insertamos el numero que el usuario puso
        numeros[sitioNum] = num;
        
        System.out.println("\nEl nuevo arreglo es: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(numeros[i] +" ");
        }
        
        System.out.print("\n");
    }
    
}
