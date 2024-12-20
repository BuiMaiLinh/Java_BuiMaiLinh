import java.util.Scanner;

public class tuoi {
    public static void main(String[] args){
        double tuoi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tuoi: ");
        tuoi = scanner.nextDouble();

        if(tuoi <1){
            System.out.println(" Duoi 1 tuoi duoc phan loai la tre so sinh.");
        }
        else if (tuoi >=1 && tuoi <= 3) {
            System.out.println( tuoi +" tuoi duoc phan loai la em be.");
        } else if (tuoi >3 && tuoi <= 18) {
            System.out.println( tuoi +" tuoi duoc phan loai la tre em.");
        }
        else if (tuoi >18 && tuoi <= 40) {
            System.out.println( tuoi +" tuoi duoc phan loai la nguoi lon.");
        }
        else if (tuoi >40 && tuoi < 60) {
            System.out.println( tuoi +" tuoi duoc phan loai la trung nien.");
        }
        else if (tuoi >= 60) {
            System.out.println( tuoi +" tuoi duoc phan loai la nguoi gia.");
        }

    }
}
