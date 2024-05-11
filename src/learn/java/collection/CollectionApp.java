package learn.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Collection Interface
 * - Selain Iterable interface, parent class semua collection di Java adalah Collection
 * - Kalo Iterable interface digunakan sebagai kontrak untuk meng-iterasi data secara sequential
 * - Collection merupakan kontrak untuk memanipulasi data collection, seperti menambah, menghapus
 *   dan mengecek isi data collection
 * - Tidak ada direct implementation untuk Collection, karena collection nanti akan dibagi lagi
 *   menjadi List, Set dan Queue
 */
public class CollectionApp {
    public static void main(String[] args) {

        // Menambah Data di Collection
        Collection<String> collection = new ArrayList<>();
        collection.add("Adrian");
        collection.add("Bimo");
        collection.add("Hernawan");
        collection.add("Pratama");
        collection.addAll(List.of("Learn", "Java", "Collection"));

        for (var value : collection) {
            System.out.println(value);
        }

        System.out.println("REMOVE");
        // Menghapus Data di Collection
        collection.remove("Adrian");
        collection.removeAll(List.of("Java", "Collection"));

        for (var value : collection) {
            System.out.println(value);
        }

        System.out.println(
                collection.contains("Hernawan")
        );

        System.out.println(
                collection.containsAll(List.of("Bimo", "Learn"))
                // collection.containsAll(List.of("Bimo", "Learn")) // Jika Data salah satunya tidak ada maka return nya False
        );

        System.out.println(collection.size());
    }
}
