/* Задача №7: Условие вывода данных
Необходимо написать программу, где бы пользователю предлагалось ввести с клавиатуры число в переменную T.
В программе должны присутствовать константы X, Y, Z.
Программа должна сравнивать введенное значение с клавиатуры со значением констант
и вывести на экран сообщение "Данное значение имеется в константах" если T=X или Y или Z.
Если переменная отличается от констант, нужно вывести оповещение "Такой константы нет!"
 */

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int x = 7;
        int y = 2;
        int z = 4;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int T = in.nextInt();

        if(T == x || T == y || T == z) {
            System.out.println("Данное значение имеется в константах");
        }
        else {
            System.out.println("Такой константы нет!");
        }
    }
}
