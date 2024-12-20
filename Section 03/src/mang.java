import java.util.Arrays;
import java.util.Scanner;

public class mang {
    public static void main(String[] args) {

        int n;
        int sum =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Nhap so phan tu cua mang n = ");
        n = scanner.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n;i++){
            System.out.println("Nhập vào phần tử thứ " + (i+1) + ": ");
            arr[i] = scanner.nextInt();
        }

        for(int i : arr){
            System.out.println("\n Giá trị phần tử của mảng thứ " + (i+1) + "= "+ i);
            sum +=i;
        }
        System.out.println("Tổng của mảng = "+ sum);

        int max = arr[0];
        for (int i=1;i<arr.length;i++){
            max = Math.max(max, arr[i]);
        }
        System.out.println("\n\nGiá trị lớn nhất là: " + max);

        int min = arr[0];
        for (int i=1;i<arr.length;i++){
            min = Math.min(min, arr[i]);
        }
        System.out.println("\n\nGiá trị lớn nhất là: " + min);

        Arrays.sort(arr);
        System.out.println(" sap xep mang vua nhap: \n");
        for (int i : arr){
            System.out.println("\t"+i);
        }

        int temp = arr[0];
        for ( int i=0; i< arr.length-1; i++){
            for (int j=i+1; j< arr.length; j++){
                if (arr[i]>arr[j]){
                    temp = arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }

        System.out.println(" Mang sap xep tang dan: ");

        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}
