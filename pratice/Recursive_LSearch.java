public class Recursive_LSearch {
    public static void main(String[] args) {
        int key = 12;
        int arr[] = { 85, 21, 14, 61, 14 };

        Rec(0, arr, key);
    }

    static void Rec(int i, int arr[], int key) {
        if (i == arr.length) {
            System.out.println("not found");
            return;
        } else if (arr[i] == key) {
            System.out.println("found");
            return;
        }

        Rec(++i, arr, key);

    }

}
