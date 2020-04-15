import java.util.Scanner;

public class test {
    public static void main (String args[]){
        System.out.println ("Введите число в бинарном формате");
        Scanner scan = new Scanner (System.in);//Считывание данных с консоли
        String x = scan.nextLine();
        System.out.println ("Число в двоимном формате " + Integer.parseInt(x,2));


    }
}
