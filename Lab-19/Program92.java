public class Program92 {
    static void print(int a[]){
        int n = a.length;
        int i;

        for(i=0;i<n;i++){
            System.out.println(a[i]+"");
        }
    }

    static void BubbleS(int a[]){
        int n = a.length;
        int temp,j;

        for(int i =0;i<n;i++){
            for(j=0;j<n-1;j++){
            if(a[j+1]<a[j]){
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
             }
            }
        }
    }

    public static void main(String[] args) {
        int a[]={10,2,8,78,4};
        Program92 b = new Program92();
        System.out.println("Before");
        b.print(a);
        System.out.println("After");
        b.BubbleS(a);
        b.print(a);
    }

}
