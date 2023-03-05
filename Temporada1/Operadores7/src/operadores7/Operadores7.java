/*
Ejercicio 3: Guillermo tiene N dólares. Luis tiene la mitad de lo que
posee Guillermo. Juan tiene la mitad de lo que poseei1 Luis y Guillermo juntos. 
Hacer un programa que calcule e imprima la cantidad de dinero que
tienen entre los tres.
 */
package operadores7;

import java.util.Scanner;

public class Operadores7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double guillermo;
        double luis;
        double juan;
        double total;
        
        //Guardando la cantidad de Guillermo
        System.out.println("Ingrese la catidad de Guillermo");
        guillermo = entrada.nextDouble();
        
        //Calculando la cantidad de las dos personas
        luis = guillermo / 2;
        juan = guillermo + luis;
        total = guillermo + luis + juan;
        
        //Imprimiendo la catidad de los tres
        System.out.println("Guillermo tiene: " + guillermo + " dolares" + "\n"
                        + "Luis tiente: " + luis + " dolares" + "\n"
                        + "Juan tiene: " + juan + " dolares" + "\n"
                        + "El total de entre los tres es: " + total + " dolares" + "\n");
    }
    
}
