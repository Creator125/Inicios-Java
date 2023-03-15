/*
Ejercicio 11: Construir un programa que simule el funcionamiento de una 
calculadora que puede realizar las cuatro operaciones aritméticas básicas
(suma, resta, producto y división) con valores numéricos enteros.
El usuario debe especificar la operación con el primer carácter del primer
parámetro de la línea de comandos: S o s para la suma, R o r para la resta, 
P, p, M o m para el producto y D o d para la división.
 */
package condicionales11;

import javax.swing.JOptionPane;

public class Condicionales11 {

    public static void main(String[] args) {
        int num1,
            num2,
            resul;
        char operacion;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        operacion = JOptionPane.showInputDialog("Ingrese una operacion para los dos numeros ingresados:\n"
                                                + "S: Suma (+)\n"
                                                + "R: Resta (-)\n"
                                                + "P o M: Producto (*)\n"
                                                + "D: Division (/)").charAt(0);
        /*
        if((operacion == 'S') || (operacion == 's')){
            JOptionPane.showMessageDialog(null, num1 + num2);
        }else if((operacion == 'R') || (operacion == 'r')){
            JOptionPane.showMessageDialog(null, num1 - num2);
        }else if((operacion == 'P') || (operacion == 'p') || (operacion == 'M') || (operacion == 'm')){
            JOptionPane.showMessageDialog(null, num1 * num2);
        }else if((operacion == 'D') || (operacion == 'd')){
            JOptionPane.showMessageDialog(null, num1 / num2);
        }else{
            JOptionPane.showMessageDialog(null, "No sepuede realizar ninguna operación");
        }
        */
        
        switch (operacion) {
            case 's': //Suma
            case 'S':
                resul = num1 + num2;
                JOptionPane.showMessageDialog(null, " La suma es: " + resul);
                break;
            case 'r': //Resta
            case 'R':
                resul = num1 - num2;
                JOptionPane.showMessageDialog(null, "La resta es: " + resul);
                break;
            case 'p': //Producto
            case 'P':
            case 'm':
            case 'M':
                resul = num1 * num2;
                JOptionPane.showMessageDialog(null, "La multiplicacion es: " + resul);
                break;
            case 'd': //Division
            case 'D':
                resul = num1 / num2;
                JOptionPane.showMessageDialog(null, "La división es: " + resul);
                break;
            default:
                JOptionPane.showMessageDialog(null, "No sepuede realizar ninguna operación");
        }
    }
    
}
