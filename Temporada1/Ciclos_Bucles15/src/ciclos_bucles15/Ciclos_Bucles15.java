/*
Ejercicio 15: Dadas las edades y alturas de 5 alumnos, mostrar la edad y
la estatura media, la cantidad de alumnos mayores de 18 años, y la
cantidad de alumnos que miden más de 1.75
*/
package ciclos_bucles15;

import javax.swing.JOptionPane;

public class Ciclos_Bucles15 {

    public static void main(String[] args) {
        int edad,
            contAlumnosMayores = 0,
            contAlumnoMedida = 0;
        float estatura,
              mediaEdad = 0,
              mediaEstatura = 0;
        
        for(int i = 1; i <= 5; i++){
            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del alumno "+ i));
            estatura = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la estatura del alumno "+ i));
            
            if(edad > 18){
                contAlumnosMayores++;
            }
            if(estatura > 1.75f){
                contAlumnoMedida++;
            }
            
            //Acumulando los valores
            mediaEdad += edad;
            mediaEstatura += estatura;
        }
        
        mediaEdad /= 5;
        mediaEstatura /= 5;
        
        System.out.println("Edad promedio: "+ mediaEdad);
        System.out.println("Estatura promedio: "+ mediaEstatura);
        System.out.println("Alumnos mayores de 18: "+ contAlumnosMayores);
        System.out.println("Alumnos que miden más de 1.75: " + contAlumnoMedida);
        
    }
    
}
