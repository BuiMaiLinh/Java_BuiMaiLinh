import java.util.Scanner;
import java.util.Arrays;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String string1, string2;
        Scanner scanner =new Scanner(System.in);
        System.out.println(" Nhap chuoi string1 tu ban phim: ");
        string1 = scanner.nextLine();
        System.out.println(" \n\t Chuoi string1 vua nhap tu ban phim: "+string1);
        System.out.println(" \t do dai cua chuoi string1 vua nhap la: "+ string1.length());
        System.out.println(" \t do dai ky tu cua chuoi string1 vua nhap la: " + string1.trim().length());

        System.out.println("\n Nhap chuoi string2 tu ban phim: ");
        string2 = scanner.nextLine();
        System.out.println("\t Chuoi string2 vua nhap tu ban phim: "+ string2);

//        boolean index = string1.contains(string2);
//        System.out.println(index);

        int index = string1.indexOf(string2);
        if (index==0){
            System.out.println("\n chuoi 1 chua chuoi 2");
        }else {
            System.out.println("chuoi 1 khong chua chuoi 2");
        }

        int count=0;
        for (int i=0; i<string1.length();i++){
            if ( string1.charAt(i)=='A'){
                count ++;
            }
        }
        System.out.println("\n so lan lap lai cua ky tu A la "+count);

        // cắt chuỗi
        String[] results = string1.split(" ");

        for( String result: results ){
            System.out.println(result);
        }
        System.out.println(" cac tu sau khi tach chuoi la : " + Arrays.toString(results));

        // sdt
        System.out.println(" Nhap so dien thoai cua ban: ");
        String sdt = scanner.nextLine();
        int resultsdt= sdt.trim().length();

        String numberSDT= sdt.substring(0,3);

        if(resultsdt == 10 && Number(sdt) && Numberfirst(sdt)){
            System.out.println(" So dien thoai ban vua nhap la: "+ (sdt.trim()));

            if (numberSDT.equals("035")  || numberSDT.equals("086") || numberSDT.equals("096") || numberSDT.equals("097") ||numberSDT.equals("032" )){
                System.out.println(" so dien thoai cua ban "+ sdt+" la so nha mang Viettel.");
            } else if (numberSDT.equals("091") || numberSDT.equals("094") || numberSDT.equals("088") || numberSDT.equals("085") ||numberSDT.equals("081")) {
                System.out.println(" so dien thoai cua ban "+ sdt+" la so nha mang VinaPhone.");
            }else if (numberSDT.equals("070") || numberSDT.equals("079") || numberSDT.equals("077") || numberSDT.equals("076") ||numberSDT.equals("078")) {
                System.out.println(" so dien thoai cua ban "+ sdt+" la so nha mang MobiFone.");
            }else if (numberSDT.equals("092") || numberSDT.equals("052") || numberSDT.equals("056") || numberSDT.equals("058")) {
                System.out.println(" so dien thoai cua ban "+ sdt+" la so nha mang Vietnamobile.");
            }else if (numberSDT.equals("099") || numberSDT.equals("059")) {
                System.out.println(" so dien thoai cua ban "+ sdt+" la so nha mang Gmobile.");
            }else if (numberSDT.equals("087")) {
                System.out.println(" so dien thoai cua ban "+ sdt+" la so nha mang Itelecom .");
            }else{
                System.out.println("so cua ban khong phai cua nha mang nao");
            }

        }else{
            System.out.println(" Nhap so dien thoai cua ban vua nhap khong phu hop");
        }
//


        if (numberSDT.equals("035")  || numberSDT.equals("086") || numberSDT.equals("096") || numberSDT.equals("097") ||numberSDT.equals("032" )){
            System.out.println(" so dien thoai cua ban "+ sdt+" la so nha mang Viettel.");
        } else if (numberSDT.equals("091") || numberSDT.equals("094") || numberSDT.equals("088") || numberSDT.equals("085") ||numberSDT.equals("081")) {
            System.out.println(" so dien thoai cua ban "+ sdt+" la so nha mang VinaPhone.");
        }else if (numberSDT.equals("070") || numberSDT.equals("079") || numberSDT.equals("077") || numberSDT.equals("076") ||numberSDT.equals("078")) {
            System.out.println(" so dien thoai cua ban "+ sdt+" la so nha mang MobiFone.");
        }else if (numberSDT.equals("092") || numberSDT.equals("052") || numberSDT.equals("056") || numberSDT.equals("058")) {
            System.out.println(" so dien thoai cua ban "+ sdt+" la so nha mang Vietnamobile.");
        }else if (numberSDT.equals("099") || numberSDT.equals("059")) {
            System.out.println(" so dien thoai cua ban "+ sdt+" la so nha mang Gmobile.");
        }else if (numberSDT.equals("087")) {
            System.out.println(" so dien thoai cua ban "+ sdt+" la so nha mang Itelecom .");
        }


        System.out.println(" nhap email cua ban: ");
        String email = scanner.nextLine();
        // ktra email
        if (checkemail(email)){
            System.out.println(" email ban vua nhap la: " + email);
        }else {
            System.out.println(" email ban vua nhap khong hop le");
        }




    }
    public static boolean Number(String str){
        return str.matches("\\\\d+");
    }

    public static boolean Numberfirst(String str){
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)=='0'){
                return true;
            }
        }
        return false;
    }

    public static boolean checkemail(String str) {
        for (int i=0; i<str.length();i++){
            if(str.contains("@") && str.contains("gmail.com") && str.trim().length() >5){
                return true;
            }
        }
        return false;
    }
}