/*
Ejercicio 19: Dadas 6 notas, escribir la cantidad de alumnos
aprobados, condicionados (=4) y suspensos.
 */
package ciclos_bucles19;

import javax.swing.JOptionPane;

public class Ciclos_Bucles19 {

    public static void main(String[] args) {
        float nota;
        int aprobados = 0,
            suspensos = 0;
        
        for (int i = 1; i <= 6; i++) {
            do{
                nota = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota del estudiante "+ i));
            }while(nota < 0 || nota > 10); //Definiendo el intervalo
            
            if(nota == 4){
                aprobados++;
            }
            if(nota < 4){
                suspensos++;
            }
        }
        
        System.out.println("Estudiantes aprobados: "+ aprobados);
        System.out.println("Estudiantes suspensos: "+ suspensos);
    }
}
