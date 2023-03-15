/*
Ejercicio 8: Pedir un número entre 0 y 99 999 y decir cuántas cifras tiene.
*/
package condicionales8;

import javax.swing.JOptionPane;

public class Condicionales8 {

    public static void main(String[] args) {
        int num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        
        if((num <= 999) && (num > 99)){
            JOptionPane.showMessageDialog(null, "El numero tine 3 cifras");
        }else if(num <= 99 && num >= 10){
            JOptionPane.showMessageDialog(null, "El numero tine 2 cifras");
        }else{
            JOptionPane.showMessageDialog(null, "El numero tine 1 cifras");
        }
    }
    
}
