package ForLoopLab;

import java.util.Scanner;

public class NumbersFromNto1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i = Integer.parseInt(scanner.nextLine());
        for (; i>=1; i--){
            System.out.println(i);
        }
    }
}
