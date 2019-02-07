/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecalculator;

import java.util.Scanner;

/**
 *
 * @author Melnikov
 */
public class SimpleCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number1 = scanner.nextInt();
        System.out.println("number1 = "+number1);
        System.out.println("Введите второе число: ");
        int number2 = scanner.nextInt();
        System.out.println("Введите знак действия:");
        String znak = scanner.next();
        int rez=0;
        if(znak.equals("+")){
            rez = number1+number2;
        }else if(znak.equals("-")){
            rez = number1-number2;
        }else if(znak.equals("*")){
            rez = number1*number2;
        }
        System.out.println("Полученное число: "+ rez);
        
    }
    
}
