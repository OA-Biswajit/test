import java.util.*;
public class ArrayTranspose {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] transpose = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                transpose[j][i] = arr[i][j];
            }
        }
        System.out.println("Original Array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Transpose Array:");
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
            }
        }

        // int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };
        // int temp = 0;
        // int j = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     j++;
        //     for (int k = 0; k < j; k++) {
        //         temp = arr[i][k];
        //         arr[i][k] = arr[k][i];
        //         arr[k][i] = temp;
        //     }
        // }
        // for (int i = 0; i < arr.length; i++) {
        //     for (int k = 0; k < arr.length; k++) {
        //         System.out.print(arr[i][k] + " ");
        //     }
        //     System.out.println();
        // }

    }
}