/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsoop;

import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class databuku {
      private int brs = 10;
    private int klm = 3;
    private int raktif = 0;
    private String[][] BT = new String[brs][klm];
    Scanner dtIN = new Scanner(System.in);
    public void Storedata(){
        int idx = 0;
        raktif++;
        if(raktif>brs){
            System.out.println("Data Sudah Penuh!");
            return;
        }
        if(raktif>0){
            idx=raktif-1;
        }
        System.out.println("Menambahkan Data Teman");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Nama buku");
        BT[idx][0] = dtIN.nextLine();
        System.out.println("Jenis buku");
        BT[idx][1] = dtIN.nextLine();
        System.out.println("Jumlah halaman");
        BT[idx][2] = dtIN.nextLine();
        
        
    }
public void Update(int idx){
    if(idx >= 0 && idx < raktif) {
        System.out.println("Mengupdate Data Teman");
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Nama buku: " + BT[idx][0]);
        System.out.println("Jenis buku: " + BT[idx][1]);
        System.out.println("Jumlah halaman: " + BT[idx][2]);
        
        System.out.println("Masukkan Nama Buku baru (Kosongkan jika tidak ingin mengubah):");
        String namaBaru = dtIN.nextLine();
        if(!namaBaru.isEmpty()) {
            BT[idx][0] = namaBaru;
        }
        
        System.out.println("Masukkan Jenis buku baru (Kosongkan jika tidak ingin mengubah):");
        String alamatBaru = dtIN.nextLine();
        if(!alamatBaru.isEmpty()) {
            BT[idx][1] = alamatBaru;
        }
        
        System.out.println("Jumlah halaman Baru (Kosongkan jika tidak ingin mengubah):");
        String teleponBaru = dtIN.nextLine();
        if(!teleponBaru.isEmpty()) {
            BT[idx][2] = teleponBaru;
        }
        
        System.out.println("Data berhasil diperbarui.");
    } else {
        System.out.println("Indeks tidak valid.");
    }
}

public void Destroy(int idx){
    if(idx >= 0 && idx < raktif) {
        System.out.println("Menghapus Data Teman");
        System.out.println("~~~~~~~~~~~~~~~~~~~");
        System.out.println("Nama buku: " + BT[idx][0]);
        System.out.println("Jenis buku: " + BT[idx][1]);
        System.out.println("Jumlah halaman: " + BT[idx][2]);
        
        System.out.println("Apakah Anda yakin ingin menghapus data ini? (Y/N):");
        String konfirmasi = dtIN.nextLine();
        if(konfirmasi.equalsIgnoreCase("Y")) {
            for(int i = idx; i < raktif - 1; i++) {
                BT[i] = BT[i + 1];
            }
            raktif--;
            System.out.println("Data berhasil dihapus.");
        } else {
            System.out.println("Penghapusan data dibatalkan.");
        }
    } else {
        System.out.println("Indeks tidak valid.");
    }
}
    public void viewdata(){
        int posbrs = 0;
        System.out.println("Daftar Teman");
        System.out.println("~~~~~~~~~~~~");
        for(int i=0; i<raktif; i++){
            posbrs++;
//          System.out.println(posbrs+". "+BT[i][0]+" "+BT[i][1]+" "+BT[i][2]);
            System.out.println("Record"+i);
            System.out.println("Nama buku"+BT[i][0]);
            System.out.println("Jenis buku"+BT[i][1]);
            System.out.println("Jumlah halaman"+BT[i][2]);
        }
        
    }
}  

