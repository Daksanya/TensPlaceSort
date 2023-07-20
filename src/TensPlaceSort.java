import java.util.Arrays;
import java.util.Scanner;

public class TensPlaceSort {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] array=new int[n];
        for (int i=0;i<n;i++) {
            array[i]=scanner.nextInt();
        }
       sort(array,n);
    }

    static void sort(int[] array,int n){
        int sorted[]=new int[n];
        int max=array[0];
        for (int i=1;i<n;i++) {
            if (array[i]>max) {
                max=array[i];
            }
        }
        int[] count=new int[n];
        Arrays.fill(count, 0);
        for (int i=0;i<n;i++) {
            count[(array[i]/10)%10]++;
        }
        for (int i=1;i<n;i++){
            count[i]+=count[i-1];
        }
        for (int i=0;i<n;i++){
            sorted[count[(array[i]/10)%10]-1]=array[i];
            count[(array[i]/10)%10]--;
        }
        for (int i=0;i<n;i++) {
            System.out.print(sorted[i]+" ");
        }
    }
}
