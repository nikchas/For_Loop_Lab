package ForLoopLab;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if(num > largest){
                largest = num;
            }
            if(num < smallest){
                smallest = num;
            }
        }
        System.out.printf("Max number: %d%n", largest);
        System.out.printf("Min number: %d", smallest);
    }
}