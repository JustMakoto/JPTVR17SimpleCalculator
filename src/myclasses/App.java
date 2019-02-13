/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import java.util.Scanner;

/**
 *
 * @author Melnikov
 */
public class App {
    public void calculate(){
        Scanner scanner = new Scanner(System.in);
        String str = "Введите число: ";
        System.out.println(str);
        float number1 = scanner.nextFloat();
        System.out.println("number1 = "+number1);
        str = "Введите второе число: ";
        System.out.println(str);
        float number2 = scanner.nextFloat();
        str = "Введите знак действия:";
        System.out.println(str);
        String znak = scanner.next();
        float rez=0;
        if(znak.equals("+")){
            rez = number1+number2;
        }else if(znak.equals("-")){
            rez = number1-number2;
        }else if(znak.equals("*")){
            rez = number1*number2;
        }else if(znak.equals("/")){
            rez = number1/number2;
        }

        System.out.println("Полученное число: "+ rez);
        
        StrProba strProba = new StrProba();
        strProba.calculateString();
    }
}
