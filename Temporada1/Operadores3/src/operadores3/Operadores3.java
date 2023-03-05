/*
Tema: Operadores (decremento e incremento)
 */
package operadores3;

public class Operadores3 {

    public static void main(String[] args) {
        int a = 5;
        int b;
        a++; //Incremento
        a--; //Decremento
        //b = a++; //Primero hace la asignacion y luego el incremento
        //b = ++a; //Primero hace el incremento y luego hace la asginacion
        b = --a;
        
        System.out.println(b);
        System.out.println(a);
    }
    
}
