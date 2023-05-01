/*
Tema: Busquedas (Buscqueda secuencial)
 */
package busquedasecuencial;

import javax.swing.JOptionPane;

public class BusquedaSecuencial {
    public static void main(String[] args) {
        int arreglo[] ={2,7,9,3,5};
        int dato;
        boolean comprobacion = false;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero a buscar"));
        
        //Busqueda secuencial
        int i = 0;
        while(i < 5 && comprobacion == false){
            if(arreglo[i] == dato){
                comprobacion = true;
            }
            
            i++;
        }
        
        if(comprobacion == false){
            JOptionPane.showMessageDialog(null, "El numero no se encontró en el arreglo");
        }else{
            JOptionPane.showMessageDialog(null, "El numero se encontró en el arreglo desde la poscion "+(i+1));
        }
    }
    
}
