/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursion;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Recursion {

    public static void main(String[] args) {
        doit(-10);
        upToTen(1);
        downFromTen(10);

        //User inputs number, method counts down then back up
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        count(number);

        //Add Array
        int[] testArray = {1, 2, 3, 4, 5};
        int sum = sumArray(testArray, 0);
        System.out.println("The sum of the array is: " + sum);
        
        //Gives the times tables set by the user up to 10
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number for times table: ");
        int timesNumber = scanner.nextInt();
        printTimesTable(timesNumber);
    }

    public static void doit(int num) {
        System.out.println(num);

        if (num < 10) {
            doit(num + 1);
        }
    }

    public static void upToTen(int num) {
        System.out.println(num);

        if (num < 10) {
            upToTen(num + 1);
        }
    }

    public static void downFromTen(int num) {
        System.out.println(num);

        if (num > 0) {
            downFromTen(num - 1);
        }
    }

    public static void count(int number) {

        if (number == 0) {
            System.out.println(number);
            return;
        }
        System.out.println(number);
        count(number - 1);
        System.out.println(number);
    }

    public static int sumArray(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        return arr[index] + sumArray(arr, index + 1);
    }
    
    public static void printTimesTable(int timesNumber) {
        System.out.println("Times table of " + timesNumber + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(timesNumber + " x " + i + " = " + (timesNumber * i));
        }
    }

}
