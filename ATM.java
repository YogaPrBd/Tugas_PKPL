package com.company;

import java.util.Scanner;

public class ATM {
    protected Integer[] NoRek;
    protected Integer[] PIN;
    protected Integer[] saldo;
    public Integer pos, pos2;
    boolean cek;
    Scanner s = new Scanner(System.in);
    int n = 3;
    int t = 3;

    ATM(){
        cek = false;
        NoRek = new Integer[]{2000018058, 2000018021, 2000018060, 2000018306, 2000018314};
        PIN = new Integer[]{18058, 18021, 18060, 18306, 18314};
        saldo = new Integer[]{5000000, 3400000, 7500000, 1500000, 6350000};
    }

    public int cariIndex(Integer arr[], int x){
        if (arr == null) return -1;
        int p = arr.length;
        for(int i = 0; i<p; i++){
            if (arr[i] == x){
                return i;
            }
        }
        return -1;
    }

    void cekpin(Integer p, Integer arr[]){
        for (int x : arr){
            if (x == p){
                cek = true;
                break;
            }
        }
    }

    public int LogIn(){
        System.out.println("Kesempatan tersisa: " + n);
        n--;
        System.out.print("Masukkan PIN anda:\t");
        int p = s.nextInt();
        cekpin(p, PIN);
        if (cek == true && n > 0){
            pos = cariIndex(PIN, p);
            menu();
        }
        else if (cek == false && n > 0) {
            LogIn();
        }
        else System.out.println("ATM Terblokir");
        return 0;
    }

    public void menu(){
        System.out.println("\n");
        System.out.println("1. Informasi Saldo\n2. Penarikan\n3. Transfer\n4. Keluar");
        System.out.print("Pilih menu: ");
        int a = s.nextInt();
        switch (a){
            case 1:
                infoSaldo();
                break;
            case 2:
                tarik();
                break;
            case 3:
                transfer();
                break;
            case 4:
                t = 3;
                n = 3;
                LogIn();
            default:
                System.out.println("Menu tidak dapat ditemukan!!");
                menu();
                break;
        }
    }

    public void infoSaldo(){
        System.out.println("Saldo ATM Anda: " + saldo[pos]);
        System.out.println("Tekan Enter untuk kembali ke menu......");
        try{
            System.in.read();
            menu();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void tarik(){
        if(t == 0){
            System.out.println("Batas penarikan tercapai");
            menu();
        }

        System.out.println("Batas penarikan tersisa: " + t);
        System.out.println("Masukkan jumlah uang: ");
        int temp = s.nextInt();
        saldo[pos] = saldo[pos]-temp;
        t--;

        System.out.println("Tekan Enter untuk kembali ke menu......");
        try{
            System.in.read();
            menu();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void transfer(){
        System.out.println("Masukkan Nomor rekening yang ingin dituju: ");
        int n = s.nextInt();
        System.out.println("Masukkan jumlah uang yang ingin anda transfer: ");
        int u =s.nextInt();
        pos2 = cariIndex(NoRek, n);
        saldo[pos] = saldo[pos] - u;
        saldo[pos2] = saldo[pos2] + u;
        System.out.println("Tekan Enter untuk kembali ke menu......");
        try{
            System.in.read();
            menu();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
