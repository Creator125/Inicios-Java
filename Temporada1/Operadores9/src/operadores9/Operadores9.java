/*
Ejercicio 5: La calificación final de un estudiante de Informática se calcula 
con base a las calificaciones de cuatro aspectos de su rendimiento académico:
participación, primer examen parcial, segundo examen
parcial y examen final. Sabiendo que las calificaciones
anteriores entran a la calificación final con ponderaciones
del 10%, 25%, 25% y 40%, Hacer un programa que calcule
e imprima la calificación final obtenida por un estudiante.
 */
package operadores9;

import java.util.Scanner;

public class Operadores9 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double participacion, 
               primerExamen,
               segundoExamen,
               examenFinal,
               notaFinal;
        
        //Pidiendo los datos necesarios
        System.out.println("Ingrese las nota de la participación");
        participacion = entrada.nextDouble();
        System.out.println("Ingrese las nota del primer examen parcial");
        primerExamen = entrada.nextDouble();
        System.out.println("Ingrese las nota del segundo examen parcial");
        segundoExamen = entrada.nextDouble();
        System.out.println("Ingrese las nota del examen final");
        examenFinal = entrada.nextDouble();
        
        //Realizando los calculos
        participacion *= 0.10;
        primerExamen *= 0.25;
        segundoExamen *= 0.25;
        examenFinal *= 0.40;
        
        notaFinal = participacion + primerExamen + segundoExamen + examenFinal;
        
        //Imprimiendo el resultado
        System.out.println("La nota final de estudiante es: " + notaFinal);
    }
    
}
