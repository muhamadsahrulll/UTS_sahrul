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
public class nomor3 {
    public static void main (String [] args){
        int i,j,n,m;
        int matriks[][] = new int [10][10];
        int transpose[][] = new int [10][10];
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan Jumlah Baris Matriks A=  ");
        m = scan.nextInt();
        System.out.println("Masukan Jumlah Kolom Matriks A= ");
        n = scan.nextInt();
        System.out.println("Masukan Elemen Matriks A = ");
        for(i=0; i<m; i++){
            for(j=0; j<n; j++){
                matriks[i][j] = scan.nextInt();
            }
        }
        
        System.out.println("Hasil Matriks = ");
        for(i=0; i<m; i++){
            for(j=0; j<n; j++){
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println();
        }
        for(i=0; i<m; i++){
            for(j=0; j<n; j++){
                transpose[j][i] = matriks[i][j];
            }
        }
        System.out.println(" Hasil transpose  Matriks = ");
        for(i=0; i<n; i++){
            for(j=0; j<m; j++){
                System.out.print(transpose[i][j]+"\t");    
            }
            System.out.println();
        }
        
        
        System.out.println("Masukan Jumlah Baris Matriks B=  ");
        m = scan.nextInt();
        System.out.println("Masukan Jumlah Kolom Matriks B= ");
        n = scan.nextInt();
        System.out.println("Masukan Elemen Matriks B= ");
        for(i=0; i<m; i++){
            for(j=0; j<n; j++){
                matriks[i][j] = scan.nextInt();
            }
        }
        
        System.out.println("Hasil Matriks = ");
        for(i=0; i<m; i++){
            for(j=0; j<n; j++){
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println();
        }
        for(i=0; i<m; i++){
            for(j=0; j<n; j++){
                transpose[j][i] = matriks[i][j];
            }
        }
        System.out.println(" Hasil transpose  Matriks = ");
        for(i=0; i<n; i++){
            for(j=0; j<m; j++){
                System.out.print(transpose[i][j]+"\t");    
            }
            System.out.println();
        }
    }
}
