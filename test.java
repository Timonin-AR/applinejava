import java.io.*;
import java.util.Scanner;
import java.util.Arrays;



public class test {
    public static void main(String args[]) throws IOException {
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

        /*
        //ЗАДАНИЕ 11
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine ();
        System.out.println(str);
         */

        /*
        //ЗАДАНЕ 12
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine ();
        System.out.print(str.replaceAll(" ",""));
        */

        /*
        //ЗАДАНИЕ 13
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine ();
        String str2 = scan.nextLine ();
        if (str.length()>str2.length())
        {
         System.out.println(str);
        }
        else if (str.length()<str2.length()){
            System.out.println(str2);
        }
        else if (str.length()==str2.length()){
            System.out.println("Длины равны");
        }
         */

        //ЗАДАНИЕ 14
        /*
        Scanner scan = new Scanner(System.in);
        String S = scan.nextLine();
        System.out.println(S+" - строка");
        int X = Integer.parseInt(S);
        System.out.println(X+" - число");
        double Y = Double.parseDouble(S);
        System.out.println(Y+" - double");
         */

        /*
        //ЗАДАНИЕ 10 переписанное
        multiply(createMatrix());
        }
        public static int[][] createMatrix() throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите размер матрицы X");
            int sizeX = Integer.parseInt(reader.readLine());
            System.out.println("Введите размер матрицы Y");
            int sizeY = Integer.parseInt(reader.readLine());

            int[][] matrix = new int[sizeX][sizeY];
            System.out.println("Заполните матрицу значениями");
            for (int i = 0; i < sizeX; i++) {
                for (int j = 0; j < sizeY; j++) {
                    System.out.println(String.format("Введите число в ячейку [%s][%s]", i, j));
                    matrix[i][j] = Integer.parseInt(reader.readLine());
                }
            }
            return matrix;
        }
        public static void multiply(int[][] matrix){
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = matrix[i][j] * 3;
                }
            }
            for (int[] ints : matrix) {
                for (int anInt : ints) {
                    System.out.print("[" + anInt + "]");
                }
                System.out.println("");
            }
        }
         */

        /*
        //Задача №15: Сортировка данных в массиве
        Scanner scan = new Scanner(System.in);
        System.out.println("Задайте размер массива");
        int[] number = new int[scan.nextInt()];
        System.out.println("Заполните массив данными введя " + number.length + " чисел.");
        for (int a = 0; a < number.length; a++) {
            number[a] = scan.nextInt();
        }
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println( "\nСортировка пузырьком");

            for (int i = number.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {

                    if (number[j] > number[j + 1]) {
                        int tmp = number[j];
                        number[j] = number[j + 1];
                        number[j + 1] = tmp;
                    }
                }
            }
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
         */

        /*
        //Задача №16: Выгрузка данных из файла на экран
        String read;
        try (BufferedReader Bread = new BufferedReader (new FileReader("D:\\test.txt")))
        {
            while ((read = Bread.readLine()) !=null) {
                System.out.println(read);}
        }
        catch (IOException exc)
        {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
        */

        /*
        //Задача №17: Запись данных в файл
        String str;
        BufferedReader Bstr = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Признак конца ввода - строка 'stop' ");
        try (FileWriter fw = new FileWriter ( "D:\\test.txt"))
            {
                do {
                    System.out.print(": ");
                    str = Bstr.readLine();

                    if (str.compareTo("stop") == 0) break;

                        str = str + "\r\n";
                        fw.write(str);
                }
                while (str.compareTo("stop") != 0);

            } catch (IOException exc)
        {
            System.out.println("Ошибка ввода-вывода: "+exc);
        }
        */

        /*
        //Задача №18: Выгрузка данных из файла, проверка и перезапись
        System.out.println("Файл содержит текст:");
         String s;
        int a = 0;
        int b = 0;
        System.out.println("Вывод текста из файла:\n");
        try (BufferedReader br = new BufferedReader(new FileReader("D:\\test.txt"))) {
            while ((s = br.readLine()) != null) {
                System.out.println(s);
                ++a;
            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода вывода:" + exc);
        }
        System.out.println(a);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Необходимо ввести текст:\n");
        try (FileWriter fw = new FileWriter("D:\\test.txt")) {
            do {
                b++;
                System.out.println(": ");
                s = br.readLine();
                if (b > a) break;
                s = s + "\r\n";
                fw.write(s);
            } while (b < a);
        } catch (IOException exc) {
            System.out.println("Ошибка ввода вывода:" + exc);
        }
        System.out.println(b);
        */

        /*
        //ИТОГОВАЯ ЗАДАЧА 1
        BufferedReader Bstr = new BufferedReader(new InputStreamReader(System.in));
        String str = Bstr.readLine();
        int n = 0;
        for (int i = str.length() - 1, j = 1; i >= 0; i--, j *= 2) {
            n += (str.charAt(i) - '0') * j;
        }
        System.out.println("\"" + str + "\" -> " + n);
        */

        /*
        //Итоговая задача №2
        Scanner scan = new Scanner(System.in);
        System.out.println("Задайте размер массива");
        int[] number = new int[scan.nextInt()];
        System.out.println("Заполните массив данными введя " + number.length + " чисел.");
        for (int a = 0; a < number.length; a++) {
            number[a] = scan.nextInt();
        }
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        for (int left = 0; left < number.length; left++) {
            int value = number[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < number[i]) {
                    number[i + 1] = number[i];
                } else {
                    break;
                }
            }
            number[i + 1] = value;
        }
        System.out.println(Arrays.toString(number));
         */


        //Итоговая задача №3
        System.out.println("Введите текущий курс доллара");
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        System.out.println("Курс доллара: "+ a);
        System.out.println("Введите количество рублей");
        Scanner scan2 = new Scanner(System.in);
        double b = scan2.nextDouble();
        System.out.println("Количество рублей: "+b);
        double c = b/a;
        System.out.println("По текущему курсу у вас будет: "+(double) Math.round (c*100d)/100d + " Долларов");


    }
}








