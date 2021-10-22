package ip.syssrc.conditional;

/**
 * Cashier
 *
 * Assignment 1.1
 *
 * @author H071211045 - MUHAMMAD SOFYAN DAUD PUJAS <gaero38@gmail.com>
 *
 */

import java.util.Scanner;
public class Cashier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Menentukan Variabel
        int seratusRibu = 0; 
        int limaPuluhRibu = 0; 
        int duaPuluhRibu = 0; 
        int sepuluhRibu = 0; 
        int limaRibu = 0; 
        int duaRibu = 0; 
        int seribu = 0; 
        int limaRatus = 0; 
        int duaRatus = 0; 
        int seratus = 0;

        int totalBelanja = 0;
        int pembayaran = 0;

        // Interface sederhana
        System.out.println("\n-----[WELCOME TO SYSMART CASHIER]-----");
        System.out.print("\nBerapa total harga belanja anda ? Rp.");
        
        while (!sc.hasNextInt()) {
            System.out.flush();
            System.out.println("\nMaaf, pastikan inputan anda adalah angka");
            sc.next();
            System.out.print("\nBerapa total harga belanja anda ? Rp.");
        } totalBelanja = sc.nextInt();

        System.out.print("Berapa total uang anda bayarkan ? Rp.");
        while (!sc.hasNextInt()) {
            System.out.flush();
            System.out.println("\nMaaf, pastikan inputan anda adalah angka");
            sc.next();
            System.out.print("\nBerapa total uang anda bayarkan ? Rp.");
        }
        pembayaran = sc.nextInt();

        // Kalkulasikan
        int kembalian = pembayaran - totalBelanja;

        if (pembayaran < totalBelanja) { 
            System.out.println("\nPembayaran tidak cukup!\n");
            System.out.print("Maaf, anda memiliki hutang sebesar Rp."); 
            System.out.println((totalBelanja-pembayaran)+"\n"); 
        } else {
        System.out.println("\nTotal kembalian anda = " + kembalian);
        System.out.println("Dengan dengan rincian sebagai berikut : \n");

        // Seleksi Kondisi
        if (kembalian >= 100000) {
            kembalian = kembalian - 100000;
            seratusRibu = seratusRibu + 1;
        }
        if (kembalian >= 50000) {
            kembalian = kembalian - 50000;
            limaPuluhRibu = limaPuluhRibu + 1;
        }
        if (kembalian >= 20000) {
            kembalian = kembalian - 20000;
            duaPuluhRibu = duaPuluhRibu + 1;
        }
        if (kembalian >= 10000) {
            kembalian = kembalian - 10000;
            sepuluhRibu = sepuluhRibu + 1;
        }
        if (kembalian >= 5000) {
            kembalian = kembalian - 5000;
            limaRibu = limaRibu + 1;
        }   
        if (kembalian >= 2000) {
            kembalian = kembalian - 2000;
            duaRibu = duaRibu + 1;
        }
        if (kembalian >= 1000) {
            kembalian = kembalian - 1000;
            seribu = seribu + 1;
        }
        if (kembalian >= 500) {
            kembalian = kembalian - 500;
            limaRatus = limaRatus + 1;
        }
        if (kembalian >= 200) {
            kembalian = kembalian - 200;
            duaRatus = duaRatus + 1;
        }
        if (kembalian >= 100) {
            kembalian = kembalian - 100;
            seratus = seratus + 1;
        }
        if (seratusRibu > 0) {
            System.out.println(seratusRibu + " lembar uang Rp.100000");
        } 
        if (limaPuluhRibu > 0) {
            System.out.println(limaPuluhRibu + " lembar uang Rp.50000");
        } 
        if (duaPuluhRibu > 0) {
            System.out.println(duaPuluhRibu + " lembar uang Rp.20000");
        } 
        if (sepuluhRibu > 0) {
            System.out.println(sepuluhRibu + " lembar uang Rp.10000");
        } 
        if (limaRibu > 0) {
            System.out.println(limaRibu + " lembar uang Rp.5000");
        } 
        if (duaRibu > 0) {
            System.out.println(duaRibu + " lembar uang Rp.2000");
        } 
        if (seribu > 0) {
            System.out.println(seribu + " lembar uang Rp.1000");
        } 
        if (limaRatus > 0) {
            System.out.println(limaRatus + " lembar uang Rp.500");
        } 
        if (duaRatus > 0) {
            System.out.println(duaRatus + " lembar uang Rp.200");
        } 
        if (seratus > 0) {
            System.out.println(seratus + " lembar uang Rp.100");
        }
        if (kembalian > 0) {
            System.out.println("Dan sebanyak Rp. " + kembalian + " didonasikan");
        }
    }
        sc.close();
    }
}