/**
 * Created by mikesavenkov on 4/21/14.
 */

import static java.lang.Math.abs;
import static java.lang.System.out;

/**
 * Курсовая работа: Системы счисления и запись целых чисел в памяти компьютера
 * Автор: Соловьев Дмитрий Николаевич
 * Научный руководитель: Завгородний Михаил Григорьевич
 */


public class Main1 {
    public static void main(String[] args) {
         /*Расскоментируйте нужный для работы метод и задайте необходимые данные*/
        //convertBin(7);
        //invert(15);
        //firstVersion(7);
        //secondVersion(7);
        //System.out.println(plus(7, 12));
        //System.out.println(minus(10, 4));
        //System.out.println(multiply(9, 6));
        //addition9(-10);
        //plusAddition9(-45, -38);
        //minusAddition9(53, 7);
        //addition10(-10);
        //plusAddition10(34, 523);
        //minusAddition10(53, 7);
    }

    //Перевод десятичного числа в двоичную систему
    public static void convertBin(int a) {
        int b;
        String temp = "";
        while (a != 0) {
            b = a % 2;
            temp = b + temp;
            a = a / 2;
        }
        out.println("Двоичное представление: " + temp);
    }

    //Инвертирование числа побитно
    private static void invert(int a) {
        int b = ~a;
        String c = Integer.toBinaryString(b);
        out.print("Инвертированное число: " + b + " (" + c + ")");
    }

    //Первое представление десятичного числа в виде двоичного числа со знаком. В наше время не используется.
    private static void firstVersion(int a) {
        invert(a);
    }

    //Второе представление десятичного числа в виде двоичного числа со знаком. Дополнение до двух.
    private static void secondVersion(int a) {
        int b = ~a;
        b++;
        out.println(b);
    }

    //Сложение с использование логических операций
    public static Integer plus(int a, int b) {
        for (int i = 0; i < 9; i++) {
            int c = a ^ b;
            b = a & b;
            b = b << 1;
            a = c;
        }
        return a;
    }

    //Нахождение разности с использованием логических операций
    public static Integer minus(int a, int b) {
        int c = ~b;
        c++;
        a += c;

        return a;
    }

    //Умножение с использованием логических операций
    public static int multiply(int a, int b) {
        int i=0, c=0;
        while(b!=0){
            while ((b & 1) == 0) {
                i++;
                b = b >> 1;
            }
            a=a<<i;
            c=plus(c, a);
            b=b>>1;
            i=1;
        }
        return c;
    }

    //Дополнение  до 9
    public static void addition9(int a){
        int c,g;
        String temp = "";
        if (a==0)
            System.out.println(0);
        else{
            if(a>0){
                System.out.println("0"+a);
            }
            else{
                a = abs(a);
                  while (a != 0){
                    c = a%10;
                    a = a/10;
                    g = 9-c;
                    temp = g + temp;
                  }
               System.out.println("9"+temp);
            }
        }
    }
    public static void plusDop_9 (int a, int b){

    }

    public static void minusDop_9 (int a, int b){

    }

    //Дополнение  до 10
    public static void addition10(int a){
        int b,c,g;
        String temp = "";
        if (a==0)
            System.out.println(0);
        else{
            if(a>0){
                System.out.println("0"+a);
            }
            else{
                a = abs(a);
                while (a != 0){
                    c = a%10;
                    a = a/10;
                    g = 9-c;
                    temp = g + temp;
                }
                b = Integer.parseInt("9"+temp);
                System.out.println(b+1);
            }

        }
    }

    public static void plusDop_10 (int a, int b){

    }

    public static void minusDop_10 (int a, int b){

    }

}

