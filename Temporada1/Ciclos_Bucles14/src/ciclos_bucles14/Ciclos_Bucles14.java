/*
Ejercicio 14: Pedir 10 sueldos. 
Mostrar su suma y cuantos hay mayores de $1000.
*/
package ciclos_bucles14;

import javax.swing.JOptionPane;

public class Ciclos_Bucles14 {

    public static void main(String[] args) {
        double sueldos, suma = 0;
        int contSueldoMayor = 0;
        
        for(int i = 0; i < 10; i++){
            sueldos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su sueldo"));
            
            suma += sueldos;
            
            if(sueldos > 1000){
                contSueldoMayor++;
            }
        }
        
        System.out.println("Sueldo total: $"+ suma);
        System.out.println("Sueldos mayores a $1000: "+ contSueldoMayor);
    }
    
}
