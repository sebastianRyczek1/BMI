import calculate.BMICalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj swoją wagę");
        int userWeight=sc.nextInt();
        while(userWeight>300||userWeight<0){
            System.out.println("Podaj poprawną wage");
            userWeight=sc.nextInt();
        }
        System.out.println("Podaj swój wzrost");
        int userHeight=sc.nextInt();
        while(userHeight>300||userHeight<0){
            System.out.println("Podaj poprawną wzrost");
            userHeight=sc.nextInt();
        }
        BMICalculator userData= new BMICalculator(userWeight,userWeight);
        System.out.println("Your result is :"+ userData.interpret());

    }
}
