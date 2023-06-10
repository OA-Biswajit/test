import java.util.Arrays;

class Chocolate_Distribution_Problem{
    public static void main(String[] args) {
        
         int arr[] = { 12, 4,  7,  9,  2,  23, 25, 41, 30,
                      40, 28, 42, 30, 44, 48, 43, 50 };
 
        int m = 7; // Number of students
 
        int n = arr.length;
        System.out.println("Minimum difference is "
                           + findMinDiff(arr, n, m));
    }
      public static long findMinDiff(int a [],long n,long m){
          Arrays.sort(a);
          Long min=Long.MAX_VALUE;
        for (int i = 0; i + m - 1 < n; i++) {
         min =Math.min( a[(int) (i + m - 1)] - a[i],min);
        }
    return min;
    }
}