import java.util.Arrays;
import java.util.Scanner;

public class NobleInteger {
    int c=0;
    public static int isNobleInteger(int[] arr, int n) {
        Arrays.sort(arr);
        for(int i =0;i<n-1; i++)
        {
            if(arr[i] == arr[i+1])
                continue;
            if(arr[i] == n-1-i)
                return 1;
        }
        if(arr[n-1] ==0)
            return 1;
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = scanner.nextInt();
        System.out.println(isNobleInteger(arr,n));
    }
}
