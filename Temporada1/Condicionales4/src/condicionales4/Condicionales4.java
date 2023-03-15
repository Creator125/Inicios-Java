/*
Ejercicio 4: En MegaPlaza se hace un 20% de descuento a los clientes cuya 
compra supere los $300. ¿Cuál será la cantidad que pagará una persona por su
compra?
*/
package condicionales4;

import javax.swing.JOptionPane;

public class Condicionales4 {

    public static void main(String[] args) {
        int articulos;
        float precio,
              compraTotal;
        
        articulos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de articulos"));
        precio = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio de cada articulo"));
        
        compraTotal = precio * articulos;
        
        if(compraTotal > 300){
            JOptionPane.showMessageDialog(null, "Se realizó un descuento del 20%");
            JOptionPane.showMessageDialog(null, "Cantidad total de la compra: $"+ compraTotal);
        }else{
            JOptionPane.showMessageDialog(null, "Cantidad total de la compra: $"+ compraTotal);
        }
        
    }
    
}
