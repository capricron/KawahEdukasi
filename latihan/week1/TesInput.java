package week1;

import java.util.Scanner;

public class TesInput {

    public static void main(String[] args) {
        long asu = 3000000000L;
        System.out.println(asu);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan Angka");
        int angka = scanner.nextInt();
        System.out.println("Angka " + angka);
        System.out.println((char) 65);
        pertambahan();
        scanner.close();
    }

    static void pertambahan() {
        System.out.println("tes");
    }
}
