fun main(args: Array<String>) {
    // Mencetak "Hello World!" ke konsol saat program dijalankan.
    println("Hello World!")

    // Mencetak teks "Program arguments:" diikuti oleh argumen program (jika ada).
    // Argumen digabungkan menjadi satu string dengan tanda koma sebagai pemisah.
    println("Program arguments: ${args.joinToString()}")
}

class Sample() {
    // Deklarasi kelas Sample tanpa parameter konstruktor dan properti.

    fun sum(a: Int, b: Int): Int {
        // Fungsi sum menerima dua parameter a dan b yang bertipe data Int (bilangan bulat).
        // Mengembalikan hasil penjumlahan a dan b sebagai Int.
        return a + b
    }
}

