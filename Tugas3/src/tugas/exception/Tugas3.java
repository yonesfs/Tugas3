package tugas.exception;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {

        String kembali = "y";
        while (kembali.equals("y"))
        {
            System.out.println(" ");
            Scanner input = new Scanner(System.in);
            String ul="",lagi;

            System.out.println(">>PROGRAM EXCEPTION HANDLING<<");
            System.out.println("PILIHAN MENU");
            System.out.println("1. Balok");
            System.out.println("2. Pembagian Dengan nol");
            System.out.println("3. Array");
            System.out.println("4. Keluar");
            System.out.println(" ");
            System.out.print("Masukkan Pilihan : ");
            int pilih = input.nextInt();

            switch (pilih) {
                case 1:{
                    Exceptionnya menu=new Exceptionnya();
                    Exceptionnya.BalokMenu();
                    break;
                }
                case 2:{
                    Exceptionnya menu=new Exceptionnya();
                    Exceptionnya.BaginolMenu();
                    break;
                }
                case 3:{
                    Exceptionnya menu=new Exceptionnya();
                    Exceptionnya.ArrayMenu();
                    break;
                }
                case 4:{
                    System.out.println("Pilihan Menu tidak tersedia !! ");
                }
                break;
            }
            System.out.println(" ");
            System.out.print("Kembali ke menu (y/t)? ");
            kembali = input.next();
        }
    }
}