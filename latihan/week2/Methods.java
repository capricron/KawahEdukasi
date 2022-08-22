package week2;

public class Methods {
    public static void main(String[] args) {
        myMethod();

        penjumlahan(2, 3);
        penjumlahan(52, 15);
        System.out.println(penjumlahan(157.0, 6));
        System.out.println(penjumlahan(15, 6, 7));
    }

    public static void myMethod() {
        System.out.println("Ini adalah method myMethod");
    }

    public static void penjumlahan(int varA, int varB) {
        System.out.println(varA + varB);
    }

    // default parameter
    public static double penjumlahan(double varA, double varB) {
        return varA + varB;
    }

    public static int penjumlahan(int varA, int varB, int varC) {
        return varA + varB + varC;
    }

}