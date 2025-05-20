// Problem-3.java

import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        for (int i = 1; i <= a; i += 2) {
            System.out.print(i);
            if (i + 2 <= a) System.out.print(", ");
        }
    }
}
