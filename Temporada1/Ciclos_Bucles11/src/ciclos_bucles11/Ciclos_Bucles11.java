/*
Ejercicio 11: Diseñar un programa que muestre el producto de los 10 primeros
números impares.
*/
package ciclos_bucles11;

public class Ciclos_Bucles11 {

    public static void main(String[] args){
        long producto = 1;
        
        for (int i = 1; i < 20; i += 2){
            producto *= i;
        }
        
        System.out.println("El producto es: "+ producto);
    }
    
}
