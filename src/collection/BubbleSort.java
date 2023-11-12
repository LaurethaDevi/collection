/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Devi - BOE
 */
public class BubbleSort {
   public static void main(String[] args) {
        // Buat ArrayList bernama numbers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Tambahkan beberapa angka ke ArrayList
        numbers.add(10);
        numbers.add(5);
        numbers.add(1);
        numbers.add(7);
        numbers.add(2);

        // Tampilkan data awal sebelum di sorting
        System.out.println("Data awal:");
        for (int number : numbers) {
            System.out.print(number+" ");
        }
        

        // Urutkan ArrayList menggunakan bubble sort
        bubbleSort(numbers);

        // Tampilkan hasil sorting
        System.out.println("\nHasil sorting:");
        for (int number : numbers) {
            System.out.print(number+" ");
        }
        
        // Cari angka 5 di ArrayList
        int index = search(numbers, 12);
        int index_1=index+1;

        // Cetak indeks angka 
                // Cetak indeks angka 5
        if (index != -1) {
            System.out.println(" berada pada urutan ke : " + index_1);
        } else {
            System.out.println(" tidak ada pada array");
        }
        
    }

    private static void bubbleSort(ArrayList<Integer> numbers) {
        // Lakukan perulangan sebanyak jumlah elemen di ArrayList
        for (int i = 0; i < numbers.size() - 1; i++) {
            // Lakukan perulangan sebanyak jumlah elemen tersisa di ArrayList
            for (int j = 0; j < numbers.size() - i - 1; j++) {
                // Jika elemen ke-j lebih besar dari elemen ke-j+1, maka tukar posisi kedua elemen tersebut
                if (numbers.get(j) > numbers.get(j + 1)) {
                    int temp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, temp);
                }
            }
        }
    }
        private static int search(ArrayList<Integer> numbers, int target) {
            //sequentialSearch 
            System.out.print("\n Angka "+target);
        // Lakukan perulangan dari awal hingga akhir ArrayList
        for (int i = 0; i < numbers.size(); i++) {
            // Jika elemen ke-i sama dengan target, maka kembalikan indeks elemen tersebut
            if (numbers.get(i) == target) {
                return i;
            }

        }

        // Jika target tidak ditemukan, maka kembalikan -1
        return -1;
    }
    
}
