/*
Ejercicio 6: Utilizando dos matrices de tamaño 5x9 y 9x5, cargar la primera y
trasponerla en la segunda.
*/
package matrices6;

import java.util.Scanner;

public class Matrices6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz1[][] = new int[5][9];
        int matriz2[][] = new int[9][5];
        
        System.out.println("Ingrese la matriz:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz1[i][j] = entrada.nextInt();
            }
        }
        
        System.out.println("\nLa matriz 1 es: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(matriz1[i][j] +" ");
            }
            System.out.println("");
        }
        
        //Trasnponiendo la matriz
        for (int i = 0; i < 5; i++) {            
            for (int j = 0; j < i; j++) {
                matriz2[i][j] = matriz1[j][i];
            }
        }
        
        System.out.println("\nLa matriz 2 es: ");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz2[i][j] +" ");
            }
            System.out.println("");
        }
    }
    //Con fallas
}
