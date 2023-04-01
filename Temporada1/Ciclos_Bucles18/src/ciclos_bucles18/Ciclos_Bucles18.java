/*
Ejercicio 18: Hacer unas modificaciones al ejercicio anterior suponiendo 
que no se introduce el precio por litro. Solo existen tres productos con precios:

1- 0,6 $/litro

2- 3 $/litro

3- 1,25 €/litro.
*/
package ciclos_bucles18;

import javax.swing.JOptionPane;

public class Ciclos_Bucles18 {

    public static void main(String[] args) {
        int codigoArticulo,
            catidadLitros,
            contArticulo1 = 0,
            contFactura600 = 0;
        float precioLitro = 0,
              impoteFactura = 0,
              facturaTotal = 0;
        
        for (int i = 1; i <= 3; i++){
            codigoArticulo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del articulo " + i));
            catidadLitros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad vendida en litros " + i));
            
            if(i == 1){
                precioLitro = 0.6f;
            }else if(i == 2){
                precioLitro = 3;
            }else{
            precioLitro = 1.25f;
            }
            
            impoteFactura = catidadLitros * precioLitro;
            facturaTotal += impoteFactura;
     
            if (codigoArticulo == 1){
                contArticulo1++;
            }
            if(impoteFactura > 600){
                contFactura600++;
            }
        }
        
        System.out.println("Factura total: "+ facturaTotal);
        System.out.println("Cantidad en litros vendidos del artículo 1: "+ contArticulo1);
        System.out.println("Facturas que emitieron de más de $600: "+ contFactura600);
    }
    
}
