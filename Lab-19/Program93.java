public class Program93 {
    void insert(int a[]){
        int i,j,temp;
        int n = a.length;

        for(i=1;i<n;i++){
            temp=a[i];
            j=i-1;

             while(j>=0 && temp<=a[j]){
                a[j+1]=a[j];
                j=j-1;
             }
             a[j+1]=temp;
        }
    }
    void  printArr(int a[]){
        int i,j;
        int n=a.length;

         for(i=0;i<n;i++){
            System.out.println(a[i]+" ");
         }
    }

    public static  void main(String[] args){
        int a[]={92,50,5,20,11,22};
        Program93 i = new Program93 ();
        System.out.println("Before");
        i.printArr(a);
        i.insert(a);
        System.out.println("After");
        i.printArr(a);
    }
}
