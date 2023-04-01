/*
Ejercicio 4: Pedir números hasta que se teclee uno negativo, y
mostrar cuántos números se han introducido.
 */
package ciclos_bucles4;

import javax.swing.JOptionPane;

public class Ciclos_Bucles4 {

    public static void main(String[] args) {
        int num,
            contador = 0;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        
        while(num >= 0){
            contador++;
            
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
        }
        
        System.out.println("Numeros ingresados: " + contador);
    }
    
}
