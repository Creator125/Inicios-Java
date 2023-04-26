/*
Ejercicio 6: Leer los datos correspondiente a dos tablas de 12 elementos 
numéricos, y mezclarlos en una tercera de la forma: 3 de la tabla A, 3 de la B, 
otros 3 de A, otros 3 de la B, etc.
*/
package arreglos6;

import java.util.Scanner;

public class Arreglos6 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        int tabla1[]= new int[12];
        int tabla2[]= new int[12];
        int tabla3[]= new int[24];
        
        //Pidiendo la primera tabla
        System.out.println("Tabla 1");
        for (int i = 0; i < 12; i++){
            System.out.print((i+1)+" Ingrese un numero: ");
            tabla1[i] = entrada.nextInt();
        }
        
        //Pidiendo la segunda tabla
        System.out.println("\nTabla 2");
        for (int i = 0; i < 12; i++){
            System.out.print((i+1)+" Ingrese un numero: ");
            tabla2[i] = entrada.nextInt();
        }
        
        int j = 0;
        //Mesclando las dos tabla
        for (int i = 0; i < 24; i++){
            tabla3[j] = tabla1[i]; //Copiando el elemnto de la tabla 1
            j += 3;
            tabla3[j] = tabla2[i]; //Copiando el elemnto de la tabla 3
            j += 3;
        }
        
        System.out.println("\nContenido de la tabla 3: ");
        for(int num : tabla3){
            System.out.print(num +" ");
        }
        
        System.out.print("\n");
    }
    
}
