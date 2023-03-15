/*
Ejercicio 2: Pedir dos números y decir cual es el mayor o si son iguales.
*/
package condicionales2;

import javax.swing.JOptionPane;

public class Condicionales2 {

    public static void main(String[] args) {
        int num1,
            num2;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
        
        if(num1 > num2){
            JOptionPane.showMessageDialog(null, "El numero mayor es: " + num1);
        }else if(num2 > num1){
            JOptionPane.showMessageDialog(null, "El numero mayor es: " + num2);
        }else{
            JOptionPane.showMessageDialog(null, "Ambos numeros son iguales");
        }
    }
    
}
