/*
Ejercicio 16: Queremos desarrollar una aplicación que nos ayude 
a gestionar las notas de un centro educativo. Cada grupo (o clase)
está compuesto por 5 alumnos. Se pide leer las notas del primer, 
segundo y tercer trimestre de un grupo. Debemos mostrar al final: la nota
media del grupo en cada trimestre, y la media del alumno que se 
encuentra en la posición N (N se lee por teclado).
*/
package arreglos16;

import javax.swing.JOptionPane;

public class Arreglos16 {

    public static void main(String[] args) {
        float grupo[] = new float[5];
        float nTrimestre1,
              nTrimestre2,
              nTrimestre3,
              promedio;
        int posicion;
        
        for (int i = 0; i < 5; i++) {
            nTrimestre1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota del primer trimestre del alumno "+ (i+1)));
            nTrimestre2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota del segundo trimestre del alumno "+ (i+1)));
            nTrimestre3 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota del tecer trimestre del alumno "+ (i+1)));
            
            promedio = (nTrimestre1 + nTrimestre2 + nTrimestre3) / 3;
            
            grupo[i] = promedio;
            
            promedio = 0;
        }
        
        //Imprimiedo las media del grupo
        System.out.println("Los promedios del grupo");
        for(float nota : grupo){
            System.out.println(nota);
        }
        
        //Pidiendo la psocion del alumno para imprimir su promdio
        posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la poscion del alumno"));
        
        System.out.println("\nPromedio del alunmno "+ (posicion + 1) +": "+ grupo[posicion]);
    }
    
}
