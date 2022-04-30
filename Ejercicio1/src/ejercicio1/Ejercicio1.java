/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Lusvin
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        int num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("El primer número " + num1 + " es el mayor.");
        } else {
            System.out.println("El segundo número " + num2 + " es el mayor.");
        }
    }

}
