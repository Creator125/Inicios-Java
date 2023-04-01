/*
Ejercicio 5: Realizar un juego para adivinar un número. 
Para ello generar un número aleatorio entre 0-100, y luego ir pidiendo números 
indicando “es mayor” o “es menor” según sea mayor o menor con respecto a N. 
El proceso termina cuando el usuario acierta y mostrar el numero de intentos.
 */
package ciclos_bucles5;

import javax.swing.JOptionPane;

public class Ciclos_Bucles5 {

    public static void main(String[] args) {
        int numAleatorio = (int)(Math.random() * 100),
            num,
            intentos = 0;
        
        
        do{
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            
            if(num > numAleatorio){
                System.out.println( "El numero es mayor");
            }else{
                System.out.println( "El numero es menor");
            }
            
            intentos++;
        }while(num != numAleatorio);
        
        JOptionPane.showMessageDialog(null, "¡Felicitaciones!, Adivinaste el numero");
        System.out.println("Numero de intentos: "+ intentos);
    }
    
}
