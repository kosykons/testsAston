package Aston;

import java.util.Scanner;

public class Atest2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введитк  строку a: ");
        String a = scan.nextLine();
        System.out.println("Введитк  строку b: ");
        String b = scan.nextLine();

        if (a.equals(b))
            System.out.println("Cтроки идентичны");
        else
            System.out.println("Строки не идентичны");

    }
}

