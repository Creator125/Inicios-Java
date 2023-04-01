/*
Ejercicio 13: Pedir 10 números. Mostrar la media de los números
positivos, la media de los números negativos y la cantidad de ceros.
 */
package ciclos_bucles13;

import javax.swing.JOptionPane;

public class Ciclos_Bucles13 {

    public static void main(String[] args) {
        int num,
            contPositivo = 0,
            contNegativo = 0,
            contCero = 0;
        float mediaPositivos,
              mediaNegativos;
        
        for(int i = 0; i <= 10; i++){
           num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));

           if(num == 0){
               contCero++;
           }else if(num > 0){
               contPositivo += num;
           }else{
               contNegativo += num;
           }
        }
        
        mediaPositivos =(float) contPositivo / 10;
        mediaNegativos =(float) contNegativo / 10;
        
        //Media de los numeros positivos
        if(contPositivo == 0){
            System.out.println("No se puede sacar la media de los numeros positivos");
        }else{
            System.out.println("Media de los numeros positivos: "+ mediaPositivos);
        }
        
        //Media de los numeros negativos
        if(contNegativo == 0){
            System.out.println("No se puede sacar la media de los numeros negativos");
        }else{
            System.out.println("Media de los numeros negativos: "+ mediaNegativos);
        }
        
        //Total de los 0
        System.out.println("Cantidad de ceros (0): "+ contCero);
    }
    
}
