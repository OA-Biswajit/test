
public class Find_if_there_is_a_pair_with_a_given_sum_in_the_rotated_sorted_Array {
    public static void main(String[] args) {

        int arr[] = { 11, 15, 6, 8, 9, 10 };
        int X = 16;
        int N = arr.length;
 
        if (pairInSortedRotated(arr, N, X))
            System.out.print("true");
        else
            System.out.print("false");
    
}

private static boolean pairInSortedRotated(int[] arr, int n, int x) {
    // long start = System.nanoTime();
    int i = 0, j = 0;
    
    for (int j2 = 0; j2 < arr.length; j2++) {
        if(arr[j2]>arr[j2+1])
        {
            i = j2;
            j = j2+1;
            break;
        }
    }
    while (i != j) {
        if (arr[i] + arr[j] == x)
            return true;
        else if (arr[i] + arr[j] > x) {
            if (i != 0)
                i--;
            else
                i = arr.length - 1;
        } else if (arr[i] + arr[j] < x)
            if (j != arr.length - 1)
                j++;
            else
                j = 0;
        // long end = System.nanoTime();
        // System.out.println("result="+(end-start));
    }
    
        return false;
    }
}
