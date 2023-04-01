/*
Ejercicio 16: Pide un número (que debe estar entre 0 y 10) y mostrar la tabla 
de multiplicar de dicho número
*/
package ciclos_bucles16;

import javax.swing.JOptionPane;

public class Ciclos_Bucles16 {

    public static void main(String[] args) {
        int num, i ,resul;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        
        for (i = 0; i <= 10; i++){
            resul = num * i;
            
            System.out.println(num +" x "+ i +" = "+ resul);
        }
    }
    
}
