import java.util.Scanner;

public class test {
    public static void main (String args[]){
       /*
       ЗАДАЧА 4: Обработка поразрядных операций
        System.out.println ("Введите число в бинарном формате");
        Scanner scan = new Scanner (System.in);//Считывание данных с консоли
        String x = scan.nextLine();
        System.out.println ("Число в двоимном формате " + Integer.parseInt(x,2));
        */
       //ЗАДАЧА 5: Таблица умножения
        System.out.println("Введите число от 1 до 10 для таблицы умножения");
        Scanner scan = new Scanner (System.in);
        int x = scan.nextInt();

                System.out.println( x + " * 1 = " + (x*1));
                System.out.println( x + " * 2 = " + (x*2));
                System.out.println( x + " * 3 = " + (x*3));
                System.out.println( x + " * 4 = " + (x*4));
                System.out.println( x + " * 5 = " + (x*5));
                System.out.println( x + " * 6 = " + (x*6));
                System.out.println( x + " * 7 = " + (x*7));
                System.out.println( x + " * 8 = " + (x*8));
                System.out.println( x + " * 9 = " + (x*9));
                System.out.println( x + " * 10 = " + (x*10));
        }

    }

