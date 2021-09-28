/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie.n2;

import java.util.Scanner;

/**
 *
 * @author user2
 */
public class ZadanieN2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Напиши трёхзначное число: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int num1 = number / 100;
        int num2 = (number % 100)/10;
        int num3 = number % 10;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        int num4 = num1 + num2 + num3;
        System.out.println("Сумма: "+num4);
                
        
        // TODO code application logic here
    }
    
}
