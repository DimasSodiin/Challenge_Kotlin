import java.awt.SystemColor.menu
import java.util.Scanner;

public var input = Scanner(System.`in`)

fun main() {
    //Membuat Objek Scanner
    val input = Scanner(System.`in`)

    //Menginputkan Identitas
    println("=======================")
    println("Masukkan Identitas Anda")
    print("Nama: ")
    val nama: String? = input.nextLine()
    if(nama.isNullOrEmpty()){
        println("Wajib Di Isi")
        main()
    }
    print("Kelas: ")
    val kelas: String? = input.nextLine()
    if(kelas.isNullOrEmpty()){
        print("Wajib Di Isi")
        main()
    }
    print("Absen: ")
    val absen: String? = input.nextLine()
    println("=======================")
    println(" ")

    println("MENGHITUNG BANGUN RUANG")
    println("1. Volume Balok")
    println("2. Volume Bola")
    print("Masukan Menu Pilihan : ")
    val menu = readLine()

    when (menu) {
        "1" -> {
            println(" ")
            println("Volume Balok")
            print("Masukan Panjang : ")
            val p: Double = input.nextDouble()
            print("Masukan Lebar : ")
            val l: Double = input.nextDouble()
            print("Masukan Tinggi : ")
            val t: Double = input.nextDouble()

            //Menghitung Balok
            val vt: Double = p * l * t;

            //Cetak Hasil
            println(" ")
            println("Volume Balok adalah = $vt ")

            //Kembali Ke Menu
            print("Kembali ke menu [Y/N] : ")
            val next2 = readLine()
            if(next2=="Y" || next2=="y"){
                main()
            }
            else{
                print("Press Enter Key To Exit")
            }

        }
        "2" -> {
            println(" ")
            println("Volume Bola=")
            print("Masukan jari-jari Bola : ")
            val r: Double = input.nextDouble()

            //Menghitung Bola
            val vb: Double = 4/3 * Math.PI * r * r * r;

            //Cetak Hasil
            println(" ")
            println("Volume Bola adalah = $vb ")

            //Kembali Ke Menu
            print("Kembali ke menu [Y/N] : ")
            val next1 = readLine()
            if(next1=="Y" || next1=="y"){
                main()
            }
            else{
                print("Press Enter Key To Exit")
            }

        }
        else-> {
            println("Pilihan Tidak Tersedia")
        }
    }
}