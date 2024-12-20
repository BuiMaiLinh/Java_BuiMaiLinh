import java.util.Scanner;

public class tra_loi {
    public static void main(String[] args){

        System.out.println(" Ban o dau?");
        System.out.println(" 1. Hà Nội");
        System.out.println(" 2. Hòa Bình");
        System.out.println(" 3. Ninh Bình");
        System.out.println(" 4. Đà Nẵng");

        Scanner scanner = new Scanner(System.in);
        System.out.println("cau tra loi cua ban: ");
        int answer= scanner.nextInt();
        System.out.println();

        switch (answer){
            case 1:
                System.out.println(" 1. Hà Nội");
                break;
            case 2:
                System.out.println(" 2. Hòa Bình");
                break;
            case 3:
                System.out.println(" 3. Ninh Bình");
                break;
            case 4:
                System.out.println(" 4. Đà Nẵng");
                break;
        }

    }
}
