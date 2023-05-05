/*
Tema: Matrices
*/
package matrices;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Matrices {
    public static void main(String[] args) {
        /*
        int matriz[][] = {{1,2,3}, {1,5,6}, {7,8,9}};
        */
        Scanner entrada = new Scanner(System.in);
        int matriz[][], nFilas, nColumnas;
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas"));
        nColumnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de columnas"));
        matriz = new int[nFilas][nColumnas];
        
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        
        System.out.println("\nLa matriz es");
        for (int i = 0; i < nFilas; i++) { //Numero de filas
            for (int j = 0; j < nColumnas; j++) { //Numero de columnas
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }
    
}
