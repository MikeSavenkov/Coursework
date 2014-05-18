/**
 * Created by mikesavenkov on 4/21/14.
 */

import static java.lang.System.*;

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
        //multiply(7, 7);

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
    public static void multiply(int a, int b) {

        if (b == 0) {
            System.out.println(0);
        } else {
            int c=a;
            while (b != 0) {
                int i = 1;
                while ((b & 1) == 0) {
                    i++;
                    b = b >> 1;
                }
                c = a << i;
                a=plus(a, c);
            }
            System.out.println(a);
        }

    }
}

