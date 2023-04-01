/*
Ejercicio 2: Leer un número e indicar si es positivo o negativo.
El proceso se repetirá hasta que se introduzca un 0.
 */
package ciclos_bucles2;

import javax.swing.JOptionPane;

public class Ciclos_Bucles2 {

    public static void main(String[] args) {
        int num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        
        while(num != 0){
            if(num > 0){
                JOptionPane.showMessageDialog(null, "El numero es positivo");
            }else{
                JOptionPane.showMessageDialog(null, "El numero es negativo");
            }
            
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
        } 
    }
    
}
