/*
Ejercicio 13: Hacer un programa que simule un cajero automático con un saldo
inicial de 1000 Dolares, con el siguiente menu de opciones:

1. Ingresar dinero a la cuenta.
2. Retirar dinero de la cuenta.
3. Salir
*/
package condicionales13;

import javax.swing.JOptionPane;

public class Condicionales13 {

    public static void main(String[] args) {
       double saldo = 1000;
       int opcion;
       
      opcion = Integer.parseInt(JOptionPane.showInputDialog("Binvenido a su cajero automatico: \n"
              + "1. Ingresar dinero a la cuenta.\n"
              + "2. Retirar dinero de la cuenta.\n"
              + "3. Salir"));
      
        switch(opcion) {
            case 1:
                double dineroIngresado;
                dineroIngresado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a ingresar en la cuenta"));
                
                saldo += dineroIngresado;
                
                JOptionPane.showMessageDialog(null, "Cantidad total: " + saldo);
                break;
            case 2:
                double dineroRetirado;
                dineroRetirado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a retirar"));
                
                if(dineroRetirado <= saldo){
                    saldo -= dineroRetirado;
                }else{
                    JOptionPane.showMessageDialog(null, "Saldo insuficiente para esta accion");
                }
                
                JOptionPane.showMessageDialog(null, "Cantidad total: " + saldo);
                break;
            case 3:
                break;
            default:
                JOptionPane.showMessageDialog(null, "Se equvicó de opcion");
        }
    }
    
}
