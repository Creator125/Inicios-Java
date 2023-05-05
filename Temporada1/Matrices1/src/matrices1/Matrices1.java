/*
Ejercicio 1: Crear y cargar una matriz de tamaño n x m y decir si es simétrica o
no.
*/
package matrices1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Matrices1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][], nFilas, nColumnas;
        boolean simetrica = true;
        
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
        
        if(nFilas == nColumnas){ //Si el numero de filas es igual al numero de columnas
            int i,j;
            
            i = 0;
            while(i < nFilas && simetrica == true){
                j = 0;
                while(j < i && simetrica == true){
                    if(matriz[i][j] != matriz[j][i]){
                        simetrica = false;
                    }
                    j++;
                }
                i++;
            }
            
            if(simetrica == true){
                JOptionPane.showMessageDialog(null, "La matriz es simetrica");
            }else{
                JOptionPane.showMessageDialog(null, "La matriz no es simetrica");
            }
        }else{
            JOptionPane.showMessageDialog(null, "La matriz no es simetrica");
        }
    }
    
}
