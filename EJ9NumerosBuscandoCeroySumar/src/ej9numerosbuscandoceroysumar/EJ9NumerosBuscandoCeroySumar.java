//ESCRIBA UN PROGRAMA QUE LEA 20 NÚMEROS. SI EL NÚMERO LEÍDO ES IGUAL A CERO SE DEBE SALIR DEL BUCLE
//Y MOSTRAR EL MENSAJE "SE CAPTURÓ EL NÚMERO CERO". EL PROGRAMA DEBERÁ CALCULAR Y MOSTRAR EL RESULTADO
//DE LA SUMA DE LOS NÚMEROS LEÍDOS, PERO SI EL NÚMERO ES NEGATIVO NO DEBE SUMARSE. NOTA: RECORDAR EL
//USO DE LA SENTENCIA BREAK.
package ej9numerosbuscandoceroysumar;

import java.util.Scanner;

/**
 * @author iArielARG
 */
public class EJ9NumerosBuscandoCeroySumar {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int numero = 0;
        int suma = 0;
        int i = 0;
        
        System.out.println("BIENVENIDO AL PROGRAMA QUE PERMITE INGRESAR UN MÁXIMO DE 20 NÚMEROS,");
        System.out.println("SUMAR LOS NÚMEROS INGRESADOS Y FINALIZAR EL PROGRAMA SI ENCUENTRA UN NÚMERO");
        System.out.println("ESPECÍFICO.");
        System.out.println("***************************************************************************");
        
        do {
            System.out.println("INGRESE UN NÚMERO Y PRESIONE ENTER");
            numero = leer.nextInt();
            if (numero > 0){
                suma = suma + numero;
            }
            if (numero == 0){
                System.out.println("SE CAPTURÓ EL NÚMERO CERO");
                break;
            }
            i = i + 1;
        } while (i < 20);
        System.out.println("LA SUMA DE LOS NÚMEROS INGRESADOS ES: " + suma);
        System.out.println("****************************************************************************");
        
    }
    
}
