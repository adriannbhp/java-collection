package learn.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Immutable List
 * - Secara default, list di Java baik itu ArrayList ataupun LinkedList datanya bersifat mutable (bisa diubah)
 * - Di Java mendukung pembuatan Immutable List, artinya datanya tidak bisa diubah lagi
 * - Sekali List dibuat, datanya tidak bisa diubah lagi, alias final.
 * - Tapi ingat, data list nya yang tidak bisa diubah, bukan reference object element nya. Jika misalnya
 *   kita membuat Immutable List berisikan data Person, field data Person tetap bisa diubah, tapi isi elemen
 *   dari Immutable List tidak bisa diubah lagi
 * - Ini cocok ketika kasus-kasus misal, tidak sembarangan code yang boleh mengubah element di List
 */
public class ImmutableApp {
    public static void main(String[] args) {

        List<String> one = Collections.singletonList("Satu");
        List<String> empty = Collections.emptyList();

        List<String> mutable = new ArrayList<>();
        mutable.add("Adrian");
        mutable.add("Bimo");
        mutable.add("Hernawan");
        mutable.add("Pratama");
        List<String> immutable = Collections.unmodifiableList(mutable);

        List<String> elements = List.of("Adrian", "Bimo", "Hernawan", "Pratama");
    }
}
