package basic.aritmatika;

public class OperasiAritmatika {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;

        // Operasi dasar
        System.out.println("Penjumlahan: " + (a + b));
        System.out.println("Pengurangan: " + (a - b));
        System.out.println("Perkalian: " + (a * b));
        System.out.println("Pembagian: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Operator penugasan
        int c = 5;
        c += 10;
        System.out.println("Nilai c setelah += 10: " + c);
    }
}

