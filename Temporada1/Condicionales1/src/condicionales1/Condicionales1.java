/*
Ejercicio 1: Hacer un programa que lea un número entero y muestre si el 
número es múltiplo de 10.
 */
package condicionales1;

import javax.swing.JOptionPane;

public class Condicionales1 {

    public static void main(String[] args) {
        int num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        
        if(num % 10 == 0){
            JOptionPane.showMessageDialog(null, "El numero es multiplo de 10");
        }else{
            JOptionPane.showMessageDialog(null, "El numero no es multiplo de 10");
        }
    }
    
}
