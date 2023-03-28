package hw.seminar2;

import java.util.Scanner;

public class IncrSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        System.out.println("Общее количество: ");
        int n = scanner.nextInt();
        System.out.println("Ввод целых");
        int num = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            int lastNum = scanner.nextInt();
            if (lastNum <= num){
                check = false;
            }
            num = lastNum;
        }
        scanner.close();
        if (check){
            System.out.println("Последовательность возрастающая");
        } else {
            System.out.println("Последовательность не");
        }
    }
}
