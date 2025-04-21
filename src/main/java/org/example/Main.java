package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //create an instance

        Dice dice = new Dice();

        //create a variables

        int roll1;
        int roll2;

        //different counters for the number of times 2, 4, 6 and 7

        int count2 = 0;
        int count4 = 0;
        int count6 = 0;
        int count7 = 0;

        // Create a loop

        for ( int i = 1; i <= 100; i++ ){

            roll1 = dice.roll();
            roll2 = dice.roll();

            // determine the sum

             int sum = roll1 + roll2;
            System.out.println("Roll " + i + ": " + roll1 + " - " + roll2 + " Sum: " + sum);

            if (sum == 2) count2++;
            if (sum == 4) count4++;
            if (sum == 6) count6++;
            if (sum == 7) count7++;

        }

        // Display results

        System.out.println("\n Summary:");
        System.out.println("Sum of 2: " + count2 + " times");
        System.out.println("Sum of 4: " + count4 + " times");
        System.out.println("Sum of 6: " + count6 + " times");
        System.out.println("Sum of 7: " + count7 + " times");

    }

}