import java.util.Scanner;

public class TinhToan {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số a =");
        double a = scanner.nextInt();
        System.out.println("Nhập số b =");
        double b = scanner.nextInt();

        System.out.println(" các phep tinh cau 2 so a "+a+" va "+b);

        double c=a+b;
        System.out.println("\t tổng của số"+a+"+"+b+"="+c);

        double d= a-b;
        System.out.println("\t hieu cua so "+ a + " - " + b+ " = " + d);

        double e= a*b;
        System.out.println("\t tich cua so "+ a + " x " + b+ " = " + e);

        double f= (double) a/b;
//        System.out.printf("thuong cua so "+ a +" : " +b+ " = %.3f%n",f);
        if(b!=0){
            System.out.printf("\t thuong cua so "+ a +" : " +b+ " = %.3f%n",f);
        }else {
            System.out.printf("\t loi b = 0");
        }

        System.out.println();
        System.out.println(" tinh can bac 2 cua 2 so a "+a+" va "+b);

        // căn bậc 2 so a
        double can2 = Math.sqrt(a);
        System.out.printf("\t  gia tri can bac 2 cua so %.0f = %.3f%n",a, can2);
        double can3 = Math.sqrt(b);
        System.out.printf("\t  gia tri can bac 2 cua so %.0f = %.3f%n",b, can3);

        System.out.println();
        System.out.println(" tinh binh phuong cua 2 so a "+a+" va "+b);

        // binh phuong cac so
        double b2 =Math.pow(a,2);
        System.out.printf("\t  gia tri binh phuong cua so %.1f = %.3f%n",a, b2);
        double b3 =Math.pow(b,2);
        System.out.printf("\t  gia tri binh phuong cua so %.1f = %.3f%n",b, b3);

    }
}
