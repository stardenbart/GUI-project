import java.lang.reflect.Array;
import java.util.Scanner;

public class DecimalToBinery {
    public static void main(String[] args) {

        int[] array = new int[5];
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan desimal: ");
        int decimal = input.nextInt();

        for(int i = 0; i < array.length; i++){
            array[i] = decimal % 2;
            decimal = decimal / 2;
        }
        try {
            for (int i = 5; i > -1; i--) {
                System.out.print(array[i - 1]);
            }
        }catch (IndexOutOfBoundsException ex){
            System.out.println("Kelewat bates gan.");
        }
    }
}
