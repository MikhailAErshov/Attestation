//Мальчик хочет написать на заборе признание в любви девочке из пятнадцати букв и трех пробелов.
//На каждые три буквы мальчик тратит по 62 см длины забора, а на каждый пробел - 12 см.
//Напишите программу, которая поможет по длине забора (введенной пользователем) выяснить,
//поместится ли на забор такой длины надпись мальчика.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int length3Words = 62;
        int length1Backspace = 12;
        int lengthTotal = length3Words * 5 + length1Backspace * 3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину забора (в см)...");
        int lengthFense = sc.nextInt();
        while (lengthFense < lengthTotal) {
            System.out.println("Длины забора недостаточно, давай увеличим длину");
            lengthFense = sc.nextInt();
        }
        System.out.println("Ок. Длины забора достаточно!");
        sc.close();
    }
}
