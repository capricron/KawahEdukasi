package week1;

import java.util.Scanner;

public class InputUser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            int inputanUser = input.nextInt();
            System.out.println(inputanUser);
        } catch (Exception e) {
            System.out.println("wajib angka");
        }
    }
}
