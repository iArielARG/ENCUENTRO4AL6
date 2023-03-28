//IMPLEMENTAR UN PROGRAMA QUE LE PIDA DOS NÚMEROS ENTEROS AL USUARIO Y DETERMINE
//SI AMBOS O ALGUNO DE ELLOS ES MAYOR A 25
package ej6unoodosmayor25;

import java.util.Scanner;

/**
 * @author iArielARG
 */
public class EJ6UnoODosMayor25 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("BIENVENIDO AL PROGRAMA QUE ANALIZA SI UN NÚMERO O AMBOS SON MAYORES A 25");
        System.out.println("************************************************************************");
        System.out.println("INGRESE UN NÚMERO Y PRESIONE ENTER");
        int numero1 = leer.nextInt();
        System.out.println("INGRESE OTRO NÚMERO Y PRESIONE ENTER");
        int numero2 = leer.nextInt();
        
        if (numero1 > 25 && numero2 > 25){
            System.out.println("Ambos números son mayores a 25");
        }else if (numero1 > 25){
            System.out.println("El primer número ingresado es mayor a 25");
        }else if (numero2 > 25){
            System.out.println("El segundo número ingresado es mayor a 25");
        }else{
            System.out.println("Ninguno de los números ingresados es mayor a 25");
        }
        System.out.println("************************************************************************");
    }
    
}
