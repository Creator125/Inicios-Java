/*
Ejercicio 14: Hacer un programa que pase de Kg a otra unidad de
medida de masa, mostrar en pantalla un menú con las opciones posibles.
 */
package condicionales14;

import javax.swing.JOptionPane;

public class Condicionales14 {

    public static void main(String[] args) {
        float kg, //Kilogramo
              hg = 0.1f, //Hectogramo
              Dg = 0.01f, //Decagramo
              g = 0.001f; //gramo
        float unidad;
        int opcion;
        
        
        kg = Float.parseFloat(JOptionPane.showInputDialog("Ingrese una unidad en kilogramo (kg)"));
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Selecione conversion: \n"
              + "1. Hectogramo (hg).\n"
              + "2. Decagramo (Dg).\n"
              + "3. gramo (g)"));
      
        switch (opcion) {
            case 1:
                unidad = kg / hg;
                
                JOptionPane.showMessageDialog(null, kg + "kg equivale a "+ unidad +"hg");
                break;
            case 2:
                unidad = kg / Dg;
                
                JOptionPane.showMessageDialog(null, kg + "kg equivale a "+ unidad +"Dg");
                break;
            case 3:
                unidad = kg / g;
                
                JOptionPane.showMessageDialog(null, kg + "kg equivale a "+ unidad +"g");
                break;
            default:
                JOptionPane.showMessageDialog(null, "La opcion ingresada no es correcta");
        }
               
    }
    
}
