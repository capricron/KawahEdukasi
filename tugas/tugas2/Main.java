package tugas.tugas2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String daftar_menu = "Menu yang tersedia: \n1. Method nilai mutlak\n2. Method mengurutkan angka\n3. Method pangkat";
        System.out.println(daftar_menu);
        System.out.print("Silahkan pilih menu yang tersedia : ");
        try (Scanner input = new Scanner(System.in)) {
            int pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukan angka yang ingin diubah menjadi nilai mutlak: ");
                    int angka = input.nextInt();
                    System.out.println("Nilai mutlak dari " + angka + " adalah " + nilaiMutlak(angka));
                    break;
                case 2:
                    List<Integer> listAngka = new ArrayList<Integer>();
                    boolean stop = false;
                    while (!stop) {
                        System.out.print("Masukan angka yang ingin diurutkan (ketik stop untuk berhenti): ");
                        try {
                            int angka3 = input.nextInt();
                            listAngka.add(angka3);

                        } catch (Exception e) {
                            stop = true;
                        }
                    }
                    mengurutkanAngka(listAngka);
                    break;
                case 3:
                    System.out.print("Masukan angka yang ingin dipangkatkan: ");
                    int angkaPangkat = input.nextInt();
                    System.out.print("Masukan angka pangkat: ");
                    int pangkat = input.nextInt();
                    System.out.println("Hasil dari " + angkaPangkat + " pangkat " + pangkat + " adalah "
                            + pangkat(angkaPangkat, pangkat));
                    break;
                default:
                    System.out.println("Angka yang anda masukan tidak tersedia");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Anda harus memasukan dalam bentuk angka");
        }
    }

    static int nilaiMutlak(int angka) {
        if (angka < 0) {
            angka = angka * -1;
        }
        return angka;
    }

    static void mengurutkanAngka(List<Integer> listAngka) {
        int temp;
        for (int i = 0; i < listAngka.size(); i++) {
            for (int j = 0; j < listAngka.size(); j++) {
                if (listAngka.get(i) < listAngka.get(j)) {
                    temp = listAngka.get(i);
                    listAngka.set(i, listAngka.get(j));
                    listAngka.set(j, temp);
                }
            }
        }
        System.out.println("Hasil pengurutan angka adalah: ");
        for (int i = 0; i < listAngka.size(); i++) {
            System.out.print(listAngka.get(i) + " ");
        }
    }

    static int pangkat(int angka, int pangkat) {
        int hasil = 1;
        for (int i = 0; i < pangkat; i++) {
            hasil = hasil * angka;
        }
        return hasil;
    }
}
