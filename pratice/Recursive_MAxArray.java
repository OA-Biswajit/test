public class Recursive_MAxArray {
    public static void main(String[] args) {
        int array[] = { 85, 21, 14, 61, 14 };
        int max = array[0];
        int idx = 0;
        System.out.println(recmax(max, array, idx));
    }

    static int recmax(int max, int array[], int idx) {
        if (array.length == idx)
            return max;
       else if (array[idx] > max)
            max = array[idx];
        return recmax(max, array, ++idx);
    }

}
