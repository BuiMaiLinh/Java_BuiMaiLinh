import java.util.Scanner;

public class lon_nho {
    public static void main(String[] args){
        double a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so a: ");
        a = scanner.nextDouble();
        System.out.println("Nhap so b: ");
        b = scanner.nextDouble();
        System.out.println("Nhap so c: ");
        c = scanner.nextDouble();

//        System.out.printf(" so sanh cac so %.3f va %.3f va %.3f.", a,b,c);
        System.out.println();
//        1 a<b<c
        if (a<b && b<c){
            System.out.printf("TH1 so sanh cac so %.3f < %.3f < %.3f \n", a,b,c);
            System.out.printf("\t so lon nhat trong 3 so la %.3f \n", c);
            System.out.printf("\t so nho nhat trong 3 so la %.3f \n", a);
            //2 a<c<b
        }
        else if (a<c && c<b){
            System.out.printf("TH2 so sanh cac so %.3f < %.3f < %.3f \n", a,c,b);
            System.out.printf("\t so lon nhat trong 3 so la %.3f \n", b);
            System.out.printf("\t so nho nhat trong 3 so la %.3f \n", a);
            //3 b<a<c
        }
        else if (b<a && a<c){
            System.out.printf("TH3 so sanh cac so %.3f < %.3f < %.3f \n", b,a,c);
            System.out.printf("\t  so lon nhat trong 3 so la %.3f \n", c);
            System.out.printf("\t  so nho nhat trong 3 so la %.3f \n", b);
            //4 b<c<a
        }
        else if (b<c && c<a){
            System.out.printf("TH4 so sanh cac so %.3f < %.3f < %.3f \n", b,c,a);
            System.out.printf("\t  so lon nhat trong 3 so la %.3f \n", a);
            System.out.printf("\t  so nho nhat trong 3 so la %.3f \n", b);
            //5 c<a<b
        }
        else if (c<a && a<b){
            System.out.printf("TH5 so sanh cac so %.3f < %.3f < %.3f \n", c,a,b);
            System.out.printf("\t  so lon nhat trong 3 so la %.3f \n", b);
            System.out.printf("\t  so nho nhat trong 3 so la %.3f \n", c);
            //6 c<b<a
        }
        else if (c<b && b<a){
            System.out.printf("TH6 so sanh cac so %.3f < %.3f < %.3f \n", c,b,a);
            System.out.printf("\t  so lon nhat trong 3 so la %.3f \n", a);
            System.out.printf("\t  so nho nhat trong 3 so la %.3f \n", c);

        }



    }
}
