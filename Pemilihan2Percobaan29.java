import java.util.Scanner;
/**
 * Pemilihan2Percobaan29
 */
public class Pemilihan2Percobaan29 {

    public static void main(String[] args) {
        Scanner input9 = new Scanner(System.in);
        float sudut1, sudut2, sudut3, totalSudut;
        System.out.print("Masukkan sudut 1 :");
        sudut1 = input9.nextFloat();
        System.out.print("Masukkan sudut 2 :");
        sudut2 = input9.nextFloat();
        System.out.print("Masukkan sudut 3 :");
        sudut3 = input9.nextFloat();
        totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            else if ((sudut1 == sudut2) && (sudut1 == sudut3))
                System.out.println("Segitiga tersebut adalah segitiga sama sisi");
            else if ((sudut1 == sudut2) || (sudut1 == sudut3) || (sudut2 == sudut3))
                System.out.println("Segitiga tersebut adalah segitiga sama kaki");
            else
                System.out.println("Segitiga tersebut adalah segitiga sembarang");
        } else {
            System.out.println("Bukan segitiga");
        }
    }
}