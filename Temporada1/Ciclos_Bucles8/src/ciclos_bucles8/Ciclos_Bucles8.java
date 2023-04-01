/*
Ejercicio 8: Pedir un número N, y mostrar todos los números del 1 al N.
*/
package ciclos_bucles8;

import javax.swing.JOptionPane;

public class Ciclos_Bucles8 {

    public static void main(String[] args) {
        int num, i = 0;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        
        while(i < num){
            i++;
            
            System.out.println(i);
        } 
    }
    
}
