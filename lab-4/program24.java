import java.util.Scanner;

public class program24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            System.out.println("Enter an element at a["+i+"]: ");
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n-1; i++) {
            int currentMin = arr[i];
            int currentMinIndex = i;

            for(int j=i+1; j<n; j++) {
                if(currentMin>arr[j]) {
                    currentMin = arr[j];
                    currentMinIndex = j;
                }
            }

            if(currentMinIndex!=i) {
                arr[currentMinIndex] = arr[i];
                arr[i] = currentMin;
            }
        }
        System.out.println("Sorted array: ");
        for(int i=0; i<n; i++) {
            System.out.println("a["+i+"]: "+arr[i]);
        }
        System.out.println("Enter a number to delete from the array: ");
        int num = sc.nextInt();
        int[] newArr = new int[n-1];
        int j=0;
        while(j<arr.length && arr[j]<=num) {
            if(arr[j]==num) {
                j++;
                break;
            }
            else {
                newArr[j] = arr[j];
                j++;
            }
        }
        while(j<arr.length) {
            newArr[j-1] = arr[j];
            j++;
        }
        System.out.println("New array: ");
        for(int i=0; i<n-1; i++) {
            System.out.println("a["+i+"]: "+newArr[i]);
        }
        sc.close();
    }
}
