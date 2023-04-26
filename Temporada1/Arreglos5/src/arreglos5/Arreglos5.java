/*
Ejercicio 5: Leer por teclado dos tablas de 10 números enteros y
mezclarlas en una tercera de la forma: el 1º de A, el 1º de B, el 2º de
A, el 2º de B, etc.
 */
package arreglos5;

import java.util.Scanner;

public class Arreglos5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tabla1[]= new int[10];
        int tabla2[]= new int[10];
        int tabla3[]= new int[20];
        
        //Pidiendo la primera tabla
        System.out.println("Tabla 1");
        for (int i = 0; i < 10; i++){
            System.out.print((i+1)+" Ingrese un numero: ");
            tabla1[i] = entrada.nextInt();
        }
        
        //Pidiendo la segunda tabla
        System.out.println("\nTabla 2");
        for (int i = 0; i < 10; i++){
            System.out.print((i+1)+" Ingrese un numero: ");
            tabla2[i] = entrada.nextInt();
        }
        
        int j = 0;
        //Mesclando las dos tabla
        for (int i = 0; i < 10; i++){
            tabla3[j] = tabla1[i]; //Copiando el elemnto de la tabla 1
            j++;
            tabla3[j] = tabla2[i]; //Copiando el elemnto de la tabla 3
            j++;
        }
        
        System.out.println("\nContenido de la tabla 3: ");
        for(int num : tabla3){
            System.out.print(num +" ");
        }
        
        System.out.print("\n");
    }
    
}
