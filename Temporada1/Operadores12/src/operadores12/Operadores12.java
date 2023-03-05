/*
Ejercicio 8: Construir un programa que calcule y muestre por pantalla las 
raíces de la ecuación de segundo grado de coeficientes reales.
*/
package operadores12;

import java.util.Scanner;

public class Operadores12 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a,
            b,
            c,
            x,
            ecuacion;
        
        //Ingresando los valores de las variables
        System.out.println("Ingrese el valor de 'a'");
        a = entrada.nextInt();
        System.out.println("Ingrese el valor de 'b'");
        b = entrada.nextInt();
        System.out.println("Ingrese el valor de 'c'");
        c = entrada.nextInt();
        
        //Ecuaciones
        x = (int)((-b + (Math.sqrt(b) - (4 * a * c))) / 2 * a);
        ecuacion =(int)(Math.sqrt(a * x) + (b * x) + c);
        
        //Resultado
        System.out.println("El resultado de la ecuacion es: " + ecuacion);
        
        
    }
    
}
