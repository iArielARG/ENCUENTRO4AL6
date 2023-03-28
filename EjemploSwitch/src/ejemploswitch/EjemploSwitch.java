//ESTRUCTURA SWITCH
package ejemploswitch;

import java.util.Scanner;

/**
 * @author iArielARG
 */
public class EjemploSwitch {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("INGRESE UNA OPCIÓN Y PRESIONE ENTER");
        int opcion = leer.nextInt();
        
        switch (opcion){
            case 1:
                System.out.println("Esta línea de código se ejecuta si opción es igual a 1");
                break;
            case 2:
                System.out.println("Esta línea de código se ejecuta si opción es igual a 2");
                break;
            default:
                System.out.println("El valor ingresado en la variable opcion es diferente a todos los casos analizados por el SWITCH");
        }
    }
    
}
