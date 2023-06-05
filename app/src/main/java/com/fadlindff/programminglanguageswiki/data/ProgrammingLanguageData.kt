package com.fadlindff.programminglanguageswiki.data

import com.fadlindff.programminglanguageswiki.R

object ProgrammingLanguageData {
    private val programmingLanguageData = arrayOf(
        arrayOf(
            1,
            "Kotlin",
            "JetBrains Team",
            "Kotlin adalah sebuah bahasa pemrograman dengan pengetikan statis yang berjalan pada Mesin Virtual Java ataupun menggunakan kompiler LLVM yang dapat pula dikompilasikan kedalam bentuk kode sumber JavaScript. Pengembang utamanya berasal dari tim programer dari JetBrains yang bermarkas di Rusia. Meskipun sintaksisnya tidak kompatibel dengan bahasa Java, Kotlin didesain untuk dapat bekerja sama dengan kode bahasa Java dan bergantung kepada kode bahasa Java dari Kelas Pustaka Java yang ada, seperti berbagai framework Java yang ada.",
            R.drawable.kotlin,
        ),
        arrayOf(
            2,
            "JavaScript",
            "Brendan Eich",
            "JavaScript adalah suatu bahasa pemrograman tingkat tinggi dan dinamis. JavaScript populer di internet dan dapat bekerja di sebagian besar web browser seperti Google Chrome, Internet Explorer (IE), Mozilla Firefox, Netscape dan Opera.",
            R.drawable.javascript,
        ),
        arrayOf(
            3,
            "Java",
            "James Gosling",
            "Java adalah bahasa pemrograman yang dapat dijalankan di berbagai komputer termasuk telepon genggam. Bahasa ini awalnya dibuat oleh James Gosling saat masih bergabung di Sun Microsystems, yang saat ini merupakan bagian dari Oracle dan dirilis tahun 1995. Bahasa ini banyak mengadopsi sintaksis yang terdapat pada C dan C++ namun dengan sintaksis model objek yang lebih sederhana serta dukungan rutin-rutin aras bawah yang minimal. Aplikasi-aplikasi berbasis java umumnya dikompilasi ke dalam p-code (bytecode) dan dapat dijalankan pada berbagai Mesin Virtual Java (JVM).",
            R.drawable.java,
        ),
        arrayOf(
            4,
            "C",
            "Dennis Ritchie",
            "Bahasa pemrograman C adalah bahasa pemrograman komputer bertujuan umum yang dibuat pada tahun 1972 oleh Dennis Ritchie untuk Sistem Operasi Unix di Bell Telephone Laboratories. Dengan desain, fitur C dengan jelas mencerminkan kemampuan CPU yang ditargetkan. Meskipun C dibuat untuk memprogram sistem dan jaringan komputer namun bahasa ini juga sering digunakan dalam mengembangkan software aplikasi. C juga banyak dipakai oleh berbagai jenis platform sistem operasi dan arsitektur komputer, bahkan terdapat beberepa compiler yang sangat populer telah tersedia. C secara luar biasa memengaruhi bahasa populer lainnya, terutama C++ yang merupakan extensi dari C.",
            R.drawable.c,
        ),
        arrayOf(
            5,
            "C++",
            "Bjarne Stroustrup",
            "C++ adalah bahasa pemrograman komputer yang dibuat oleh Bjarne Stroustrup, yang merupakan perkembangan dari bahasa C dikembangkan di Bell Labs (Dennis Ritchie). Pada awal tahun 1970-an, bahasa itu merupakan peningkatan dari bahasa sebelumnya, yaitu B. Pada awalnya, bahasa tersebut dirancang sebagai bahasa pemrograman yang dijalankan pada sistem Unix. Pada perkembangannya, versi ANSI (American National Standards Institute) pada bahasa pemrograman C menjadi versi dominan, meskipun versi tersebut sekarang jarang dipakai dalam pengembangan sistem dan jaringan maupun untuk sistem embedded. Bjarne Stroustrup pada Bell Labs pertama kali mengembangkan C++ pada awal 1980-an. Untuk mendukung fitur-fitur pada C++, dibangun efisiensi dan sistem support untuk pemrograman tingkat rendah (low level coding). Pada C++ ditambahkan konsep-konsep baru seperti class dengan sifat-sifatnya seperti inheritance dan overloading. Salah satu perbedaan yang paling mendasar dengan bahasa C adalah dukungan terhadap konsep pemrograman berorientasi objek (object-oriented programming)",
            R.drawable.c_plus_plus,
        ),
        arrayOf(
            6,
            "Rust",
            "Graydon Hoare",
            "Rust adalah sebuah bahasa pemrograman sistem yang pengembangannya didukung oleh penelitian dari Mozilla. Bahasa ini dirancang agar menjadi pemrograman yang \"aman, konkuren (bekerja bersamaan) dan praktis\". Bahasa ini mendukung paradigma pemrograman fungsional dan prosedural-imperatif. Sintaksis bahasa Rust serupa dengan bahasa C++ namun dirancang dengan keamanan memori yang lebih baik sembari tetap menjaga performa kerja. Bahasa Rust ini tergolong pada peranti lunak sumber terbuka. Desainnya merupakan perbaikan bedasarkan pengalaman-pengalaman yang dialami ketika mengembangkan Servo, sebuah perangkat layout untuk peramban web dan kompilator Rust.",
            R.drawable.rust,
        ),
        arrayOf(
            7,
            "PHP",
            "Rasmus Lerdorf",
            "PHP: Hypertext Preprocessor (sebelumnya disebut Personal Home Pages) atau hanya PHP saja, adalah bahasa skrip dengan fungsi umum yang terutama digunakan untuk pengembangan web. Bahasa ini awalnya dibuat oleh seorang pemrogram Denmark-Kanada Rasmus Lerdorf pada tahun 1994. Implementasi referensi PHP sekarang diproduksi oleh The PHP Group. PHP awalnya merupakan singkatan dari Personal Home Page, tetapi sekarang merupakan singkatan dari inisialisasi rekursif PHP: Hypertext Preprocessor.",
            R.drawable.php,
        ),
        arrayOf(
            8,
            "Go",
            "Robert Griesemer",
            "Go (sering disebut sebagai Golang) adalah bahasa pemrograman yang dibuat di Google pada tahun 2009 oleh Robert Griesemer, Rob Pike, dan Ken Thompson. Go adalah bahasa pemrograman sumber terbuka yang mudah, sederhana, efisien. Selain itu, Go memiliki level yang sama dengan Java. Yaitu bahasa pemrograman yang dihimpun dan diketik dalam bahasa C, dengan fitur pengumpulan sampah, penulisan terstruktur, keamanan memori, dan pemrograman yang konkuren serta berurutan. Kompiler dan IDE lainnya disediakan oleh Google dari awal secara bebas dan sumber terbuka.",
            R.drawable.go,
        ),
        arrayOf(
            9,
            "Python",
            "Guido van Rossum",
            "Python adalah bahasa pemrograman tujuan umum yang ditafsirkan, tingkat tinggi. Dibuat oleh Guido van Rossum dan pertama kali dirilis pada tahun 1991, filosofi desain Python menekankan keterbacaan kode dengan penggunaan spasi putih yang signifikan. Konstruksi bahasanya dan pendekatan berorientasi objek bertujuan untuk membantu pemrogram menulis kode yang jelas dan logis untuk proyek skala kecil dan besar. Python diketik secara dinamis dan terdapat fitur garbage collection. Ini mendukung beberapa paradigma pemrograman, termasuk pemrograman terstruktur (terutama, prosedural), berorientasi objek, dan fungsional. Python sering dideskripsikan sebagai bahasa \"termasuk baterai\" karena perpustakaan standarnya yang komprehensif.",
            R.drawable.python,
        ),
        arrayOf(
            10,
            "Dart",
            "Lars Bak",
            "Dart adalah bahasa pemrograman yang dirancang oleh Lars Bak dan Kasper Lund dan dikembangkan oleh Google. Bahasa pemrograman ini dirancang untuk pengembangan klien seperti untuk web dan aplikasi seluler, dan juga dapat digunakan untuk membangun aplikasi server dan desktop. Ini adalah bahasa yang berorientasi objek, berbasis kelas, dan mengumpulkan sampah dengan sintaksis gaya C. Bahasa ini dapat dikompilasi menjadi kode mesin atau JavaScript, dan mendukung antarmuka, mixin, kelas abstrak, generik yang direferensikan, dan inferensi tipe.",
            R.drawable.dart,
        ),
    )

    fun getProgrammingLanguageList(): ArrayList<ProgrammingLanguageModel> {
        val programmingLanguageList = ArrayList<ProgrammingLanguageModel>()
        for (data in programmingLanguageData) {
            val programmingLanguage = ProgrammingLanguageModel(
                id = data[0] as Int,
                name = data[1] as String,
                inventor = data[2] as String,
                description = data[3] as String,
                image = data[4] as Int,
            )
            programmingLanguageList.add(programmingLanguage)
        }
        return programmingLanguageList
    }
}