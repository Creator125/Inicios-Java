/*
Ejercicio 3: Hacer un programa que lea un carácter por teclado y
compruebe si es una letra mayúscula.
 */
package condicionales3;

import javax.swing.JOptionPane;

public class Condicionales3 {

    public static void main(String[] args) {
        char letra;
        
        letra = JOptionPane.showInputDialog("Ingrese una letra").charAt(0);
        
        if(Character.isUpperCase(letra)){
            JOptionPane.showMessageDialog(null, "La letra es mayuscula");
        }else{
            JOptionPane.showMessageDialog(null, "La letra es minuscula");
        }
    }
    
}
