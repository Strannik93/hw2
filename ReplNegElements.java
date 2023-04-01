package hw.seminar2;

import java.util.Arrays;
import java.util.Scanner;

public class ReplNegElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите общее количество цифр: ");
        int n = scanner.nextInt();
        int[] massiv = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.format("%d число: ", i+1);
            massiv[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println(Arrays.toString(massiv));
        int summ = sumIndexElem(massiv);
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] < 0) {
                massiv[i] = summ;
            }
        }
        System.out.println(Arrays.toString(massiv));
    }

    public static int sumIndexElem(int[] mass) {
        int summ = 0;
        for (int i = 0; i < mass.length; i++) {
            if ((mass[i] > 9 && mass[i] < 100) || (mass[i] < -9 && mass[i] > -100)){
                summ += i;
            } 
        }
        return summ;
    }
}
