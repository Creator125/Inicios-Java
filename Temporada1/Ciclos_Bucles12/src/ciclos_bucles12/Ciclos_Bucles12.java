/*
Ejercicio 12: Pedir un número y calcular su factorial.

N! = 1*2*3*...*N
*/
package ciclos_bucles12;

import javax.swing.JOptionPane;

public class Ciclos_Bucles12 {

    public static void main(String[] args) {
        int num, factorial = 1;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        
        for (int i = 0; i < num; i++) {
            factorial *= i;
        }
        
        System.out.println("Factorial: "+ factorial);
    }
    
}
