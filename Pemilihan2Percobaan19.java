import java.util.Scanner;

/**
 * Pemilihan2Percobaan19
 */
public class Pemilihan2Percobaan19 {

    public static void main(String[] args) {
        Scanner input9 = new Scanner(System.in);
        int tahun;
        System.out.println("Masukkan tahun");
        tahun = input9.nextInt();
        if (tahun % 4 == 0) {
            if (tahun % 100 == 0) {
                if (tahun % 400 == 0) {
                    System.out.println("Tahun kabisat");
                } else {
                    System.out.println("Bukan Tahun Kabisat");
                }
            } else {
                System.out.println("Tahun kabisat");
            }
        } else {
            System.out.println("Bukan Tahun Kabisat");
        }
        
    }
}
