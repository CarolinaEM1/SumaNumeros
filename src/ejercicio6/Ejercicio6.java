/*
 Pedir números hasta que se teclee un 0, mostrar la suma de todos los numeros introducidos
 */
package ejercicio6;

import javax.swing.JOptionPane;

/**
 *
 * @author Carolina EM
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, suma = 0;
        
        
        
        do {
            numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
            suma = suma+numero;
        }
        while (numero != 0);
        System.out.println("La suma es "+suma);
    }
    
}
