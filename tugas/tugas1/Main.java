package tugas.tugas1;

import java.util.Scanner;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String daftar_menu = "Selamat Datang di program sederahana ku\nMenu yang tersedia\n1. Identitas Ku\n2. Kalkulator\n3. Perbandingan dua buah angka";
        System.out.println(daftar_menu);
        System.out.print("Silahkan pilih menu yang tersedia : ");

        try (Scanner input = new Scanner(System.in)) {
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    Identitas();
                    break;
                case 2:
                    System.out.print("Masukan angka pertama: ");
                    int angka1 = input.nextInt();
                    System.out.print("Masukan operasi bilangan ex: +, -, *, /: ");
                    String operasi = input.next();
                    System.out.print("Masukan angka kedua: ");
                    int angka2 = input.nextInt();
                    Kalkulator(angka1, angka2, operasi);
                    break;
                case 3:
                    Perbandingan();
                    break;
                default:
                    System.out.println("Angka yang anda masukan tidak tersedia");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Anda harus memasukan dalam bentuk angka");
        }
    }

    static void Perbandingan() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("masukan angka pertama: ");
            int angka1 = input.nextInt();
            System.out.print("masukan angka kedua: ");
            int angka2 = input.nextInt();
            if (angka1 > angka2) {
                System.out.println("angka " + angka1 + " lebih besar dari angka " + angka2);
            } else if (angka1 < angka2) {
                System.out.println("angka " + angka1 + " lebih kecil dari angka " + angka2);
            } else {
                System.out.println("angka " + angka1 + " sama dengan angka " + angka2);
            }
        } catch (Exception e) {
            System.out.println("Anda harus memasukan dalam bentuk angka");
        }
    }

    static void Identitas() {
        System.out.println(
                "Nama : Wahyudi Khoeris Salimi\nAlasan Menjadi Backend: Karena passion tentang koding terutama di bagian sisi server dan transmisi data\nEkspektasi: Memiliki keterampilan dalam koding dan pemrograman terutama di bagian Backend dan setelah keluar dari program ini tidak menjadi beban keluarga serta memiliki penghasilan sendiri");
    }

    static void Kalkulator(int a, int b, String operator) {
        switch (operator) {
            case "+":
                System.out.println("Hasilnya adalah: " + a + b);
                break;
            case "-":
                System.out.println("Hasilnya adalah: " + (a - b));
                break;
            case "*":
                System.out.println("Hasilnya adalah: " + (a * b));
                break;
            case "/":
                System.out.println("Hasilnya adalah: " + ((float) a / b));
                break;
            default:
                System.out.println("Operator tidak ditemukan");
                break;
        }
    }

}
