/*
Ejercicio 7: Pedir tres números y mostrarlos ordenados de mayor a menor.
*/
package condicionales7;

import javax.swing.JOptionPane;

public class Condicionales7 {

    public static void main(String[] args) {
        int num1,
            num2,
            num3;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tecer numero"));
        
        if((num1 > num2) && (num2 > num3)){ //num1 es mayor
            JOptionPane.showMessageDialog(null, num1 +" "+ num2 +" "+ num3); 
        }else if((num1 > num3) && (num3 > num2)){
            JOptionPane.showMessageDialog(null, num1 +" "+ num3 +" "+ num2);
        }else if((num2 > num1) && (num1 > num3)){ //num2 es mayor
            JOptionPane.showMessageDialog(null, num2 +" "+ num1 +" "+ num3); 
        } else if((num2 > num3) && (num3 > num1)){
            JOptionPane.showMessageDialog(null, num2 +" "+ num3 +" "+ num1);
        }else if((num3 > num1) && (num1 > num2)){ //num3 es mayor
            JOptionPane.showMessageDialog(null, num3 +" "+ num1 +" "+ num2);
        }else{
            JOptionPane.showMessageDialog(null, num3 +" "+ num2 +" "+ num1);
        }
    }
    
}
