import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so dong");
        int rows = scanner.nextInt();
        System.out.println("nhap so cot");
        int cols = scanner.nextInt();
        int[][] twoArr = new int [rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
              System.out.println("nhap gia tri");
                twoArr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(twoArr[i][j] + " ");
            }
            System.out.println("\n");
        }

        System.out.println(" nhap gia tri cot can tinh tong");
        int colsDel = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (colsDel == j) {
                    sum += twoArr[i][j];
                    break;
                }
            }
        }
        System.out.printf("sum cua cot " + colsDel + " la: " + sum);

    }

}