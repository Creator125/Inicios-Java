/*
Ejercicio 12: Pedir una nota de 0 a 10 y mostrarla de la forma:
Insuficiente, Suficiente, Bien, Notable y Sobresaliente.
 */
package condicionales12;

import javax.swing.JOptionPane;

public class Condicionales12 {

    public static void main(String[] args) {
        int nota;
        
        nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota"));
        
        switch (nota) {
            case 0:
            case 1:
            case 2:
                JOptionPane.showMessageDialog(null, "La nota es Insuficiente");
                break;
            case 3:
            case 4:
                JOptionPane.showMessageDialog(null, "La nota es Suficiente");
                break;
            case 5:
            case 6:
                JOptionPane.showMessageDialog(null, "La nota está Bien");
                break;
            case 7:
            case 8:
            case 9:
                JOptionPane.showMessageDialog(null, "La nota es Notable");
                break;
            case 10:
                JOptionPane.showMessageDialog(null, "La nota es Sobresaliente");
                break;
            default:
                JOptionPane.showMessageDialog(null, "El valor de la nota deba se del 0 al 10");
        }
    }
    
}
