//REALIZAR UN PROGRAMA QUE LEA 4 NÚMEROS (COMPRENDIDOS ENTRE 1 Y 20) E IMPRIMA EL NÚMERO INGRESADO
//SEGUIDO DE TANTOS ASTERISCOS COMO INDIQUE SU VALOR. POR EJEMPLO:
//5*****
//3***
//11***********
//2**
package ej10leercuatronumerosmostrarasterisco;

import java.util.Scanner;

/**
 * @author iArielARG
 */
public class EJ10LeerCuatroNumerosMostrarAsterisco {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int numero1;
        int numero2;
        int numero3;
        int numero4;
        boolean bandera;
        
        System.out.println("BIENVENIDO AL PROGRAMA QUE SOLICITA CUATRO NÚMEROS Y MUESTRA LA CANTIDAD");
        System.out.println("CON ASTERISCOS.");
        System.out.println("========================================================================");
        System.out.println("INGRESE UN NÚMERO ENTRE 1 Y 20 Y PRESIONE ENTER");
        do {
            numero1 = leer.nextInt();
            bandera = (numero1 <= 20 && numero1 > 0);
        }while (!bandera);
        
        System.out.println("INGRESE UN NÚMERO ENTRE 1 Y 20 Y PRESIONE ENTER");
        do {
            numero2 = leer.nextInt();
            bandera = (numero2 <= 20 && numero2 > 0);
        }while (!bandera);
        
        System.out.println("INGRESE UN NÚMERO ENTRE 1 Y 20 Y PRESIONE ENTER");
        do {
            numero3 = leer.nextInt();
            bandera = (numero3 <= 20 && numero3 > 0);
        }while (!bandera);
        
        System.out.println("INGRESE UN NÚMERO ENTRE 1 Y 20 Y PRESIONE ENTER");
        do {
            numero4 = leer.nextInt();
            bandera = (numero4 <= 20 && numero4 > 0);
        }while (!bandera);
        
        System.out.println("========================================================================");
        System.out.println("ASÍ QUEDARON REPRESENTADOS");
        System.out.print(numero1);
        for (int i = 0; i < numero1; i = i + 1){
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.print(numero2);
        for (int i = 0; i < numero2; i = i + 1){
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.print(numero3);
        for (int i = 0; i < numero3; i = i + 1){
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.print(numero4);
        for (int i = 0; i < numero4; i = i + 1){
            System.out.print("*");
        }
        System.out.println("");
        System.out.println("========================================================================");
        System.out.println("GRACIAS POR UTILIZAR NUESTRO SERVICIO :)");
    }
    
}
