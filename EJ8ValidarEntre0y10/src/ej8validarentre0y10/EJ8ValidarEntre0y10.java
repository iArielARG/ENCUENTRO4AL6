//ESCRIBA UN PROGRAMA QUE VALIDE SI UNA NOTA ESTÁ ENTRE 0 Y 10, SI NO ESTÁ ENTRE 0 Y 10
//LA NOTA SE PEDIRÁ DE NUEVO HASTA QUE LA NOTA SEA CORRECTA.
package ej8validarentre0y10;

import java.util.Scanner;

/**
 * @author iArielARG
 */
public class EJ8ValidarEntre0y10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("BIENVENIDO AL PROGRAMA QUE VALIDA SI UN NÚMERO INGRESADO ESTÁ ENTRE 0 Y 10");
        System.out.println("**************************************************************************");
        System.out.println("INGRESE EL NÚMERO QUE DESEA VALIDAR Y PRESIONE ENTER");
        int numero = leer.nextInt();
        boolean bandera = (numero >= 10 || numero < 0);
        
        while (bandera){
            System.out.println("EL NÚMERO INGRESADO ESTÁ FUERA DE RANGO, INGRESE OTRO Y PRESIONE ENTER");
            numero = leer.nextInt();
            bandera = (!(numero <= 10 && numero >= 0));
            System.out.println(bandera);
        }
        System.out.println("EL NÚMERO INGRESADO ES CORRECTO, ESTÁ ENTRE 0 Y 10");
        System.out.println("**************************************************************************");
    }
    
}
