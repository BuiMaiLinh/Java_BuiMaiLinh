import java.util.Scanner;

public class bac2 {
    public static void main(String[] args){
        double a, b, c, x1, x2, x, dental;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so a: ");
        a = scanner.nextDouble();
        System.out.println("Nhap so b: ");
        b = scanner.nextDouble();
        System.out.println("Nhap so c: ");
        c = scanner.nextDouble();

        dental= Math.pow(b,2) - 4*a*c;
        System.out.println(" dental = " +dental);

        if(dental>0){
            x1 = ((-b)+Math.sqrt(dental))/2*a;
            x2 = ((-b)-Math.sqrt(dental))/2*a;
            System.out.println("nghiem x1 = "+ x1);
            System.out.println("nghiem x2 = "+ x2);
        }
        else if (dental==0){
            x=-(b/2*a);
        }else {
            System.out.println(" Phuong trinh vo nghiem");
        }
    }
}
