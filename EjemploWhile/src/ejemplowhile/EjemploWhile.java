//ESTRUCTURA WHILE
package ejemplowhile;

import java.util.Scanner;

/**
 * @author iArielARG
 */
public class EjemploWhile {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String respuesta = "S";
        
        while (respuesta.equalsIgnoreCase("S")){
            System.out.println("¿Desea continuar?");
            respuesta = leer.nextLine();
        }
    }
    
}
