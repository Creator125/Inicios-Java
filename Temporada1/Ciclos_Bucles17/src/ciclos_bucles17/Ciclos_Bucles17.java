/*
Ejercicio 17: Una empresa que se dedica a la venta de desinfectantes 
necesita un programa para gestionar las facturas. En cada factura figura: el
código del artículo, la cantidad vendida en litros y el precio por litro. 
Se pide de 5 facturas introducidas: Facturación total, cantidad en litros
vendidos del artículo 1 y cuantas facturas se emitieron de más de $600.
*/
package ciclos_bucles17;

import javax.swing.JOptionPane;

public class Ciclos_Bucles17 {

    public static void main(String[] args) {
        int codigoArticulo,
            catidadLitros,
            contArticulo1 = 0,
            contFactura600 = 0;
        float precioLitro,
              impoteFactura = 0,
              facturaTotal = 0;
        
        for (int i = 1; i <= 5; i++){
            codigoArticulo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del articulo " + i));
            catidadLitros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad vendida en litros " + i));
            precioLitro = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio del producto " + i));
            
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
