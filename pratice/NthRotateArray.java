public class NthRotateArray {
    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5 };
        int end = array.length - 1;
        System.out.println("before");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int pos = 2;

        Rotate(0, pos, array);
        Rotate(pos, end + 1, array);
        Rotate(0, end, array);
    }

    static void Rotate(int start, int end, int array[]) {
        int m = (start + end) / 2;
        int temp;
        for (int i = start; i < m; i++) {
            temp = array[i];
            array[i] = array[end - 1];
            array[end - 1] = temp;
            // System.out.println("temp "+temp+"\narray[end - i] "+array[end - i]);
        }
        System.out.println("\nafter");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
