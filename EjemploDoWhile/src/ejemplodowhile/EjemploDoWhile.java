//ESTRUCTURA DO/WHILE
package ejemplodowhile;

import java.util.Scanner;

/**
 * @author iArielARG
 */
public class EjemploDoWhile {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String respuesta;
        
        do {
            System.out.println("Desea continuar");
            respuesta = leer.nextLine();
        } while (respuesta.equalsIgnoreCase("S"));
    }
    
}
