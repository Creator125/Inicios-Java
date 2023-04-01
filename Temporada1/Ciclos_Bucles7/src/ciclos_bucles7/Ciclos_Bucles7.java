/*
Ejercicio 7: Pedir números hasta que se introduzca uno negativo, y
calcular la media.
 */
package ciclos_bucles7;

import javax.swing.JOptionPane;

public class Ciclos_Bucles7 {

    public static void main(String[] args) {
        int num,
            suma = 0,
            i = 0;
        float media;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
           
        while(num >= 0){
            suma += num;
            i++;
            
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        }
        
        media =(float) suma / i;
        
        if(i == 0){
            System.out.println("La division entre cero (0) no existe");
        }else{
            System.out.println("Media de los numeros ingresados: "+ media);
        }

    }
    
}
