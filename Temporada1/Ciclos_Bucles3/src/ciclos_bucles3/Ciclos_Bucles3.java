/*
Ejercicio 3: Leer números hasta
que se introduzca un 0. Para
cada uno indicar si es par o
Impar.
 */
package ciclos_bucles3;

import javax.swing.JOptionPane;

public class Ciclos_Bucles3 {

    public static void main(String[] args) {
        int num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        
        while(num != 0){
            if(num % 2 == 0){
                JOptionPane.showMessageDialog(null, "El numero es par");
            }else{
                JOptionPane.showMessageDialog(null, "El numero es impar");
            }
            
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
        } 
    }
    
}
