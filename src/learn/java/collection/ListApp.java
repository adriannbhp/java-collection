package learn.java.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * List adalah struktur data collection yang memiliki sifat sebagai berikut
 * - Element di list bisa duplikat, artinya bisa memasukkan data yang sama
 * - Data list berurut sesuai dengan posisi kita memasukkan data
 * - List memiliki index, sehingga kita bisa mneggunakan nomor index untuk
 *   mendapatkan element di list
 *
 * Di Java ada beberapa implementasi List, dan kita bisa memilih sesuai dengan
 * kebutuhan kita
 */
public class ListApp {
    /**
     * ArrayList Class
     * - ArrayList adalah implementasi dari List menggunakan array
     * - Default kapasitas array di ArrayList adalah 10
     * - Namun ketika kita memasukkan data dan array sudah penuh,
     *   maka secara otomatis ArrayList akan membuat array baru dengan
     *   kapasitas baru dengan ukuran kapasitas yang lama + data baru
     */

    /**
     * LinkedList Class
     * - LinkedList adalah implementasi List dengan struktur data Double Linked List
     * - Bagi yang sudah belajar tentang struktur data di sekolah / kampus pasti tau apa itu
     *   double linked list
     */

    /**
     * ArrayList vs LinkedList
     * Operasi          ArrayList                               LinkedList
     * - add            Cepat jikga kapasitas Array masih       Cepat karena hanya menambah
     *                  cukup, lambat jika sudah penuh          node di akhir
     *
     * - get            Cepat karena tinggal gunakan index      Lambat karena harus di cek dari
     *                  array                                   node awal sampai ketemu index nya
     *
     * - set            Cepat karena tinggal gunakan index      Lambat karena harus di cek dari node
     *                  array                                   awal sampai ketemu
     *
     * - remove         Lambat karena harus menggeser data      Cepat karena tinggal ubah prev dan next
     *                  di belakang yang dihapus                di node sebelah yang dihapus
     */

    public static void main(String[] args) {

        // Semua Object yang ada di Collection dapat digunakan di dalam List

        List<String> strings = new ArrayList<>();
        // List<String> strings = new LinkedList<>();

        strings.add("Andrian");
        strings.add("Bimo");
        strings.add("Hernawan");
        strings.add("Pratama");

        strings.set(0, "Adrian");

        strings.remove(1);
        System.out.println(strings.get(0));

        for (var value : strings){
            System.out.println(value);
        }
    }
}
