package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Lusvin
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int altura = 0;
        boolean valor = false;
        Scanner sc = new Scanner(System.in);

        while (!valor) {
            System.out.println("Ingrese la altura de la piramide (el número debe ser impar)");
            altura = sc.nextInt();
            if (altura % 2 == 0) {
                valor = false;
            } else {
                valor = true;
            }
        }

        for (int i = 0; i < altura; i++) {

            for (int j = 0; j < altura-i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < (i * 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

}
