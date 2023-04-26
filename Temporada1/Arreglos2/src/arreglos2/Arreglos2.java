/*
Ejercicio 2: Leer 5 números, guardarlos en un arreglo y
mostrarlos en el orden inverso al introducido.
*/
package arreglos2;

import javax.swing.JOptionPane;

public class Arreglos2 {

    public static void main(String[] args) {
        int[] numeros = new int[5];
        
        for (int i = 0; i < 5; i++){//Ingresando los valores
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog((i+1)+"  Ingrese un numero"));
        }
        
        for(int i = 4; i > 0; i--){//Imprimiendo los valores en inverso
            System.out.println(numeros[i]);
        }
    }
    
}
