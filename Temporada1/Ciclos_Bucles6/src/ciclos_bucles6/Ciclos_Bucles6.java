/*
Ejercicio 6: Pedir números hasta que se teclee un 0, mostrar la suma de todos
los números introducidos.
 */
package ciclos_bucles6;

import javax.swing.JOptionPane;

public class Ciclos_Bucles6 {

    public static void main(String[] args) {
        int num,
            suma = 0;
           
        do{
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            
            suma += num;
        }while(num != 0);
        
        System.out.println("Suma total de los numeros ingresados: "+ suma);
    }
    
}
