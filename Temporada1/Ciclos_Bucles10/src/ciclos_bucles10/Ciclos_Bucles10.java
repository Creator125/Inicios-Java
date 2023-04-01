/*
Ejercicio 10: Pedir 10 números y escribir la suma total.
*/
package ciclos_bucles10;

import javax.swing.JOptionPane;

public class Ciclos_Bucles10 {

    public static void main(String[] args) {
        int num,
            suma = 0;
        
        for(int i = 0; i < 10; i++){
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            
            suma += num;
            
            System.out.println("Numero ingresado: "+ num);
        }
        
        System.out.println("Suma total de los numeros ingresados: "+ suma);
    }
    
}
