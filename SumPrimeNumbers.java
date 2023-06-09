package hw.seminar2;

import java.util.Scanner;

public class SumPrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int summ = 0;
        System.out.println("Общее количество чисел: ");
        int n = scanner.nextInt();
        System.out.println("Ввод целых чисел");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (checkSimplNum(num)){
                summ += num;
            }
        }
        scanner.close();
        System.out.println("Сумма простых чисел = " + summ);
    }

    public static boolean checkSimplNum(int num2) {
        if (num2 > 1){
                for (int i = 2; i < num2; i++) {
                    if (num2%i == 0) {
                        return false;
                    }
                }
            return true;
        }
        else{
            return false;
        }
    }
}
