/*
Ejercicio 4: Crear una matriz de tamaño 7x7 y rellenarla de forma que los
elementos de la diagonal principal sean 1 y el resto 0.
*/
package matrices4;

public class Matrices4 {
    public static void main(String[] args) {
        int matriz[][] = new int[7][7];
        int cont = 0;
        
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if(cont % 6 == 0){
                        matriz[i][j] = 1;
                    }else{
                        matriz[i][j] = 0;
                    }
                
                cont++;
            }
        }
        
        System.out.println("\nLa matriz es: ");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(matriz[i][j] +" ");
            }
            System.out.println("");
        }
    }
    
}
