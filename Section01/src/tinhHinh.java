import java.util.Scanner;

public class tinhHinh {
    public static void main(String[] args){

//        double h;
        Scanner so = new Scanner(System.in);
        System.out.println(" nhap do dai canh a =");
        double a = so.nextDouble();
        System.out.println(" nhap do dai canh b =");
        double b = so.nextDouble();
        System.out.println(" nhap do dai canh h =");
        double h = so.nextDouble();
        System.out.println(" nhap do dai bans kinh r =");
        double r = so.nextDouble();

        double Vhinhvuong= a*4;
        double Vhcn= (a+b)*2;
        double Vtamgiacv= a+b+h;
        double Vtron= 2*3.14*r;

        System.out.println("chu vi cac hinh: ");

        System.out.println("\t chu vi hinh vuong co canh a=" +a+ " = " + Vhinhvuong);
        System.out.println("\t chu vi hinh chu nhat co canh a=" +a+ " b="+b+ " = " + Vhcn);
        System.out.println("\t chu vi hinh tam giac vuong co canh a=" +a+ " b="+b+ " h=" +h+ " = " + Vtamgiacv);
        System.out.println("\t chu vi hinh tron co do dai ban kinh r=" +r+ " = " + Vtron + "\\r\\n" );

        System.out.println("dien tich cac hinh: ");
        System.out.println();


        double Shinhvuong= a*a;
        double Shcn= a*b;
        double Stamgiacv= a+b+h;
        double h1 = Math.sqrt(a * a + b * b); // Tính cạnh huyền h1 từ a và b (theo định lý Pythagoras)
        double Stron= r*r*3.14;

        System.out.println("\t dien tich hinh vuong co canh a=" +a+ " = " + Shinhvuong);
        System.out.println("\t dien tich hinh chu nhat co canh a=" +a+ " b="+b+ " = " + Shcn);
        if(h==h1){
            System.out.println("\t dien tich hinh tam giac vuong co canh a=" +a+ " b="+b+ " h=" +h+ " = " + Stamgiacv);

        }else {
            System.out.println("\t cac canh vua nhap khong phai la tam giac vuong ");
        }
        System.out.println("\t dien tich hinh tron co do dai ban kinh r=" + r + " = " + Stron);


    }
}
