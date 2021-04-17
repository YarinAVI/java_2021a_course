package recursion;

public class mirror {
    public static void main(String[] args) {
        int a[] = {5,1,5,3,1,4};
        mirror(a);
    }
    public static void mirror(int a[]) {
        mirror(a,0,a.length-1);
    }
    public static void printArr(int a[],int i) {
        if(i==a.length) {
            System.out.println();
            return;
        }
        System.out.print(a[i]);
        printArr(a,i+1);
    }
    public static void mirror(int a[],int i,int j) {

        if(i>=j) {
            printArr(a,0);
            return;
        }

        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        mirror(a,i+1,j-1);
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        mirror(a,i+1,j-1);

    }
}
