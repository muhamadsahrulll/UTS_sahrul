/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts2csahrul;
import java.util.Scanner;

/**
 *
 * @author Sahrul
 */
public class nomor1 {
    public static void bubblesort (int A[]){
         int i = 1, j, n =A.length;
         int temp;
         while (i<n){
             j= n-1;
             while (j>=1){
                 if(A[j-1]>A[j]){
                     temp  = A[j];
                     A[j] = A[j-1];
                     A[j-1] = temp;
                 }
                 j=j-1;
             }
             i = i+1;
         }
    }
    public static void tampil(int data[]){
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    
    public static void main (String[] args){
        int A[] = {3,10,4,2,8,13};
        nomor1.tampil(A);
        nomor1.bubblesort(A);
        nomor1.tampil(A);
        
        int cari = 8;
        int batasawal = 0;
        int batasakhir = A.length-1;
        int ketemu = 0;
        int point = 0;
        
        System.out.println("isi data");
        for(int i = 0; i<A.length; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println();
        
        while ((batasawal <= batasakhir) && (ketemu == 0)){
            point = (batasawal+batasakhir)/2;
            System.out.println("indeks pointer : " + point);
            if(cari == A[point]){
                ketemu = 1;
                System.out.println("data " + cari + "telah ditemukan di index" + point + "baris ke "+(point+1));
            }
            else if (cari <A[point]){
                System.out.println("cari di kiri" );
                batasakhir = point-1;
            }
            else {
                batasawal = point+1;
                System.out.println("cari di kanan");
            }
            
        }
        
        if (ketemu == 1){
            System.out.println("data ditemukan ");
            
        }
        else {
            System.out.println("data tidak ditemukan");
        }
       
        
    }
    
    
}
