/*
Tema: Operadores (la case Math)
 */
package operadores4;

public class Operadores4 {

    public static void main(String[] args) {
        //int num1 = (int) Math.sqrt(9);
        double raiz = Math.sqrt(29.87);
        double base = 5;
        double exponete = 2;
        double resultado1 = Math.pow(base, exponete);
        double num1 = 6.98;
        long resultado2 = Math.round(num1);
        double num2 = Math.random();
        
        System.out.println(raiz);
        System.out.println(resultado1);
        System.out.println(resultado2);
        System.out.println(num2);
    }
    
}
