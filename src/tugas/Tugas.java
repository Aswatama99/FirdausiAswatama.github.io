/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import java.util.Scanner;

/**
 *
 * @author MOKLET GAMING
 */
public class Tugas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int pilih;
        Scanner input = new Scanner(System.in);
        System.out.println("Bahan Dapur");
        System.out.println("------------------------------");
        System.out.println("1. Minyak Goreng\n"
                + "2. Lombok\n"
                + "3. Bawang\n"
                + "Pilih bahan yang dibeli: ");
        pilih = input.nextInt();

        switch (pilih) {
            case 1:
                int minyak = 43000;
                System.out.println("Anda membeli minyak goreng");
                System.out.println("Harga minyak "+minyak);
                System.out.println("Jumlah bahan yang dibeli:");
                int banyak = input.nextInt();
                
                System.out.println("Uang anda: ");
                int uang = input.nextInt();
                
                if (uang >= minyak){
                    int kembalian = uang-(banyak*minyak);
                    System.out.println("Kembalian anda: "+kembalian);
                    System.out.println("Terimakasih telah belanja :D");
                }else if (uang < minyak){
                    System.out.println("Uang anda kurang!");
                } 
                break;
            case 2:
                int lombok = 75000; 
                System.out.println("Anda membeli lombok");
                System.out.println("Harga lombok "+lombok);
                System.out.println("Jumlah bahan yang dibeli:");
                banyak = input.nextInt();
                System.out.println("Uang anda: ");
                uang = input.nextInt();
                
                if (uang >= lombok){
                    int kembalian = uang-(banyak*lombok);
                    System.out.println("Kembalian anda: "+kembalian);
                    System.out.println("Terimakasih telah belanja :D");
                }else if (uang < lombok){
                    System.out.println("Uang anda kurang!");
                    break;
                } 
                break;
            case 3:
                int bawang = 41000;
                System.out.println("Anda membeli bawang");
                System.out.println("Harga bawang "+bawang);
                System.out.println("Jumlah bahan yang dibeli:");
                banyak = input.nextInt();
                System.out.println("Uang anda: ");
                uang = input.nextInt();
                
                if (uang >= bawang){
                    int kembalian = uang-(banyak*bawang);
                    System.out.println("Kembalian anda: "+kembalian);
                    System.out.println("Terimakasih telah belanja :D");
                }else if (uang < bawang){
                    System.out.println("Uang anda kurang!");
                    break;
                } 
                break;
            default:
                System.out.println("Pilihan hanya 1 2 3");
        }
                   
        
        

        }
            
}


