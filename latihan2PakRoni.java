package com.belajar;
import java.util.Scanner;
public class latihan7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan nilai ujian
        System.out.print("Masukkan nilai ujian (0-100): ");
        int score = scanner.nextInt();

        // Menggunakan kondisi if-else untuk menentukan grade
        if (score >= 90 && score <= 100) {
            System.out.println("Prediket: A");
        } else if (score >= 80) {
            System.out.println("Prediket: B");
        } else if (score >= 70) {
            System.out.println("Prediket: C");
        } else if (score >= 60) {
            System.out.println("Prediket: D");
        } else if (score >= 0) {
            System.out.println("Prediket: F");
        } else {
            System.out.println("Nilai tidak valid. Harap masukkan nilai antara 0-100.");
        }

        // Menutup scanner
        scanner.close();
    }

}
