package Practice3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("名前：");
        // 文字列の入力を受け取って下さい
        String firstName = scanner.next();

        System.out.print("名字：");
        // 文字列の入力を受け取ってください
        String lastName = scanner.next();

        System.out.print("年齢：");
        int age = scanner.nextInt();

        System.out.print("身長(m)：");
        // 小数の入力を受け取ってください
        double height = scanner.nextDouble();

        System.out.print("体重(kg)：");
        // 小数の入力を受け取ってください
        double weight = scanner.nextDouble();

        Person.printData(Person.fullName(firstName, lastName), age, height, weight);
    }
}
