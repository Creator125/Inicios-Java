/*
Tema: Entrada y salida de datos con JOptionPane
 */
package entrada_salida_joptionpane;

import javax.swing.JOptionPane;

public class Entrada_Salida_JoptionPane {

    public static void main(String[] args) {
        String nombre;
        int edad;
        char letrafav;
        double estatura;
        
        //Usando el JOptionPane en las variables
        nombre = JOptionPane.showInputDialog("Ingrese tu nombre");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tu edad"));
        letrafav = JOptionPane.showInputDialog("Ingrese tu letra favorita").charAt(0);
        estatura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese tu estatura"));
        
        //Visualizando los datos almacenados en las variables
        JOptionPane.showMessageDialog(null, "Tu nombre es: " + nombre);
        JOptionPane.showMessageDialog(null, "Tu edad es: " + edad);
        JOptionPane.showMessageDialog(null, "Tu letra favorita es: " + letrafav);
        JOptionPane.showMessageDialog(null, "Tu estatura es: " + estatura);
    }
    
}
