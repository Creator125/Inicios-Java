/*
Ejercicio 21: Pedir 10 números, y mostrar al final si se ha
introducido alguno negativo.
 */
package ciclos_bucles21;

import javax.swing.JOptionPane;

public class Ciclos_Bucles21 {

    public static void main(String[] args) {
        int num;
        boolean negativos = false;
        
        for(int i = 1; i <= 10; i++){
           num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
           
           if(num < 0){
               negativos = true;
           }
        }
        
        if (negativos == true) {
            System.out.println("Hay numeros negativos");
        }else{
            System.out.println("No hay numeros negativos");
        }
    }
    
}
