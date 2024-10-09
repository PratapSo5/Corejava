// Accepting value and arrange in descending order

import java.util.Scanner;

public class ex126 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        int n[] = new int[size];
        
        for (int i = 0; i < size; i++) {
            System.out.println("Enter an item:");
            n[i] = sc.nextInt();
        }
        
        System.out.println("My accepted values:");
        for (int i = 0; i < size; i++) {
            System.out.print(n[i] + "\t");
        }
        System.out.println();  // To move to the next line after printing the values
        
        // Sorting in descending order
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (n[i] < n[j]) {
                    int t = n[i];
                    n[i] = n[j];
                    n[j] = t;
                }
            }
        }
        
        System.out.println("After arranging in descending order:");
        for (int i = 0; i < size; i++) {
            System.out.print(n[i] + "\t");
        }
    }
}
