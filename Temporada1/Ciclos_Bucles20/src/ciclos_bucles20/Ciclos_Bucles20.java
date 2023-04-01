/*
Ejercicio 20: Pedir un número N, introducir N sueldos, y mostrar el
sueldo máximo.
*/
package ciclos_bucles20;

import javax.swing.JOptionPane;

public class Ciclos_Bucles20 {

    public static void main(String[] args) {
        int n, i = 1;
        float sueldo, sueldoMaximo = 0;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la catidad de sueldos a calcular"));
        
        while(i <= n){
            sueldo = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el sueldo "+ i));
            
            if(sueldo > sueldoMaximo){
                sueldoMaximo = sueldo;
            }
            
            i++;
        }
        
        System.out.println("Sueldo Maximo: $"+ sueldoMaximo);
    }
    
}
