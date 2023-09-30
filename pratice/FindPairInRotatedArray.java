public class FindPairInRotatedArray {
    public static boolean findPair(int[] arr, int x) {
        int n = arr.length;
        int pivot = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i + 1])
            {
                pivot = i + 1;
                  break;
        }
        }
        int left = pivot;
        int right = pivot - 1;
        while(left!=right) {
            if (arr[left] + arr[right] == x) {
                return true;
            }
            else if (arr[left] + arr[right] > x) {
                right = (right - 1 + n) % n;
            }
            else
           left = (left +1) % n;
        }
        return false;
    }
 
    public static void main(String[] args) {
        int[] arr = {11, 15, 6, 8, 9, 10};
        int x = 16;
        System.out.println(findPair(arr, x));
    }
}