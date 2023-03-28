//CONSIDERA QUE ESTÁS DESARROLLANDO UNA WEB PARA UNA EMPRESA QUE FABRICA MOTORES
//(SUPONEMOS QUE SE TRATA DEL TIPO DE MOTOR DE UNA BOMBA PARA MOVER FLUIDOS).
//DEFINIR UNA VARIABLE TIPOMOTOR Y PERMITIR QUE EL USUARIO INGRESE UN VALOR ENTRE 1 Y 4.
//EL PROGRAMA DEBE MOSTRAR LO SIGUIENTE:
//SI EL TIPO DE MOTOR ES 1, MOSTRAR UN MENSAJE INDICANDO "LA BOMBA ES UNA BOMBA DE AGUA"
//SI EL TIPO DE MOTOR ES 2, MOSTRAR UN MENSAJE INDICANDO "LA BOMBA ES UNA BOMBA DE GASOLINA"
//SI EL TIPO DE MOTOR ES 2, MOSTRAR UN MENSAJE INDICANDO "LA BOMBA ES UNA BOMBA DE HORMIGÓN"
//SI EL TIPO DE MOTOR ES 2, MOSTRAR UN MENSAJE INDICANDO "LA BOMBA ES UNA BOMBA DE PASTA ALIMENTICIA"
//SI NO SE CUMPLE NINGUNO DE LOS VALORES ANTERIORES MOSTRAR EL MENSAJE "NO EXISTE UN VALOR VÁLIDO
//PARA TIPO DE BOMBA"
package ej7webswitchmotores;

import java.util.Scanner;

/**
 * @author iArielARG
 */
public class EJ7WebSwitchMotores {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("BIENVENIDO AL SITIO WEB DEL MAYOR FABRICANTE DE MOTORES");
        System.out.println("*******************************************************");
        System.out.println("INGRESE UN NÚMERO DEL 1 AL 4 Y PRESIONE ENTER");
        int tipoMotor = leer.nextInt();
        
        switch (tipoMotor){
            case 1:
                System.out.println("La bomba, es una bomba de AGUA");
                break;
            case 2:
                System.out.println("La bomba, es una bomba de GASOLINA");
                break;
            case 3:
                System.out.println("La bomba, es una bomba de HORMIGÓN");
                break;
            case 4:
                System.out.println("La bomba, es una bomba de PASTA ALIMENTICIA");
                break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba");
            }
                System.out.println("*******************************************************");
    }
    
}
