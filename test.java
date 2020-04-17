import java.util.Scanner;

public class test {
    public static void main(String args[]) {
       /*
       ЗАДАЧА 4: Обработка поразрядных операций
        System.out.println ("Введите число в бинарном формате");
        Scanner scan = new Scanner (System.in);//Считывание данных с консоли
        String x = scan.nextLine();
        System.out.println ("Число в двоимном формате " + Integer.parseInt(x,2));
        */
        //ЗАДАЧА 5: Таблица умножения
        /*System.out.println("Введите число от 1 до 10 для таблицы умножения");
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

         */
        // ЗАДАЧА 6: Отработка арифметических операций
        /* Scanner scan = new Scanner (System.in);
        Scanner scan2 = new Scanner (System.in);
        Scanner scan3 = new Scanner (System.in);
        int x = scan.nextInt();
        int z = scan2.nextInt();
        int c = scan3.nextInt();
        int v = (x+z+c/3)/2;
        System.out.println(x+z+c/3);
        System.out.println(v);
        if (v>3) System.out.println("Программа выполнена корректно" );
        */
        //Задача №7: Условие вывода данных
        /*Scanner scan = new Scanner (System.in);
        int X = 4, Y = 7, Z = 5;
        int A = scan.nextInt();
        if (X==A||Y==A||Z==A)
        {
            System.out.println ("Данное значение имеется в конcтантах");
        }
        else
        {
            System.out.println ("Такой константы нет!");
        }*/
        //Задача №8: Цикличный вывод данных на экран
        /*for (int i = 1; i < 51; i++)
        System.out.println(i);
        */
        //Задание №9: Ввод/вывод данных для массива
        /*Scanner scan = new Scanner (System.in);
        System.out.println("Задайте размер массива");
        int [] number = new int [scan.nextInt()];
        System.out.println("Заполните массив данными введя " + number.length + " чисел.");
        for (int a = 0; a <number.length;a++) {
            number[a] = scan.nextInt();
        }
        for (int i = 0; i < number.length; i ++)
        {
            System.out.println (number[i] * 2);
        }

         */
        //Задание №10: Ввод/вывод данных для матрицы
        Scanner scan = new Scanner(System.in);
        System.out.println("Задайте размер матрицы: ");
        int[][] number = new int[scan.nextInt()][scan.nextInt()];
        System.out.println("Заполните матрицу данными ");
        for (int a = 0; a < number.length; a++) {
            for (int i = 0; i < number[a].length; i++) {
                number[a][i] = scan.nextInt();
            }
            for (int q = 0; q < number.length; q++) {  //идём по строкам
                for (int j = 0; j < number.length; j++) {//идём по столбцам
                    System.out.print(" " + number[q][j] + " "); //вывод элемента
                }
                System.out.println();//перенос строки ради визуального сохранения табличной формы
            }
            for (int q = 0; q < 1; q++) {
                for (int j = 0; j < number[a].length; j++) {
                    number[a][j] = number[a][j] * 3;
                }
            }

        }
    }
}

