package com.belajar;
import java.util.Scanner;
public class latihan6 {
    public static void main(String[] args) {
        // Mengolah input data sederhana
        // Menggunakan class Scanner
        int Id, Usia;
        String Nama, Alamat, Keluhan;
        Scanner Input = new Scanner(System.in);
        System.out.println("DATA PASIEN");
        System.out.println("------------");
        System.out.print("Id : ");
        Id = Input.nextInt();
        System.out.print("Nama : ");
        Nama = Input.next();
        System.out.print("Alamat : ");
        Alamat = Input.next();
        System.out.print("Usia : ");
        Usia = Input.nextInt();
        System.out.print("Keluhan : ");
        Keluhan = Input.next();
        // Menampilkan Data Siswa
        System.out.println("DATA PASIEN");
        System.out.println("------------");
        System.out.println("Id : " + Id);
        System.out.println("Nama : " + Nama);
        System.out.println("Alamat : " + Alamat);
        System.out.println("Usia : " + Usia);
        System.out.println("Keluhan : " + Keluhan);
    }
}
