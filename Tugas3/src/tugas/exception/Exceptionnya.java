package tugas.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

    public class Exceptionnya {
        private static final Scanner s = new Scanner(System.in);

        public static void BalokMenu() {
            double p, l, t;
            double luasBalok, volBalok;

            Scanner scanInput = new Scanner(System.in);
            boolean inputan = true;
            do {
                try {
                    System.out.println(" ");
                    System.out.println("PROGRAM MENGHITUNG LUAS PERMUKAAN & VOLUME BALOK");

                    System.out.print("Panjang: ");
                    p = scanInput.nextDouble();
                    System.out.print("Lebar: ");
                    l = scanInput.nextDouble();
                    System.out.print("Tinggi: ");
                    t = scanInput.nextDouble();

                    luasBalok = 2 * p * l + 2 * p * t + 2 * l * t;
                    volBalok = p * l * t;

                    System.out.println("Luas Permukaan Balok = " + luasBalok);
                    System.out.println("Volume Balok = " + volBalok);
                    inputan = false;
                } catch (InputMismatchException ex) {
                    System.out.println(" ");
                    System.out.println(ex);
                    System.out.println("Error!");
                    scanInput.nextLine();
                }
            } while (inputan);
        }


        public static void BaginolMenu() {
            int r, t, hasil;

            Scanner scanInput = new Scanner(System.in);
            boolean inputan = true;
            do {
                try {
                    System.out.println(" ");
                    System.out.println("PROGRAM MENGHITUNG PEMBAGIAN NOL");
                    System.out.printf("Angka 1 : ");
                    r = scanInput.nextInt();
                    System.out.print("Angka 2 : ");
                    t = scanInput.nextInt();
                    hasil = r / t;
                    System.out.printf("%d / %d = %d", r, t, hasil);
                    inputan = false;
                } catch (ArithmeticException ex) {
                    System.out.println(" ");
                    System.out.println(ex);
                    System.out.println("Error!");
                    scanInput.nextLine();
                }
            } while (inputan);
        }

        public static void ArrayMenu() {
            int[] arrayData = {0, 1, 2 , 3};

            String kembali = "y";
            while (kembali.equals("y")) {

                Scanner userInput = new Scanner(System.in);
                boolean inputan = true;
                do {
                    try {
                        System.out.println(" ");;
                        System.out.printf("data ke-:");
                        int indexInput = userInput.nextInt();

                        System.out.printf("data dari array ke-%d adalah %d\n\n", indexInput, arrayData[indexInput]);
                    } catch (ArrayIndexOutOfBoundsException ex) {
                        System.out.println(" ");
                        System.out.println(ex);
                        System.out.println("Error!");
                        userInput.nextLine();
                    }
                } while (inputan);
            }
        }
    }