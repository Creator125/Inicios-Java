/*
Ejercicio 2: Crear y cargar dos matrices de tamaño 3x3, sumarlas y
mostrar su suma.
*/
package matrices2;

import java.util.Scanner;

public class Matrices2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz1[][] = new int[3][3];
        int matriz2[][] = new int[3][3];
        int matrizSuma[][] = new int[3][3];
        
        System.out.println("Ingrese la matriz 1");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Matriz 1 ["+i+"]["+j+"]: ");
                matriz1[i][j] = entrada.nextInt();
            }
        }
        System.out.println("\nIngrese la matriz 2");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Matriz 2 ["+i+"]["+j+"]: ");
                matriz2[i][j] = entrada.nextInt();
            }
        }
        
        //Sumando las dos matrices
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizSuma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        
        //Mostrando la matrices sumadas
        System.out.println("\nLa matriz sumada es: ");
        for (int i = 0; i < 3; i++) { //Numero de filas
            for (int j = 0; j < 3; j++) { //Numero de columnas
                System.out.print(matrizSuma[i][j] +" ");
            }
            System.out.println("");
        }
        
    }
    
}
