package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a, b;
        String oper ;
        boolean temp;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Введите число a: ");

            while (true) {
                if (scan.hasNextDouble()) {
                    a = scan.nextDouble();
                    break;
                } else {
                    System.out.print("Некорректный ввод. Введите снова число a: ");
                    scan.next();
                }
            }

            System.out.print("Введите число b: ");

            while (true) {
                if (scan.hasNextDouble()) {
                    b = scan.nextDouble();
                    break;
                } else {
                    System.out.print("Некорректный ввод. Введите снова число b: ");
                    scan.next();
                }
            }

            System.out.print("Введите операцию: ");

            while (true) {
                oper = scan.next();
                if (oper.equals("+") || oper.equals("/") || oper.equals("*") || oper.equals("-")) {
                    break;
                } else {
                    System.out.print("Некорректный ввод. Введите снова операцию: ");

                }
            }

            switch (oper) {
                case "+":
                    Operation sum = new Sum(a, b);
                    System.out.println(sum.execute());
                    break;
                case "/":
                    Operation division = new Division(a, b);
                    System.out.println(division.execute());
                    break;
                case "-":
                    Operation difference = new Difference(a, b);
                    System.out.println(difference.execute());
                    break;
                case "*":
                    Operation composition = new Composition(a, b);
                    System.out.println(composition.execute());
                    break;
            }

            System.out.print("Повторить вызов калькулятора? 1-Да 0-Нет: ");
            String rep = scan.nextLine();
            scan.next();

            temp = !rep.equals("0");

        } while (temp);

    }
}
