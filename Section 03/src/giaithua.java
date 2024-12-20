import java.util.Scanner;

public class giaithua {
    public static void main(String[] args) {

        double i , n = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhap so can tinh gia thua i = ");
        i = scanner.nextDouble();

        int count = 1;
        do {
            n *= count;
            count++;
        }while (count <= i );
        System.out.printf(" Kết quả %.0f! = %.3f",i,n);

    }
}