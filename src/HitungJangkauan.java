import java.util.Scanner;

public class HitungJangkauan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arrayJangkauan = new int[50];

        System.out.print("Masukkan data: ");
        for (int i = 0; i < arrayJangkauan.length; i++) {
            arrayJangkauan[i] = input.nextInt();
        }

        nilaiTerbesar(arrayJangkauan);
        nilaiTerkecil(arrayJangkauan);
        jarakJangkauan(arrayJangkauan);
        prosedur(arrayJangkauan);

    }

    public static int nilaiTerbesar(int[] array) {
        int max = 0;
        for (int j : array) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    public static int nilaiTerkecil(int[] array){
        int min = array[0];
        for (int j : array) {
            if (j < min) {
                min = array[j];
            }
        }
        return min;
    }

    public static int jarakJangkauan(int[] array){
        return nilaiTerbesar(array) - nilaiTerkecil(array);
    }

    public static void prosedur(int[] array){
        System.out.print("Nilai terbesar adalah: " + nilaiTerbesar(array));
        System.out.print("\nNilai terkecil adalah: " + nilaiTerkecil(array));
        System.out.print("\nJarak jangkaunya adalah: " + jarakJangkauan(array));
    }
}
