/*
Tema: Ordenamineto (metodo burbuja)
*/
package ordenamientoburbuja;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class OrdenamientoBurbuja {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[], nElementos, aux;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de elementos del arreglo"));
        arreglo = new int[nElementos];
        
        for (int i = 0; i < nElementos; i++) {
            System.out.print((i+1)+" Ingrese un numero: ");
            arreglo[i] = entrada.nextInt();
        }
        
        //Utilizando el metodo Burbuja
        for (int i = 0; i < (nElementos-1); i++) {
            for (int j = 0; j < (nElementos-1); j++) {
                if (arreglo[j] > arreglo[j+1]) { //Si numero actual era mayor a numero siguiente
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
            }
        }
        
        //Mostrando el arrglo ordenado en forma creciente
        System.out.println("\nArreglo ordenado en forma creciente");
        for(int num : arreglo){
            System.out.print(num+" ");
        }
        
        //Mostrando el arrglo ordenado en forma decreciente
        System.out.println("\nArreglo ordenado en forma decreciente");
        for (int i = (nElementos-1); i >= 0; i--) {
            System.out.print(arreglo[i]+" ");
        }
        
        System.out.println("\n");
    }
    
}
