/*
Tema: Ordenamineto (por inserción)
*/
package ordenamientoinsercion;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class OrdenamientoInsercion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[], nElementos, pos,aux;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de elementos del arreglo"));
        arreglo = new int[nElementos];
        
        System.out.println("Rellene el arreglo");
        for (int i = 0; i < nElementos; i++) {
            System.out.print((i+1)+" Ingrese un numero: ");
            arreglo[i] = entrada.nextInt();
        }
        
        //Usando el odenamineto por insercion
        for (int i = 0; i < nElementos; i++) {
            pos = i;
            aux = arreglo[i];
            
            while((pos > 0) && (arreglo[pos-1] > aux)){
                arreglo[pos] = arreglo[pos-1];
                pos--;
            }
            
            arreglo[pos] = aux;
        }
        
        System.out.println("\nArreglo ordenado en order Ascendente");
        for(int num : arreglo){
            System.out.print(num+" ");
        }
        
        System.out.println("\nArreglo ordenado en forma Decendente");
        for (int i = (nElementos-1); i >= 0; i--) {
            System.out.print(arreglo[i]+" ");
        }
        
        System.out.println("\n");

    }
    
}
