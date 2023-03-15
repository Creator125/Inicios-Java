/*
Ejercicio 9: Pedir el día, mes y año de una fecha e indicar si la
fecha es correcta. Suponiendo que todos los meses son de 30 días.
*/
package condicionales9;

import javax.swing.JOptionPane;

public class Condicionales9 {

    public static void main(String[] args) {
        int dia,
            mes,
            year;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes"));
        year = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año"));
        
        if((dia >= 1) && (dia <= 30)){
            if((mes >= 1) && (mes <= 12)){
                if(year != 0){
                    JOptionPane.showMessageDialog(null, "La fecha está correcta: "+ dia+"/"+mes+"/"+year);
                }else{
                    JOptionPane.showMessageDialog(null, "La fecha está incorrecta: Año incorrecto");
                }
            }else{
              JOptionPane.showMessageDialog(null, "La fecha está incorrecta: Mes incorrecto");
            }
        }else{
            JOptionPane.showMessageDialog(null, "La fecha está incorrecta: Día incorrecto");
        }
    }
    
}
