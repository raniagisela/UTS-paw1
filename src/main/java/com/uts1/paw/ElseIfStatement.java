package com.uts1.paw;

public class ElseIfStatement {
    public static void main(String[] args) {
        var nilai = 0;
    
        if (nilai >= 80.00 && nilai <= 100) {
            System.out.println("Nilai Anda A");
        } else if (nilai >= 77.50 && nilai <= 79.99) {
        System.out.println("Nilai anda A-");
        } else if (nilai >= 75.00 && nilai <= 77.49) {
        System.out.println("Nilai anda A/B");
        } else if (nilai >= 72.50 && nilai <= 74.99) {
        System.out.println("Nilai anda B+");
        } else if (nilai >= 70.00 && nilai <= 72.49) {
        System.out.println("Nilai anda B");
        } else if (nilai >= 67.50 && nilai <= 69.99) {
        System.out.println("Nilai anda B-");
        } else if (nilai >= 65.00 && nilai <= 67.49) {
        System.out.println("Nilai anda B/C");
        } else if (nilai >= 62.50 && nilai <= 64.99) {
        System.out.println("Nilai anda C+");
        } else if (nilai >= 60.00 && nilai <= 62.49) {
        System.out.println("Nilai anda C");
        } else if (nilai >= 55.00 && nilai <= 59.99) {
        System.out.println("Nilai anda C-");
        } else if (nilai >= 50.00 && nilai <= 54.99) {
        System.out.println("Nilai anda C/D");
        } else if (nilai >= 45.00 && nilai <= 49.99) {
        System.out.println("Nilai anda D+");
        } else if (nilai >= 40.00 && nilai <= 44.99) {
        System.out.println("Nilai anda D");
        } else if (nilai < 40.00) {
        System.out.println("Nilai anda E");
        }
    }
}
    

