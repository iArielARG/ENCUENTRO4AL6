//ESTRUCTURA FOR
package ejemplofor;

/**
 * @author iArielARG
 */
public class EjemploFor {

    public static void main(String[] args) {
        
        System.out.println("for creciendo");
        for (int i = 0; i < 10; i = i +1){
            System.out.println("Imprimo el valor de i: " + i);
        }
        System.out.println("===================================");
        System.out.println("for decreciendo");
        for (int i = 10; i > 0; i = i - 1){
            System.out.println("Imprimo el valor de i: " + i);
        }
    }
    
}
