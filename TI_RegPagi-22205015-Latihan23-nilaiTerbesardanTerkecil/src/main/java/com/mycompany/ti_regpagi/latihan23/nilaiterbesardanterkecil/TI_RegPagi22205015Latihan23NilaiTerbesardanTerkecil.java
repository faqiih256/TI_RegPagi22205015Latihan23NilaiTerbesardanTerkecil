/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ti_regpagi.latihan23.nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 * Nama         : Ahmad Nurfaqih
 * Nim          : 22205015
 * prodi        : Teknik Informatia
 * Deskripsi    : Program ini berisi tentang mencari nilai terbesar dan terkecil
 * @author 62895
 */
public class TI_RegPagi22205015Latihan23NilaiTerbesardanTerkecil {

    public static void main(String[] args) {
        System.out.println("===LATIHAN 23===");
        Scanner scanner = new Scanner(System.in);
        
//        variable
        System.out.print("Masukan Nama petugas: ");
        String petugas = scanner.next();
        
        System.out.print("Masukan Banyaknya Mahasiswa: ");
        int banyak = scanner.nextInt();
        
        int nilaiakhir = 0;
        int i = 1;
        int rata;
        int nilaiterbesar = Integer.MIN_VALUE;
        int nilaiterkecil = Integer.MAX_VALUE;
        while (i <= banyak ){
            System.out.print("Masukan Nilai mahasiswa ke-"+i+":");
            int nilai = scanner.nextInt();
            nilaiakhir += nilai;
            i++;
            if (nilai> nilaiterbesar){
                nilaiterbesar = nilai;
            }
            if (nilai< nilaiterkecil){
                nilaiterkecil = nilai;
            }
            
        }
    System.out.println("====HASIL NILAI MAHASISWA");
    System.out.println("nilai terbesar adalah: "+nilaiterbesar);
    System.out.println("Nilai terkecil adalah: "+nilaiterkecil);
    }
}
