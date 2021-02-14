package ForLoopLab;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double washingMachine = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        double money = 0;
        double increase = 0;
        int toys = 0;

        for (int i = 1; i <= age; i++) {

            if (i % 2 == 0) {
                increase = increase + 10.00;
                money = money + increase;
                money = money - 1;
            }
            if (i % 2 != 0){
                toys = toys + 1;
            }
        }
        money = money + toys*toyPrice;

        if (money >= washingMachine){
            System.out.printf("Yes! %.2f", money - washingMachine);
        }
        else{
            System.out.printf("No! %.2f", Math.abs(money - washingMachine));
        }
    }
}