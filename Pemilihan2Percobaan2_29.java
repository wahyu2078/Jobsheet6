import java.util.Scanner;

public class Pemilihan2Percobaan2_29 {
    public static void main(String[] args) {
        Scanner input29 = new Scanner(System.in);

        float totalSudut;
        System.out.print("Masukkan Sudut 1 = ");
        float sudut1 = input29.nextFloat();
        System.out.print("Masukkan Sudut 2 = ");
        float sudut2 = input29.nextFloat();
        System.out.print("Masukkan Sudut 3 = ");
        float sudut3 = input29.nextFloat();

        totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            else
                System.out.println("Segitiga tersebut adalah bukan segitiga siku-siku");
        } else
            System.out.println("Bukan Segitiga");
    }
}

// oke
