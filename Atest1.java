package Aston;

import java.util.Scanner;

public class Atest1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите числo a =  ");
        int a =  scan.nextInt();
        System.out.print("Введите числo a =  ");
        int b = scan.nextInt();

        if (a>b)
            System.out.println("Результат : a > b");
        else if (a<b)
            System.out.println("Результат : a < b");
        else
            System.out.println("Результат : a = b");

        System.out.println("a + b = " + vichMat(a,b,"+"));
        System.out.println("a - b = " + vichMat(a,b,"-"));
        System.out.println("a * b = " + vichMat(a,b,"*"));
        System.out.println("a / b = " + vichMat(a,b,"/"));
    }
        static double vichMat(int a, int b, String znak) {
        double oper =0 ;
        if (b==0) {
            throw new ArithmeticException ("Exception: деление на 0 ");
        } else {
            switch (znak) {
                case "+":
                    oper = a + b;
                    break;
                case "-":
                    oper = a - b;
                    break;
                case "*":
                    oper = a * b;
                    break;
                case "/":
                    oper = a / b;
                    break;
                default:

            }
            return oper;
        }
    }
}
