package com.Penjualan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);

        int harga = 0;
        int jumlah = 0;

        String kode_brg = null;
        String nama_brg = null;
        String satuan = null;
        String jenis = null;
        String stok = null;
        String nama_p = null;
        String kode_p = null;
        String alamat = null;
        String email = null;
        String no_hp = null;

        double total_hrg = 0;
        double diskon = 0;
        double pajak = 0;
        double total_p = 0;
        double kembalian = 0;
        double uang = 0;

        System.out.println("=====================================");
        System.out.println("= Selamat Datang Di Toko Perhiasan  =");
        System.out.println("=        Penjualan Barang           =");
        System.out.println("=====================================");

        System.out.println("kode barang :");

        kode_brg=i.next();
        switch (kode_brg){
            case "KB01":
                nama_brg = "Kalung";
                harga = Integer.parseInt("1000000");
                satuan = "gram";
                jenis = "Perhiasan";
                stok = "Tersedia";
                break;

            case "KB02":
                nama_brg = "Cincin";
                harga = Integer.parseInt("900000");
                satuan = "gram";
                jenis = "Perhiasan";
                stok = "Tersedia";
                break;

            case "KB03":
                nama_brg = "Gelang";
                harga = Integer.parseInt("1500000");
                satuan = "gram";
                jenis = "Perhiasan";
                stok = "Tersedia";
                break;
        }

        System.out.println("kode pelanggan :");

        kode_p=i.next();
        switch (kode_p){
            case "KP01":
                nama_p = "Tyas";
                alamat = "Umbulharjo";
                email = "tyas@gmail.com";
                no_hp = "0824343434353";

            case "KP02":
                nama_p = "Nasya";
                alamat = "Kota Gede";
                email = "Nasya@gmail.com";
                no_hp = "0824343434353";

            case "KP03":
                nama_p = "Mutia";
                alamat = "Sleman";
                email = "mutia@gmail.com";
                no_hp = "0824343434353";
        }
        System.out.println("Nominal Uang :");
        uang=i.nextInt();

        System.out.println("Jumlah barang yang dibeli :");
        jumlah=i.nextInt();
        total_hrg = harga + jumlah;
        System.out.println("Total harga :" +total_hrg);

        if (total_hrg >= 1000000){
            diskon = total_hrg*0.03;
        }
        else if (total_hrg >= 900000){
            diskon = total_hrg*0.03;
        }
        else if (total_hrg >= 1500000){
            diskon = total_hrg*0.3;
        }

        System.out.println("Nama barang :"+nama_brg);
        System.out.println("Harga barang :"+harga);
        System.out.println("Satuan barang :"+satuan);
        System.out.println("Jenis barang :"+jenis);
        System.out.println("Stok barang :"+stok);

        System.out.println("Nama pelanggan :"+nama_p);
        System.out.println("Alamat :"+alamat);
        System.out.println("Email :"+email);
        System.out.println("Nomor Hp :"+no_hp);

        System.out.println("Total diskon :"+diskon);
        System.out.println("Kembalian :"+kembalian);
    }
}