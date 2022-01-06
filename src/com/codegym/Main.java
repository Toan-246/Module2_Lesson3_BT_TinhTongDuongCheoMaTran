package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số hàng và cột");
        int size = sc.nextInt();

        int[][] arr = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("Nhập phần tử hàng %d, cột %d: ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("In mảng");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println("");
        }

        int sum1 = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size ; j++) {
                if (i == j) {
                    sum1 += arr[i][j];
                }
            }
        }
        System.out.println("Tổng đường chéo chính là " + sum1);
        int sum2 = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size ; j++) {
                if (i + j == size-1) {
                    sum2 += arr[i][j];
                }
            }
        }
        System.out.println("Tổng đường chéo chính phụ là  " + sum2);
    }
}
