/*
Ejercicio 22: Pedir 5 calificaciones de alumnos y decir 
al final si hay algún suspenso.
 */
package ciclos_bucles22;

import javax.swing.JOptionPane;

public class Ciclos_Bucles22 {

    public static void main(String[] args) {
        float nota;
        boolean suspenso = false;
        
        for(int i = 1; i <= 5; i++){
           nota = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota del estudiante "+ i));
           
           if(nota < 4){
               suspenso = true;
           }
        }
        
        if (suspenso == true) {
            System.out.println("Hay notas suspenso");
        }else{
            System.out.println("No hay notas suspenso");
        }
    }
    
}
