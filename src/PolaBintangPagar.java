import java.util.Scanner;

public class PolaBintangPagar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan input: ");
        int n = input.nextInt();

        if(n <= 0){
            System.out.println("inputan salah.");
        }else{
            for(int i = 0; i < n; i++){
                for (int j = 0;j < n; j++){
                    if(i % 2 == 0){
                        if(j % 2 == 0){
                            System.out.print("*");
                        }else {
                            System.out.print("#");
                        }
                    }else{
                        if(j%2==0){
                            System.out.print("#");
                        }else {
                            System.out.print("*");
                        }
                    }
                }
                System.out.println();
            }
        }
        System.out.println("\nAkhir Program.");
    }
}
