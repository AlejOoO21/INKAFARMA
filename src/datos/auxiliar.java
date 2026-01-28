
package datos;

import java.awt.event.KeyEvent;


public class auxiliar {
    
    public static void validarNumeros(KeyEvent tecla, String texto, int cantidad){
        
        char t=tecla.getKeyChar();
        if(Character.isDigit(t) && texto.length()<cantidad){
            
        }else{
            tecla.consume();
        }
        
    }
    
}
