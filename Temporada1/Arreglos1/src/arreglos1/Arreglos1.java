/*
Ejercicio 1: Leer 5 números, guardarlos en un arreglo y mostrarles 
en el mismo orden introducido.
*/
package arreglos1;

import javax.swing.JOptionPane;

public class Arreglos1 {

    public static void main(String[] args) {
        int[] numeros = new int[5];
        
        for (int i = 0; i < 5; i++){//Ingresando los valores
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog((i+1)+"  Ingrese un numero"));
        }
        
        for(int num: numeros){//Imprimiendo los valores
            System.out.println(num);
        }
    }
    
}
