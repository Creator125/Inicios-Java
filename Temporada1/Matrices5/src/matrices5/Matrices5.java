/*
Ejercicio 5: Crear y cargar una matriz de tamaño n x m, mostrar la suma de
cada fila y de cada columna.
*/
package matrices5;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Matrices5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][], nFilas, nColumnas, sumaFilas, sumaColumnas;
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas"));
        nColumnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de columnas"));
        matriz = new int[nFilas][nColumnas];
        
        System.out.println("Ingrese la matriz:");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        
        System.out.println("\nLa matriz es: ");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                System.out.print(matriz[i][j] +" ");
            }
            System.out.println("");
        }
        
        //Sumando las filas y las columnas
        
        //Sumando las filas
        for (int i = 0; i < nFilas; i++) {
            sumaFilas = 0;
            for (int j = 0; j < nColumnas; j++) {
                sumaFilas += matriz[i][j];
            }
            
            System.out.println("Suma de la fila ["+i+"]: "+ sumaFilas);
        }
        System.out.println("");
        
        //Sumando las columnas
        for (int j = 0; j < nColumnas; j++) {
            sumaColumnas = 0;
            for (int i = 0; i < nFilas; i++) {
                sumaColumnas += matriz[i][j];
            }
            
            System.out.println("Suma de la columna ["+j+"]: "+ sumaColumnas);
        }
        System.out.println("");
    }
    
}
