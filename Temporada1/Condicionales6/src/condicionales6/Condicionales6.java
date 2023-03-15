/*
Ejercicio 6: Hacer un programa que tome dos números y diga si ambos
son pares o impares.
 */
package condicionales6;

import javax.swing.JOptionPane;

public class Condicionales6 {

    public static void main(String[] args) {
        int num1,
            num2;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        
        if((num1 % 2 == 0) && (num2 % 2 == 0)){
            JOptionPane.showMessageDialog(null, "Ambos son pares");
        }else{
            JOptionPane.showMessageDialog(null, "Ambos son impares");
        }
    }
    
}
